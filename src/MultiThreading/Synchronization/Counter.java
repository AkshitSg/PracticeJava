package MultiThreading.Synchronization;

public class Counter {
    private int count=0;

    // synchronized method
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public int getCount(){
        return count;
    }

}
