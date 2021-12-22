public class throwsandthrow {
    
    static void meth1(int a, int b) throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException("Cannot divide by Zero");
        }
        else{
            System.out.println(a/b);
        }
    }
    static void meth2(int a, int b){
        try {
            meth1(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        int a=5,b=2,c=0;
        meth2(a, b);
        meth2(a, c);
    }
}
