package Algorithms.removeDuplicatesFromAnArray;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        // TODO: 09.09.2021 хотел сделать на дженериках,но увы (в следующий раз)ф. Массив интов тож сойдет =)
        // TODO И обнулять значения наверно не ок, но другого маркера для конца цикла не придумал

        int[] arrayWithDuplicates = new int[]{1, 3, 5, 3, 1, 7, 8, 4, 1};
        System.out.println(Arrays.toString(arrayWithDuplicates));

        int[] arrayWithUniqueValue = removeDuplicates(arrayWithDuplicates);
        System.out.println(Arrays.toString(arrayWithUniqueValue));

    }

    public static int[] removeDuplicates(int[] lineArr) {
        boolean wasMove = false;
        int counter = 1;
        for (int i = 0; i < lineArr.length - 1; ) {
            if (lineArr[i] == 0) break;
            for (int j = i; j < lineArr.length - 1; j++) {
                if (lineArr[i] == lineArr[j + 1]) {
                    remove(lineArr, i, lineArr.length - i, counter);
                    counter++;
                    wasMove = true;
                    break;
                }
            }
            if (wasMove) {
                i = 0;
                wasMove = false;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(lineArr, lineArr.length - counter);
    }

    private static void remove(int[] lineArr, int fromThisPosition, int i, int counter) {
        for (int j = fromThisPosition; j < i - 1; j++) {
            lineArr[j] = lineArr[j + 1];
        }
        lineArr[lineArr.length - counter] = 0;
    }
}
