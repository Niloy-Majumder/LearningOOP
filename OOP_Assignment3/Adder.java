public class Adder {
    public static void main(String[] args) {
        if (args.length==1) {
            System.out.println("Cannot add only 1 number");
        }
        else{
            int sum=0;
            for (String s : args) {
                sum+=Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}
