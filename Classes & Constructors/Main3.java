class Rectangle{
    int length, breadth;

    // Constructor overloading
    Rectangle(){
        length = 1;
        breadth = 1;
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return length * breadth;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("Default Area: " + r1.area());
        System.out.println("Custom Area: " + r2.area());
    }
    
}
