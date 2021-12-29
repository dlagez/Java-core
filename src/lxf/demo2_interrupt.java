package lxf;

public class demo2_interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            Thread hello = new HelloThread();
            hello.start();
            try {
                hello.join();  // 等待hello线程结束
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            hello.interrupt();
        }
    }

    static class HelloThread extends Thread {
        @Override
        public void run() {
            int n = 0;
            while (!isInterrupted()) {
                n++;
                System.out.println(n + " Hello!");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
