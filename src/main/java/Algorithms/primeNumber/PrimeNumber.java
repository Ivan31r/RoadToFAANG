package Algorithms.primeNumber;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        findAndPrintPrimeNumbersV1(13);
        findAndPrintPrimeNumbersV1(5);
        findAndPrintPrimeNumbersV1(4);
        findAndPrintPrimeNumbersV1(10);
        findAndPrintPrimeNumbersV1(25);
        findAndPrintPrimeNumbersV1(1);
        findAndPrintPrimeNumbersV1(17);
        findAndPrintPrimeNumbersV1(44);
        findAndPrintPrimeNumbersV1(50);
        findAndPrintPrimeNumbersV1(7);
    }

    public static void findAndPrintPrimeNumbersV1(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("It's a prime number : " + number);
        } else {
            System.out.println("Not a prime number : " + number);
        }

    }


    public static void findAndPrintPrimeNumbersV2(int number) {

    }
}
