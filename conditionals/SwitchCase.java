package conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Expression: ");
        int e = sc.nextInt();

        switch (e) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            default:
                System.out.println("No case found");
                break;
        }
        sc.close();
    }
}
