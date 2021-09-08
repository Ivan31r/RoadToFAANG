package Algorithms.reverseString;

public class ReverseString {
    public static String MESSAGE = "Income line = %s, output line = %s\n";

    public static void main(String[] args) {
        reverseString("1Bob");
    }

    public static void reverseString(String line) {
        char[] var = line.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = var.length - 1; i >= 0; i--) {
            stringBuilder.append(var[i]);
        }
        System.out.printf(MESSAGE, line, stringBuilder.toString());
    }
}
