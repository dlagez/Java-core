package lxf;

public class HelloThread extends Thread {
    public volatile boolean running = true;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + " Hello!");
        }
        System.out.println("end!");
    }
}
