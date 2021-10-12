package concurrent.demo2_semaphore.demo1_semaphore;

public class ThreadC extends Thread{

    private Service service;

    public ThreadC (Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
