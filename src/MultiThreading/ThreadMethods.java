package MultiThreading;

public class ThreadMethods extends Thread{

    ThreadMethods(String name){
        super(name);
    }

    @Override
    public void run() { // 2. run()- overridden method contains code you want to execute on running this thread.
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(1000); // 3. sleep()- suspends execution of current thread for specified time.

                Thread.yield(); // 7. yield()- A hint to the scheduler that the current thread is willing to yield its current use of a processor.
                                            // The scheduler is free to ignore this hint. (scheduler can give chane to another thread.)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods myThread=new ThreadMethods("myThread");

        myThread.setDaemon(true); // 8. setDaemon(true)- Marks this thread as either a daemon thread or a user thread.
                                  // The Java Virtual Machine exits when the only threads running are all daemon threads.
                                  // This method must be invoked before the thread is started

        myThread.start(); // 1. start()- on execution os start()JVM starts run() method of Thread class.

        myThread.join(); // 4. join()- waits for this thread to finish execution.

        myThread.setPriority(MIN_PRIORITY); // 5. setPriority()- sets priority of thread from Low:1 to High:10.

        myThread.interrupt(); // 6. interrupt()- interrupts this thread.


    }
}
