package typeconversion;

public class Implicit_typecasting {
    public static void main(String[] args) {
        byte a = 5;

        short b1 = a;
        int b2 = a;
        long b3 = a;
        float b4 = a;
        double b5 = a;

        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5);

        // byte -> short -> int -> long -> float -> double (implicit)
        // char -> int -> long -> float -> double (implicit)


        // Implicit type casting of float
        float b = 2.5f;
        double c1 = b;
        System.out.println(c1);

        // Implicit type casting of character
        char ch = 'A';
        int d1 = ch;
        int d2 = ch;
        int d3 = ch;
        int d4 = ch;

        System.out.println(d1 +" " + d2 + " " + d3 + " " + d4);
    }
}
