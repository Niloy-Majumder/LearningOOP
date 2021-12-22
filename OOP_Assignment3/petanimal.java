import java.util.Iterator;
import java.util.Vector;

public class petanimal {
    public static void main(String[] args) {
        // Vector<String> v= new Vector<String>();
        // v.add("abc");
        // Iterator<String> it =v.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        try {
            Vector v= new Vector();
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("donkey")) {
                    throw new Exception();
                }
                v.add(args[i]);
            }
            System.out.println(v);
            
        } catch (Exception e) {
            System.out.println("You cannot have a donkey as Pet");
        }
        
    }
}
