package Algorithms.deadlock;

public class Deadlock {
    public static final Object object1 = new Object();
    public static final Object object2 = new Object();

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            new Thread(() -> {
                synchronized (object1) {
                    System.out.println("Take object1 from thread1");
                    synchronized (object2) {
                        System.out.println("Take object2 from thread1");
                    }
                }
            }).start();

            new Thread(() -> {
                synchronized (object1) {
                    System.out.println("Take object1 from thread2");
                    synchronized (object2) {
                        System.out.println("Take object2 from thread2");
                    }
                }
            }).start();
        }

    }
}
