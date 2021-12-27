import superInteger.SuperInteger;

public class packageExample {
    public static void main(String[] args) {
        SuperInteger superInteger = new SuperInteger();
        superInteger.set(5);
        
        System.out.println("no of digit is: "+superInteger.noOfDigits());
        

        System.out.print(superInteger.get()+" ");
        if(superInteger.isEven())
        System.out.println("is divisible by 2");
        else System.out.println("is not divisible by 2");

        System.out.print(superInteger.get()+" ");
        if(superInteger.isNegetive())
        System.out.println("is Negetive");
        else System.out.println("is Positive");

        System.out.println("this can be sent to network: "+superInteger.serealize());


    }
}
