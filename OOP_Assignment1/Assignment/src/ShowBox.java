class Box {
    int length,bredth,height;
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
        Box box2 = new Box();
        box1.getdata(5, 4, 8);
        System.out.println("Box 1 data: ");
        box1.displaydata();
        box2.getdata(17, 16, 25);
        System.out.println("Box 2 data: ");
        box2.displaydata();
    }
}
