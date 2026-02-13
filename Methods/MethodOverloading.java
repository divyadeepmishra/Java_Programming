// Method overloading can be done via - no. of paramenters, types of paramenters, ordering of parameters

package Methods;

public class MethodOverloading {
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int result = sum(2, 3);
        System.out.println("Result is: " + result);
    }

}
