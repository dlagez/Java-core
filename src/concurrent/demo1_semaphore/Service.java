package concurrent.demo1_semaphore;

import java.util.concurrent.Semaphore;

public class Service {

    // 表示同一时间内，最多允许多少个线程同时执行acquire()和release() 之间的代码
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            // acquire()方法的作用是使用1个许可
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
