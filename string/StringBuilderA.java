package string;

public class StringBuilderA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.append(" World!");
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.substring(2));
        System.out.println(sb.substring(2, 5));

        // System.out.println(sb.setCharAt(2, 'a'));
        // System.out.println(sb.charAt(2));


        System.out.println(sb.toString());  // Very widely used method to convert StringBuilder to String

        System.out.println(sb.reverse());

        System.out.println(sb.deleteCharAt(1));
        System.out.println(sb.replace(0, 3, "good"));
    }
}
