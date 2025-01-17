public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Attempted to access a null object.");
        }
    }
}
