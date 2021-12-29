package design_patterns.Demo4_LazySimpleSingleton;

public class test_LazySimpleSingleton {
    // 饿汉单例模式可能会出现线程安全问题
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
