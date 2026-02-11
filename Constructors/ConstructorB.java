package Constructors;

class Teacher {
    int uid;
    String name;

    // Parameterized Constructor : it is a constructor which takes some parameters and initialize the data members of the class
    Teacher(int a, String b) {
        uid = a;
        name = b;
    }
}

public class ConstructorB {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Name");
        System.out.println(t1.uid + " " + t1.name);
    }
}
