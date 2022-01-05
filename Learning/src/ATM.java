public class ATM {
    synchronized void checkBalance(String name,int balance){
        System.out.println("Your balance is Rs. "+balance+" Mr."+name);
    }
    synchronized void withDraw(String name){
        System.out.println("You cannot Withdraw Mr."+name);
    }
}

class Consumer extends Thread {
    ATM A;
    String name;
    int amount;
    Consumer(ATM B,String name,int amount){
        this.A= B;
        this.name=name;
        this.amount=amount;
    }
    synchronized void useATM(){
        A.checkBalance(name, amount);
        A.withDraw(name);
    }
    public void run(){
        useATM();
    }
    
}
class Driver{
    public static void main(String[] args) {
        ATM A= new ATM();
        Consumer c1= new Consumer(A, "Arnab", 10000);
        Consumer c2= new Consumer(A, "Alquama", 50000);
        Consumer c3= new Consumer(A, "Animesh", 5488888);
        c1.start();
        c2.start();
        c3.start();
    }
}