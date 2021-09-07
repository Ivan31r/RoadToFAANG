package Algorithms.integerPalindrome;

public class IntegerPalindrome {
    public static void main(String[] args) {
        isIntegerPalindrome(1234);
    }
    public static void isIntegerPalindrome(int number){
        StringBuilder result = new StringBuilder();
        while (true){
            int lastNumber = number%10;
            int newNumber = number/10;
            if (newNumber<=10)
                break;
            result.append(lastNumber);
        }
        System.out.println(result.toString());
    }
}
