package Methods;

public class MethodOverloadingC {

    public static void display(int a, boolean b) {
        System.out.println("Inside fist");
    }

    public static void display(boolean a, int b) {
        System.out.println("Inside Second");
    }

    public static void main(String[] args) {
        display(false,2);
        display(3,true);
    }
}
