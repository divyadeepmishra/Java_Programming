package accessmod;

public class ClassA1 {
    public int b = 42;

    public void greet() {
        System.out.println("Hello from ClassA1!");
    }

    public static void main(String[] args) {
        ClassA1 obj = new ClassA1();
        System.out.println(obj.b);
        obj.greet();
    }
}
