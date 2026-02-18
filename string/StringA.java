package string;

public class StringA {
    public static void main(String[] args) {

        // Creating two string literals
        String a = "Hello, World!";
        String b = "Hello, World!";

        // Comparing string literals using '=='
        System.out.println("Comparing string literals with '==': " + (a == b)); // true, because string literals are interned
        System.out.println("Comparing string literals with 'equals()': " + a.equals(b)); // true, because the content is the same


        // Creating two string objects using 'new'
        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println("Comparing string objects with '==': " + (c == d)); // false, because 'new' creates new objects in memory
        System.out.println("Comparing string objects with 'equals()': " + c.equals(d)); // true, because the content is the same
    }
}
