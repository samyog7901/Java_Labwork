public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2};
            int result = nums[1] / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index.");
        }
    }
}
