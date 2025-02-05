package MultiThreading.Synchronization;


public class StaticSynchronization {

    public static int count=0;
    public static void  increment(){
        synchronized (Counter.class){
            count++;
            System.out.println("incremented "+count);
        }
    }
    public static void decrement(){
        synchronized (Counter.class) {
            count--;
            System.out.println("decremented "+count);
        }
    }

    public static synchronized int getCount(){
        return count;
    }

    public static void main(String[] args) {


        Thread increment=new Thread(){
            public void run(){
                for (int i = 0; i <5 ; i++) {
                    increment();
                }
            }
        };

        Thread decrement=new Thread(){
            public void run(){
                for (int i = 0; i <5 ; i++) {
                    decrement();
                }

            }
        };

        increment.start();
        decrement.start();
        try {
            increment.join();
            decrement.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final count:"+getCount());
    }
}
