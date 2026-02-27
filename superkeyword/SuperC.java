package superkeyword;

class Z1 {
    Z1() {
        System.out.println("Parent constructor called");
    }
}

class Z2 extends Z1 {
    Z2() {
        super(); // Calls the constructor of Z1
        System.out.println("Child constructor called");
    }
}

public class SuperC {
    public static void main(String[] args) {
        Z2 obj = new Z2();
    }
}
