class CircleArea {
    double rad;
    CircleArea(double radius){
        rad = radius;
    }
    double calculatearea(){
        return (rad*rad)*Math.PI;
    }
}



public class Area {
    public static void main(String[] args) {
        int radius=3;
        CircleArea AreaofCircle = new CircleArea(radius);
        double area= AreaofCircle.calculatearea();
        System.out.println("Area ofCircle = "+ area);
    }
    
    
}

