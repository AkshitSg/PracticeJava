package MultiThreading;

public class MainThread {
    public static void main(String[] args) { // When we run main method a main thread is started always.

        Thread0 t0=new Thread0(); // instantiate Thread0 class which extends Thread class.
        t0.start(); // starting thread-0

        for ( ; ; ) {
            System.out.println(Thread.currentThread().getName()); // printing main thread.
        }
    }
}
