import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
            float a = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
            float b = sc.nextFloat();

        System.out.print("Enter time in years: ");
        float c = sc.nextFloat();

        float s = (a * b * c) / 100;
        System.out.println("The interest is : " + s);

        float totalAmount = a + s;
        System.out.println("The total amount after interest is : " + totalAmount);

        sc.close();
    }
}
