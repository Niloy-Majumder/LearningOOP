public class finallyblock {
    public static void main(String[] args) {
        int a=5,b=-5;
        int c=0;
        try {
            c=a/b;            
            if (c==-1) {
                throw new Exception();
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Error Occured");
        }
        finally{
            System.out.println(c);
        }
    }
}
