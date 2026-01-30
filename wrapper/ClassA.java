package wrapper;

public class ClassA {
    public static void main(String[] args) {
        int a = 10;

        // Boxing: Primitive data type ko class mai daalna
        Integer b1 = new Integer(a); // Strike down : it means that in future version maybe this will not possible

        Integer b2 = Integer.valueOf(a);

        // Autoboxing
        Integer b3 = a;

        //Print
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //Unboxing : Primitive data type of Wrapper se bahir nikalna 
        int c1 = b2.intValue();
        int c2 = b3;

        //Print
        System.out.println(c1);
        System.out.println(c2);
    }
}
