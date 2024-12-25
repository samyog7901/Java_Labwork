interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks: Woof Woof");
    }
}

interface Pet{
    void behavior();
}

class Cat implements Animal,Pet{
    @Override
    public void sound(){
        System.out.println("Cat meows: Meow Meow");
    }
    public void behavior(){
        System.out.println("Cat is playful.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        cat.behavior();
    }
    
}
