package static_keyword;

public class ClassD {
    int id;
    int marks;

    public void print(ClassD c) {
        System.out.println(c.id + " " + c.marks);
    }

    public void greet() {
        print(this);
    }
    public static void main(String[] args) {
        ClassD obj = new ClassD();
        obj.id = 2;
        obj.marks = 90;
        obj.greet();
    }
}
