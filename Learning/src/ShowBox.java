class Box {
    int length,bredth,height;
    Box(){
        length=1;
        bredth=1;
        height=1;
    }
    Box(int l, int b,int h){
        length=l;
        bredth=b;
        height=h;
    }
    
    void getdata(int l, int b,int h){
        length=l;
        bredth=b;
        height=h;
    }
    void displaydata(){
        System.out.println("Length : "+ length +" Bredth : "+ bredth+" Height : "+height);
    }
}
public class ShowBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(4,5,8);
        System.out.println("Box 1 data: ");
        box1.displaydata();
        System.out.println("Box 2 data: ");
        box2.displaydata();
    }
}
