// Here is this getting used to return the current object

package this_keyword;

public class ClassC {
    int id;
    int marks;

    // Constructor
    ClassC(int a, int b) {
        id = a;
        marks = b;
    }

    ClassC get() {
        return this;
    }

    public void display() {
        System.out.println("Id is: " + id);
        System.out.println("Marks is: " + marks);
    }

    public static void main(String[] args) {
        ClassC obj = new ClassC(2, 80);
        obj.get().display();
    }
}
