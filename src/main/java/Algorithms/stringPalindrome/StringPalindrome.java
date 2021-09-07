package Algorithms.stringPalindrome;

import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPalindrome {
    public static String MESSAGE = "Income line = %s, output line = %s\n";

    public static void main(String[] args) {

        System.out.println("isPalindrome1");

        System.out.println(isPalindromeV1("Bob1"));
        System.out.println(isPalindromeV1("Bob"));

        System.out.println("isPalindrome2");

        System.out.println(isPalindromeV2("Bob"));
        System.out.println(isPalindromeV2("Bob1"));

        System.out.println("isPalindrome3");

        System.out.println(isPalindromeV3("BOB11"));
        System.out.println(isPalindromeV3("BOB"));

    }

    public static boolean isPalindromeV1(String line) {
        StringBuilder reversString = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            reversString.append(line.charAt(i));
        }
        System.out.printf(MESSAGE,line,reversString);
        return line.equalsIgnoreCase(reversString.toString());
    }

    public static boolean isPalindromeV2(String line) {
        // TODO: 06.09.2021 подсмотрел
        String reversString = Stream.of(line).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(""));
        System.out.printf(MESSAGE,line,reversString);
        return line.equalsIgnoreCase(reversString);
    }

    public static boolean isPalindromeV3(String line) {
        String revertString = findRevertString(line);
        System.out.printf(MESSAGE,line,revertString);
        return revertString.equalsIgnoreCase(line);

    }

    private static String findRevertString(String line) {
        if (line.length() == 0) {
            return "";
        }
        String newLine = line.substring(0, line.length() - 1);
        return line.charAt(line.length() - 1) + findRevertString(newLine);
    }
}
