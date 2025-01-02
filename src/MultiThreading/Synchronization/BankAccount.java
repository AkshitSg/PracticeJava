package MultiThreading.Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=1000;

    Lock lock=new ReentrantLock(); // creating instance of ReentrantLock class to use Explicit (custom) locks.
    public  void  withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is trying to withdraw amount: "+amount);
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)){ //Acquires the lock if it is free within the given waiting time and the current thread has not been interrupted.
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+"proceeding with withdraw.");
                        Thread.sleep(10000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+" withdraw "+amount+" remaining balance:"+balance);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" couldn't withdraw because of insufficient balance.");
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" could not acquire lock.");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
