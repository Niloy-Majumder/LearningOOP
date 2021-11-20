// 6
class Area{
    int length,bredth;
    Area(int l, int b){
        this.length=l;
        this.bredth=b;
    }
    int area(){
        return length*bredth;
    }
}
class Vol extends Area{
    int height;
    Vol(int l, int b, int h){
    super(l,b);
    this.height= h;
    }
    int volume(){
        return super.area()*height;
    }
}

public class Rect {
    public static void main(String[] args) {
        Vol cube = new Vol(8,4,10);
        System.out.println("Area : "+ cube.area() + " Volume : "+ cube.volume());
    }
}
