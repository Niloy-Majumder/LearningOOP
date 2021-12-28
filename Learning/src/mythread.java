public class mythread extends Thread {
    public void run() {
        int i=0;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
        
    }
    public static void main(String[] args) {
        mythread myt= new mythread();
        myt.start();
        int i=0;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }

}
