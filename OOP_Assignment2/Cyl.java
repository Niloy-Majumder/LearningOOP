// 9
class Circle{
    int radius;
    Circle(int r){
        this.radius=r;
    }
}
class Area extends Circle{
    Area(int r){
        super(r);
    }
    double area(){
        return 3.14*radius*radius;
    }
}
class Volume extends Area{
    int height;
    Volume(int r,int h){
        super(r);
        this.height=h;
    }
    double volume(){
        return super.area()*height;
    }
    
}

public class Cyl {
    public static void main(String[] args) {
        Volume vol = new Volume(3, 5);
        System.out.println("Radius : "+vol.radius+" Area: "+ vol.area()+" Volume : "+ vol.volume());
    }
}
