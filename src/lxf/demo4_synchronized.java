package lxf;

public class demo4_synchronized {
    public static void main(String[] args) throws InterruptedException {
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }

    static class Counter {
        public static final Object lock = new Object();
        public static int count = 0;
    }

    static class AddThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                synchronized (Counter.lock) {
                    Counter.count += 1;
                }
            }
        }
    }

    static class DecThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                synchronized (Counter.lock) {
                    Counter.count -= 1;
                }
            }
        }
    }
}
