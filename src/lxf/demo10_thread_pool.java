package lxf;


import java.util.concurrent.*;

public class demo10_thread_pool {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(4);
//        for (int i = 0; i < 6; i++) {
//            es.submit(new Task("" + i));
//        }
//        es.shutdown();

        int min = 4;
        int max = 10;
        ExecutorService es2 =  new ThreadPoolExecutor(min, max, 60L,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for (int i = 0; i < 20; i++) {
            es2.submit(new Task("" + i));
        }
        es2.shutdown();

    }

    static class Task implements Runnable {
        private final String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("start task" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end task" + name);
        }
    }

}
