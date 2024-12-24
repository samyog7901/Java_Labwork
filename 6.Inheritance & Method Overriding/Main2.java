// Multilevel Inheritance
class GrandParent{
    void display(){
        System.out.println(" I am the grandParent.");
    }
}
class Parent extends GrandParent{
    void show(){
        System.out.println(" I am the parent.");
    }
}
class Child extends Parent{
    void introduce(){
        System.out.println(" I am the child.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
        c.introduce();       
    }
    
}
