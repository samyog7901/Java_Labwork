// Method Overriding
class Animal{
    void sound(){
        System.out.println("Animals make sound.");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
    }
    
}
