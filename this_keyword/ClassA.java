package this_keyword;

public class ClassA {
    int id;
    int marks;

    // Constructor
    ClassA(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA(2, 80);
        System.out.println(obj.id + " " + obj.marks);
    }
}
