package lxf;

public class demo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("start new Thread!");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("start new Runnable!");
        }
    }
}
