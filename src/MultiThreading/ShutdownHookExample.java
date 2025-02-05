package MultiThreading;

public class ShutdownHookExample {
    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(){ // setting shutdown trigger and a thread that will run on shutdown.
            public void run(){
                System.out.println("performing cleanup activities");
            }
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
