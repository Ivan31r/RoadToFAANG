package Algorithms.armstrongNumber;

public class ArmstrongNumber {
    public static void main(String[] args) {
        armstrong(123);
        armstrong(153);
    }

    public static void armstrong(int number) {
        String tempVar = String.valueOf(number);
        int sumOfCubeOfNumber = 0;
        for (int i = 0; i < tempVar.length(); i++) {
            int a = (int) Math.pow(Integer.parseInt(String.valueOf(tempVar.charAt(i))), 3);
            sumOfCubeOfNumber += a;
        }
        System.out.println("income number = " + number + " , output number = " + sumOfCubeOfNumber + " , is armstrong number ? " + (number == sumOfCubeOfNumber));
    }
}
