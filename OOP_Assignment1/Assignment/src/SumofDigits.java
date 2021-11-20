class FindSumofDigits {
    int Number, Reminder, Sum = 0;
    FindSumofDigits(int givennumber){
        Number=givennumber;
    }
    int calculatesumofdigits(){
        while(Number > 0){
            Reminder = Number % 10;
            Sum = Sum+ Reminder;
            Number = Number / 10;
        }
        return Sum;
    }
	
    
}




public class SumofDigits {
    public static void main(String[] args) {
        int number=123;
        FindSumofDigits Sum= new FindSumofDigits(number);
        int finalsum= Sum.calculatesumofdigits();
        System.out.printf("Sum of the digits of Given Number = %d",finalsum);
    }
}