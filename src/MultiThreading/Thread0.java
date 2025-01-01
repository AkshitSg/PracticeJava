package MultiThreading;

public class Thread0 extends Thread{
    @Override
    public void run() {
        for ( ; ;) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
