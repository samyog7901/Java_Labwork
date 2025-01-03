import mypackage1.Farewell;
import mypackage1.Greetings;

public class MultipleClasses {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Farewell farewell = new Farewell();
        greetings.greet();
        farewell.fare();

    }
    
}
