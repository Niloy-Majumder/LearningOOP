// 8
class Shape{
    void draw(){
        System.out.println("Shape drawn");
    }
    void Erase(){
        System.out.println("Shape erased");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle drawn");
    }
    void Erase(){
        System.out.println("Circle erased");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle drawn");
    }
    void Erase(){
        System.out.println("Triangle erased");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Square drawn");
    }
    void Erase(){
        System.out.println("Square erased");
    }
}


public class shapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        circle.draw();
        circle.Erase();
        triangle.draw();
        triangle.Erase();
        square.draw();
        square.Erase();
    }
}

// From this program we Achieve Hierarchical Inheritance.