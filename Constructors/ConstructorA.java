package Constructors;

class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student() {
        System.out.println("Constructor is called");
    }

    void toStudy() {
        System.out.println("Studying");
    }
}

public class ConstructorA {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Name";
        s1.marks = 85;
        System.out.println(s1.id + " " + s1.name + " " + s1.marks);
        s1.toStudy();


    }
}
