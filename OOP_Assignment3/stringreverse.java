import java.util.Arrays;
import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.nextLine();
            char[] B= A.toCharArray();
            Arrays.sort(B);
            String str = new String(B);
            System.out.println(str);
        }
    }
}
