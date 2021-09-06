package Algorithms.fibonacciSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        printFibonacciV1(10);
        System.out.println("\n----------------------");
        printFibonacciV2(10);
        System.out.println("\n----------------------");
        printFibonacciV3(10);
    }

    public static void printFibonacciV1(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int result;
        for (int i = 0; i < number; i++) {
            result = firstNumber;
            System.out.print(result + " ");
            firstNumber = firstNumber + secondNumber;
            secondNumber = result;
        }
    }

    public static void printFibonacciV2(int number) {
        List<Integer> sequence = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 1; i < number - 1; i++) {
            sequence.add(sequence.get(i) + sequence.get(i - 1));
        }
        sequence.forEach(x -> System.out.print(x + " "));
    }

    public static void printFibonacciV3(int number) {
        Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1],ints[0]+ints[1]}).limit(number).map(n->n[0]).forEach(n->System.out.print(n + " "));
    }

}