package Methods;

public class MethodsA {

    public static void display() {
        System.out.println("Inside display method");
    }

    public static void main(String[] args) {
        System.err.println("Hii !");
        display(); // method call
        System.err.println("Bye");
    }
}
