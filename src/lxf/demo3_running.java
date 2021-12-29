package lxf;


public class demo3_running {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new HelloThread();
        t.start();
        Thread.sleep(1);
//        t.running(false);
    }
}
