// 10
abstract class Bank{    
    abstract int getRateOfInterest();    
    }    
class SBI extends Bank{    
    int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
    int getRateOfInterest(){return 8;}    
}    
        
class TestBank{    
    public static void main(String args[]){    
          
        SBI b=new SBI();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
        PNB c=new PNB();  
        System.out.println("Rate of Interest is: "+c.getRateOfInterest()+" %");    
    }
}    