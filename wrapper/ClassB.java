package wrapper;

public class ClassB {
    public static void main(String[] args) {
        Boolean a = true;

        Boolean b1 = new Boolean(a); // Strike down : it means that in future version maybe this will not possible

        Boolean b2 = Boolean.valueOf(a);

        // Autoboxing
        Boolean b3 = a;

        //Print
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //Unboxing : Primitive data type of Wrapper se bahir nikalna
        Boolean c1 = b2.booleanValue();
        Boolean c2 = b3;

        //Print
        System.out.println(c1);
        System.out.println(c2);
    }
}
