package inheritance;

class Father {
    int salary = 50000;

    public void car() {
        System.out.println("Driving");
    }}

class Son1 extends Father{
    int bike = 20000;
}

class Son2 extends Father{
    int bike = 30000;
}

public class InheritanceB {
    public static void main(String[] args) {
        Son1 obj1 = new Son1();
        System.out.println("Salary: " + obj1.salary);
        System.out.println("Bike: " + obj1.bike);
        obj1.car();

        Son2 obj2 = new Son2();
        System.out.println("Salary: " + obj2.salary);
        System.out.println("Bike: " + obj2.bike);
        obj2.car();
    }
}


