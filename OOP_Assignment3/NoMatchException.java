import java.util.Scanner;

public class NoMatchException extends Exception {
    public String toString(){
        return new String("Don't Lie");
    }
}

/**
 * InnerNoMatchException
 */
class InnerNoMatchException {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Country");
            String str= sc.nextLine();
            if (!str.equals("India")) {
                throw new NoMatchException();
            }
            else{
                System.out.println("Jai Hind!");
            }
        }
        catch(NoMatchException e){
            System.out.println(e);
        }
                
    }    
}
