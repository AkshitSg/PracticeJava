package MultiThreading.Synchronization;

class Pen{
    public synchronized void  writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" has pen and is trying to acquire paper to write.");
        paper.finishedWriting();
    }
    public synchronized void finishedWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing using pen."+this);
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" has paper and is trying to acquire pen to write.");
        pen.finishedWriting();
    }
    public synchronized void finishedWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing using paper."+this);
    }
}

class Task1 implements Runnable{

    private Pen pen=new Pen();
    private Paper paper=new Paper();
    public Task1(Pen pen, Paper paper){
        this.pen=pen;
        this.paper=paper;
    }
    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // Thread1 locks pen and tries to acquire paper.
    }
}
class Task2 implements Runnable{

    private Paper paper=new Paper();
    private Pen pen=new Pen();
    public Task2(Pen pen, Paper paper){
        this.pen=pen;
        this.paper=paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writeWithPaperAndPen(pen); // Thread2 locks paper and tries to acquire pen.
        }

    }
}

public class DeadlockExample {
    public static void main(String[] args) {

        Paper paper=new Paper();
        Pen pen=new Pen();

        Thread thread1=new Thread(new Task1(pen,paper),"Thread-1");
        Thread thread2=new Thread(new Task2(pen,paper),"Thread-2");

        thread1.start();
        thread2.start();
    }
}
