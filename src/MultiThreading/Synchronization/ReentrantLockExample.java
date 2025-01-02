package MultiThreading.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock rlock=new ReentrantLock(true); // ReentrantLock(true)-makes this lock fair in the order threads acquire it.

    public void outerMethod(){
        rlock.lock();                                           // outer method acquiring lock.
        try{
            System.out.println("Outer method invoked.");
            innerMethod();                                     // outer method calling inner method.
        }finally {
            rlock.unlock(); // unlocking
        }
    }
    public void innerMethod(){
        rlock.lock();                                      // inner method again acquiring lock which is already acquired.
        try{                                               // since the lock is reentrant it is possible because it can be entered again.
            System.out.println("Inner method invoked.");   // otherwise it would have cause problem of deadlock.
        }finally {                                         // deadlock-> Thread-1 waiting for Thread-2, Thread-2 is waiting for Thread-1
            rlock.unlock();                                // here main thread would be waiting for main thread itself.
        }
    }

    public static void main(String[] args) {

        ReentrantLockExample example=new ReentrantLockExample();   // instantiating class
        example.outerMethod();                                     // class instance calling instance method outer.
    }
}
