class GCD {
    int x,y,gcd=1;
    GCD(int first,int second){
        x= first;
        y= second;
    }
    int calculateGCD(){
        for(int i = 1; i <= x && i <= y; i++)  
        {  
            if(x%i==0 && y%i==0)  
            gcd = i;  
        }
        return gcd;
    }
    
}

public class FindGCD{  
    public static void main(String[] args){  
        int firstnumber = 12, secondnumber = 8;  
        GCD newGCD= new GCD(firstnumber,secondnumber);
        int gcd= newGCD.calculateGCD();
        System.out.printf("GCD of %d and %d is: %d", firstnumber, secondnumber, gcd);  
    }  
}