package inheritance;

class Vehicle {
    int wheels = 4;

    public void display() {
        System.out.println("Greetings");
    }
}

class Honda extends Vehicle {
    int model = 2020;
}

public class InheritanceA {
    public static void main(String[] args) {
        Honda obj = new Honda();
        System.out.println("Wheels: " + obj.wheels);
        System.out.println("Model: " + obj.model);
        obj.display();
    }
}
