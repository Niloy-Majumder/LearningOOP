class Palindrome{  

  		int r,sum=0,temp;    
        void findpalindrome(int n){ 
 		 temp=n;    
 		 while(n>0){    
  			r=n%10;  
 		    sum=(sum*10)+r;    
   			n=n/10;    
  		}
  		if(temp==sum)    
   			System.out.println("Given number is a palindrome ");    
  		else    
   			System.out.println("not palindrome");
          }
            

}    

public class FindPalindrome {
    public static void main(String[] args) {
        int number=363;
        Palindrome palindrome = new Palindrome();
        palindrome.findpalindrome(number);
    }
}