package methodoverwrite;

class B1 {
    public void greet() {
        System.out.println("Greet 1");
    }
}

class B2 extends B1 {
    public void greet() {
        System.out.println("Greet 2");
    }
}

class B3 extends B2 {
    public void greet() {
        System.out.println("Greet 3");
    }
}

public class MethodOverirdeA {
    public static void main(String[] args) {
        B3 obj = new B3();
        obj.greet(); // This will call the greet method of B3
    }
}
