public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
