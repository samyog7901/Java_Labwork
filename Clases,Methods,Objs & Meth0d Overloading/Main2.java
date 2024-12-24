class Car{
    void start(){
        System.out.println("Car started!");
    }
}

class Bike{
    void start(){
        System.out.println("Bike started!");
    }
}


public class Main2{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        // Creating Objects of Multiple Classes
        car.start();
        bike.start();
    }
    
}
