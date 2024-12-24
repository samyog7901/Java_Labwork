class Student{
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student stu = new Student("Kanha", 16);
        stu.display();
    }
    
}
