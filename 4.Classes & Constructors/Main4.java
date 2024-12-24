class Box{
    int length, breadth;
    // Copy constructor
    Box(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    Box(Box b){
        this.length = b.length;
        this.breadth = b.breadth;
    }

    int area(){
        return length * breadth;
    }
}


public class Main4 {
    public static void main(String[] args) {
        Box b1 = new Box(5, 8);
        Box b2 = new Box(b1);
        System.out.println("Area of Original Box: " + b1.area());
        System.out.println("Area of Copied Box: " + b2.area());
    }
    
}
