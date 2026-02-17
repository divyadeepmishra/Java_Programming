package varargs;

public class VarargsA {

    public static int sum(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int ans = sum(2, 5, 4);
        System.out.println("Sum is: " + ans);
    }
}
