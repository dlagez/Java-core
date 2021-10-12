package design_patterns.Demo3_LazySimpleSingleton;

public class Demo_test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("End!");
    }
}
