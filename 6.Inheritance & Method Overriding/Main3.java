interface Swimmable{
    void swim();
}
interface Flyable{
    void fly();
}

class Duck implements Swimmable, Flyable{
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
    public void fly(){
        System.out.println("It can also fly.");
    }
}


public class Main3 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.swim();
        d.fly();
    }
    
}
