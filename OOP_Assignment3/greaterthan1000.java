import java.util.Scanner;

public class greaterthan1000 {
    static void meth1(int a) throws Exception{
        if (a>1000) {
            throw new Exception();
        }
        else{
            System.out.println("You entered: "+ a);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            try {
                meth1(a);
            } catch (Exception e) {
                System.out.println("Give a number below 1000");
            }
        }
    }
}
