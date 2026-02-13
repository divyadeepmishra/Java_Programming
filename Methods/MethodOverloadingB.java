package Methods;

public class MethodOverloadingB {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        double r = sum(2.5, 3.7);
        System.out.println(r);
    }
}
