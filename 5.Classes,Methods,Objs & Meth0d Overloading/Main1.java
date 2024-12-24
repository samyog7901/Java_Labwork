class Calculator{
    // Method Overloading
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Integer Addition: " + calc.add(5, 3));
        System.out.println("Double Addition:" + calc.add(5.5, 3.3));
    }
    
}
