public class stringcompare {
    public static void main(String[] args) {
        String A= "I am a Student";
        String B= "I AM A STUDENT";

        System.out.println(A);
        System.out.println(B+"\n");

        System.out.println("Without Ignore Case:");
        
        if (A.equals(B)) {
            System.out.println(" They are Equal \n");
        }
        else{
            System.out.println(" They are Not Equal \n");
        }
        
        System.out.println("With Ignore Case:");
        
        if (A.equalsIgnoreCase(B)) {
            System.out.println(" They are Equal\n");
        }
        else{
            System.out.println(" They are Not Equal \n");
        }
        
    }
}
