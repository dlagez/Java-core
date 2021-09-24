package Demo3_LazySimpleSingleton;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
