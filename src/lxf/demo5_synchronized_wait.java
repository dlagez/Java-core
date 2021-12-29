package lxf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class demo5_synchronized_wait {
    public static void main(String[] args) throws InterruptedException {
        TaskQueue taskQueue = new TaskQueue();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            String s = taskQueue.getTask(); // 由于现在没有task，都在wait状态
                            System.out.println("execute task: " + s);
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                }
            };
            thread.start();
            threads.add(thread);
        }

        Thread add = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String s = "t-" + Math.random();
                System.out.println("add task" + s);
                taskQueue.addTask(s);  // 添加了一个之后，执行this.notifyAll();方法，等待的线程中的一个拿到了taskQueue方法
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        add.start();
        add.join(); // 等待add执行完成
        Thread.sleep(100);
        for (Thread thread : threads) {
            thread.interrupt();  // 将threads里面的线程都关闭
        }
    }


    static class TaskQueue {
        Queue<String> queue = new LinkedList<>();

        public synchronized void addTask(String s) {
            this.queue.add(s);
            this.notifyAll();
        }

        public synchronized String getTask() throws InterruptedException {
            while (queue.isEmpty()) {
                this.wait();
            }
            return queue.remove();
        }
    }
}
