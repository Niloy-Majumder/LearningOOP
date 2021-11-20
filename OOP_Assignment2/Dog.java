// 7
class Animal{
    void action(){
        System.out.println("Animal is eating");
    }
}
class dog extends Animal{
    void action(){
        System.out.println("Dog is barking and eating");
    }
}

public class Dog {
    public static void main(String[] args) {
        dog D = new dog();
        D.action();
    }
}
