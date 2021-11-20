// 5
class A{
    int length=7;
    int bredth=4;

}
class B extends A{
    int height =10;
}

public class C {

    public static void main(String[] args) {
        B cube=new B();
        System.out.println("Length: "+ cube.length+ " Breadth: "+cube.bredth+" Height: "+cube.height);
    }
    
}