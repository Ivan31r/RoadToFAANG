package Algorithms.factorial;

import java.util.function.*;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.printf("Factorial of %d is %d\n", number, findFactorialV1(number));
        System.out.printf("Factorial of %d is %d", number, findFactorialV2(number));

    }

    public static long findFactorialV1(int number) {
        if (number == 1) {
            return 1;
        }
        return number * (findFactorialV1(number - 1));
    }

    public static long findFactorialV2(int number) {
        return IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
    }
}
