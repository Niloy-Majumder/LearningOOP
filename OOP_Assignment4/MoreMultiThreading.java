// dinning philosophers problem with three philosopher

class Messeger extends Thread {
    final String id;
    final Thread t;
    private int i = 0;

    Messeger(String id) {
        this.id = id;
        t = new Thread(this, id);
    }

    public void showmessage() {
        System.out.print("message from " +id);
        System.out.println("-> "+i++ + " hi ");
    }

    public void run() {
        while (true) {
            showmessage();
            try {
                Thread.sleep(id.length()*100);
            } catch (Exception e) {
                System.out.println(e );
            }

        }
    }
}

public class MoreMultiThreading {
    public static void main(String[] args) {
        
        Messeger p1, p2, p3;
        p1 = new Messeger("logger");
        p2 = new Messeger("error");
        p3 = new Messeger("message");

        System.out.println("press ctrl+c to end all this");

        p1.t.start();
        p2.t.start();
        p3.t.start();

    }
}
