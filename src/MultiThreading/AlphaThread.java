package MultiThreading;

public class AlphaThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("at");
        System.out.println(Thread.currentThread().getName()+": "+Thread.currentThread().getState()); // at: RUNNABLE
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName()+": "+Thread.currentThread().getState()+" (means running)"); // Main: RUNNABLE (means running).

        AlphaThread at=new AlphaThread();
        System.out.println("at: "+at.getState()); // at: NEW
        at.start();
        Thread.sleep(300);
        System.out.println("at: "+at.getState()); // at: TIMED_WAITING
        at.join();
        System.out.println("at: "+at.getState()); // at: TERMINATED

        System.out.println("main stopping");

    }
}
