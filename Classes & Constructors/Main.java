class Car{
    String brand;
    int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    void display(){
        System.out.println("Brand: " + brand + ",Year: " + year);
    }
} 


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        car.display();
    }
    
}
