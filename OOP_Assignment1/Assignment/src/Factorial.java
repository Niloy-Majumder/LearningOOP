class CalculateFactorial {
    int n;
    CalculateFactorial(int num){
        n=num;
    }
    int getdata(int n){
        if (n==1 || n==0) {
            return 1;
        } else {
            return getdata(n-1)*n;
        }
    }
    int calculatefact(int n){
        int sum=1;
        if (n==0 || n==1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                sum= sum*i;
            }
            return sum;
        }
    }
    
}


public class Factorial {
    public static void main(String[] args) {
        int number =7;
        CalculateFactorial fact= new CalculateFactorial(number);
        int fact1= fact.getdata(number);
        System.out.println("By using getdata method factorial of 7 is: "+fact1);
        int fact2= fact.calculatefact(number);
        System.out.println("By using Calculatefact method factorial of 7 is: "+fact2);
    }
}
