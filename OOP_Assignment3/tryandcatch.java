import java.util.Scanner;
public class tryandcatch {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 2 numbers to Divide: ");
            a= sc.nextInt();
            b= sc.nextInt();
            
        }
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero is Undefined");
        }
    }
}
