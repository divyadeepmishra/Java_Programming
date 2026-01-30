import java.util.Scanner;

public class Char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        sc.close();
    }
}
