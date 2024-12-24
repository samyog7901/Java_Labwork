// single Inheritance
class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("This dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
    
}
