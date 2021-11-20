class GetFibonacci {
    GetFibonacci(int FibLength){
        int[] num = new int[FibLength];
    	num[0] = 0;
        num[1] = 1;
  		for (int i = 2; i < FibLength; i++){
  		    num[i] = num[i - 1] + num[i - 2];
 		}
  		System.out.println("Fibonacci Series: ");
  		for (int i = 0; i < FibLength; i++){
    	System.out.print(num[i] + " ");
  		}
    }
    
}

public class Fibonacci {
    public static void main(String[] args) {
        int length=15;
        GetFibonacci fibonacci = new GetFibonacci(length);
    }
}
