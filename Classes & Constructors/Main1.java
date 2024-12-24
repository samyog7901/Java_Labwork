class Person{
    String name;
    
    // Default Constructor
    Person(){
        name = "Ram Singh";
    }
    void display(){
        System.out.println("Name: " + name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.display();
    }   
}
