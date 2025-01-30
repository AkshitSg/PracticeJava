package MultiThreading.Synchronization;

class ShareResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data=value;
        hasData=true;
        System.out.println("Produced: "+value);
        notify();
    }
    public synchronized int consume(){
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasData=false;
        System.out.println("Consumed: "+data);
        notify();
        return data;
    }

}

class Producer implements Runnable{

    private ShareResource resource;
    Producer(ShareResource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable{
    private ShareResource resource;

    Consumer(ShareResource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {

        ShareResource resource=new ShareResource();

        Thread producerThread=new Thread(new Producer(resource),"producer");
        Thread consumerThread=new Thread(new Consumer(resource),"producer");

        producerThread.start();
        consumerThread.start();
    }
}
