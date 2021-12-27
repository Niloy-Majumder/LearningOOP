import java.util.Scanner;

interface Shapeinterface {
    public double area();
    public void show();
}

class Circle implements Shapeinterface{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public void show(){
        System.out.println("The area of the chosen shape is: "+area());
    }
}

class Triangle implements Shapeinterface{
    int side1,side2,side3;
    Triangle(int side1,int side2,int side3){
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;
    }
    public double area(){
        double s= (side1+side2+side3)/2;
        double A=s*(s-side1)*(s-side2)*(s-side3);
        double Area= Math.sqrt(A);
        return Area;
    }
    public void show(){
        System.out.println("The area of the chosen shape is: "+area());
    }
}

class Square implements Shapeinterface{
    int side;
    Square(int side){
        this.side= side;
    }
    public double area(){
        return side*side;
    }
    public void show(){
        System.out.println("The area of the chosen shape is: "+area());
    }
}

class drive{
    public static void calculate(Shapeinterface s){
        s.show();
    }
    public static void main(String[] args) {
        int choice;
        Shapeinterface sh;
        System.out.println("Enter your Choice \n 1.Circle \n 2.Triangle \n 3.Square");
        try (Scanner sc = new Scanner(System.in)) {
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Radius");
                int radii= sc.nextInt();
                sh= new Circle(radii);
                calculate(sh);
            }
            else if (choice == 2) {
                System.out.println("Enter Three Sides:");
                int s1,s2,s3;
                s1=sc.nextInt();
                s2=sc.nextInt();
                s3=sc.nextInt();
                sh= new Triangle(s1,s2,s3);
                calculate(sh);
            }
            else if (choice == 3) {
                System.out.println("Enter Length");
                int side= sc.nextInt();
                sh= new Square(side);
                calculate(sh);
            }
            else{
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.err.println("Enter only the given choices.");
        }
        
    }
}