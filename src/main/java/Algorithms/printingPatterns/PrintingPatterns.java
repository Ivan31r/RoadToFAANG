package Algorithms.printingPatterns;

public class PrintingPatterns {
    public static void main(String[] args) {
        printPattern(10);
    }
    public static void printPattern(int level){
        for(int i =0;i<=level;i++){
            for (int j = 0; j < level-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
