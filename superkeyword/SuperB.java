package superkeyword;

class Y1 {
    public void greet() {
        System.out.println("Hello from parent class");
    }
}

class Y2 extends Y1 {
    public void greet() {
        System.out.println("Hello from child class");
    }

    public void display() {
        greet(); // calls child class method
        super.greet(); // calls parent class method
    }
}
public class SuperB {
    public static void main(String[] args) {
        Y2 obj = new Y2();
        obj.display();
    }
}
