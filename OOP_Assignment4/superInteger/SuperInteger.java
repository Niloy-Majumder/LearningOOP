package superInteger;

public class SuperInteger {
    private int i;


    //constructors
    public SuperInteger(int i){
        this.i=i;
    }

    public SuperInteger(){
        this(0);
    }

    //setter
    public void set(int i){
        this.i=i;
    }

    //getter
    public int get(){
        return i;
    }


    //some super methods

    public int noOfDigits(){
        Integer wrap= i;
        return wrap.toString().length();
    }

    public boolean isEven(){
        return i%2==0;
    }

    public boolean isNegetive(){
        return i<0;
    }
    
    public String serealize(){
        return "{integer:" + i +"}";
    }

}
