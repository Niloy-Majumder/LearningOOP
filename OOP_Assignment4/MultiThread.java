import java.util.Random;


//producer consumer problem with single item queue


class SingleItemQ {
    private int data;
    private boolean consumed = false;

    private final Random rand;

    SingleItemQ() {
        rand = new Random();
        data = 0;
    }

    boolean isConsumed() {
        return consumed;
    }

    void setConsumed(boolean val) {
        consumed = val;
    }

    // consuming
    synchronized int getData() {

        while (consumed) {
            System.out.println("consumer waiting");
            try {
                wait();
            } catch (Exception e) {
                System.out.println("error! consumer intrupted\n" + e.getMessage());
            }
        }
        //sleep the consumer thread
        try {
            Thread.sleep(500); 
        } catch (Exception e) {
            System.out.println(e);
        }
        consumed = true;
        notify();
        return data;
    }

    // producer
    synchronized int setData() {
        while (!consumed) {
            System.out.println("producer waiting");
            try {
                wait();
            } catch (Exception e) {
                System.out.println("error! producer intrupted");
            }
        }
        //sleep the producer thread
        try {
            Thread.sleep(1000); 
        } catch (Exception e) {
            System.out.println(e);
        }
        
        data = data + 1;
        consumed = false;
        notify();
        return data;
    }

}

class Consumer implements Runnable {
    SingleItemQ q;
    public final Thread t = new Thread(this, "consumer");

    Consumer(SingleItemQ q) {
        this.q = q;
    }

    synchronized public void consume() {
        System.out.println("consumed " + q.getData());

    }

    public void run() {
        while (true) {
            consume();
        }
    }
}

class Producer implements Runnable {
    SingleItemQ q;
    public final Thread t = new Thread(this, "Producer");

    Producer(SingleItemQ q) {
        this.q = q;
    }

    synchronized public void produce() {

        System.out.println("produced " + q.setData());

    }

    public void run() {
        while (true) {
            produce();
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        SingleItemQ q = new SingleItemQ();
        Consumer cosumer = new Consumer(q);
        Producer producer = new Producer(q);

        System.out.println("press ctrl+c to end all this");

        cosumer.t.start();
        producer.t.start();

    }
}
