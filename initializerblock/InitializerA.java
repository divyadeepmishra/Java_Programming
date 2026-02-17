package initializerblock;

public class InitializerA {

    // This is an initializer block
    {
        System.out.println("Initializer block called");
    }

    // This is a constructor
    InitializerA() {
        System.out.println("Constructor called");
    }

    // Method
    void display() {
        System.out.println("Display method called");
    }

    public static void main(String[] args) {
        InitializerA obj = new InitializerA();
        obj.display();
    }
}
