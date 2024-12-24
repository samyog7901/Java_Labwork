class Rectangle{
    int length, breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    int area(){
        return length * breadth;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 5);
        System.out.println("Area: " + rect.area());
    }
    
}
