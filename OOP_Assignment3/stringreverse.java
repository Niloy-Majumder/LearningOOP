import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.nextLine();
            StringBuffer B= new StringBuffer(A);
            System.out.println(B.reverse());
        }
    }
}
