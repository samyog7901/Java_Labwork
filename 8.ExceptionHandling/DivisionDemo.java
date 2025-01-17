public class DivisionDemo {
    public static void main(String[] args) {
        try{
        int num = 10;
        int denom = 0;
        int result = num / denom;
        System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
    } 
}
