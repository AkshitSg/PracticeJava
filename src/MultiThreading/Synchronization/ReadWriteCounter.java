package MultiThreading.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

    private int count=0;
    private final ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private final Lock writeLock= readWriteLock.writeLock();
    private final Lock readLock= readWriteLock.readLock();

    private void incrementCount(){
        writeLock.lock();
        try{
            count++;
        }finally {
            writeLock.unlock();
        }
    }
    private int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteCounter counter=new ReadWriteCounter();

        Runnable readTask=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" read: "+counter.getCount());
                }
            }
        };
        Runnable writeTask=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    counter.incrementCount();
                    System.out.println(Thread.currentThread().getName()+"incremented.");
                }
            }
        };

        Thread writeThread=new Thread(writeTask,"writeThread");
        Thread readThread1=new Thread(readTask,"readThread1");
        Thread readThread2=new Thread(readTask,"readThread2");

        writeThread.start();
        readThread1.start();
        readThread2.start();

        try {
            writeThread.join();
            readThread1.join();
            readThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final count: "+counter.getCount());
    }
}
