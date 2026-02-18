package string;

// Inbuilt functions of String class
public class StringB {
    public static void main(String[] args) {
        
        String s1 = "Hello World!";
        System.out.println(s1 + "Hi");

        System.out.println(s1.charAt(2)); // 'l', because indexing starts from 0: H(0) e(1) l(2) l(3) o(4) (5) W(6) o(7) r(8) l(9) d(10) !(11)

        System.out.println(s1.isEmpty()); // false, because s1 is not empty

        System.out.println(s1.startsWith("He")); // true, because s1 starts with "He"
        System.out.println(s1.endsWith("ad")); // false, because s1 does not end with "ad"

        System.out.println(s1.substring(2)); // "llo World!", because it returns the substring starting from index 2 to the end of the string

        System.out.println(s1.substring(2, 7)); // "llo W", because it returns the substring starting from index 2 to index 7 (exclusive)

        System.out.println(s1.length()); // 12, because s1 has 12 characters (including space and punctuation)
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.contains("llo")); // true, because s1 contains the substring "llo"

        System.out.println(s1.replace('0', 'a')); // "Hello Warld!", because it replaces all occurrences of 'o' with 'a'

        System.out.println(s1.replace("World", "Java")); // "Hello Java!", because it replaces all occurrences of "World" with "Java"

        System.out.println(s1.indexOf('o')); // 4, because the first occurrence of 'o' is at index 4

        System.out.println(s1.indexOf("o", 5)); // 7, because it starts searching for 'o' from index 5 and finds it at index 7

        System.out.println(s1.lastIndexOf('o')); // 7, because the last occurrence of 'o' is at index 7

        System.out.println(s1.lastIndexOf("o", 5)); // 4, because it starts searching for 'o' backwards from index 5 and finds it at index 4
    }
}
