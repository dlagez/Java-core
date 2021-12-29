package design_patterns.Demo4_LazySimpleSingleton;

/**
 * 使用线程执行懒汉单例模式
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
