// 12
interface Flying {
    final int var = 10;
    public void fly();
}

class Bird implements Flying{
    public void fly(){
        System.out.println("Bird Flies with the help of its wings");
        System.out.println("Variable: "+ var);
    }
}

class Plane implements Flying{
    public void fly(){
        System.out.println("Plane Flies with the help of its engine");
        System.out.println("Variable: "+ var);
    }
}
public class Fly {

    public static void main(String[] args) {
        Flying f;
        f= new Bird();
        f.fly();
        f= new Plane();
        f.fly();
    }
}