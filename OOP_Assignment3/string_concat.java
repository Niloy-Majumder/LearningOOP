public class string_concat {
    
    static void method1( String hi, String mom){
        // 1st Method:
        hi=hi.concat(", ").concat(mom);
        System.out.println(hi);
    }
    static void method2( String hi, String mom){
        // 2nd Method:
        
        String concat= hi +", "+ mom;
        System.out.println(concat);
    }

    public static void main(String[] args) {
        String hi= "Hi";
        String mom="Mom";

        method1(hi,mom);
        method2(hi, mom);
    }
}
