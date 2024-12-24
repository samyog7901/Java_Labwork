public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; //Implicit Casting

        double c = 15.5;
        int d = (int) c; //Explicit Casting

        System.out.println("Implicit Casting(int to double): " + b);
        System.out.println("Explicit Casting(double to int): " + d);
    }
    
}
