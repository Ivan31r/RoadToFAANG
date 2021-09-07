package Algorithms.integerPalindrome;

public class IntegerPalindrome {
    public static void main(String[] args) {
        System.out.println(isIntegerPalindrome(1111));
    }

    public static boolean isIntegerPalindrome(int number) {
        System.out.println("income Number = " + number);
        return number == invertNumber(number);
    }

    private static int invertNumber(int number) {
        StringBuilder result = new StringBuilder();
        int lastNumber;
        int tempNumber = number;
        while (tempNumber > 0) {
            lastNumber = tempNumber % 10;
            result.append(lastNumber);
            tempNumber = tempNumber / 10;
        }
        System.out.println("outPut number = " + result);
        return Integer.parseInt(result.toString());
    }
}
