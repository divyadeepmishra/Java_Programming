import java.util.Scanner;

public class InputA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int a = sc.nextInt();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.println("Value of a is " + a);
        System.out.println("Value of f is " + f);
        System.out.println("Value of d is " + d);

        sc.close();
    }
}
