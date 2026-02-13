package Methods;

public class MethodB {

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodB obj = new MethodB();
        int r = obj.addTwoNumbers(3, 4);
        System.out.println("Result is: " + r);
    }
}
