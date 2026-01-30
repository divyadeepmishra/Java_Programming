import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double a = sc.nextDouble();

        System.out.print("Enter another double value: ");
        double b = sc.nextDouble();

        double sum = a + b;

        System.out.println("The sum of both values is: " + sum);

        sc.close();
    }
}
