package string;

public class StringC {
    public static void main(String[] args) {

        String s1 = "Hello World!";
        System.out.println(s1);

        String s2 = new String("Hi!");
        System.out.println(s2);

        String s3 = "Hello World!";
        String s4 = new String(s3);
        System.out.println(s4);

        byte[] arr = { 65, 66, 67, 68 }; // ASCII values for 'A', 'B', 'C', 'D'
        String s5 = new String(arr);
        System.out.println(s5);

        char[] arr2 = { 'a', 'b', 'c', 'd' };
        String s6 = new String(arr2);
        System.out.println(s6);
    }
}
