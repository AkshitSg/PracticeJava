package MultiThreading.Synchronization;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                account.withdraw(500);
            }
        };

        Thread t1=new Thread(task,"Thread-1");
        Thread t2=new Thread(task,"Thread-2");

        t1.start();
        t2.start();
    }
}
