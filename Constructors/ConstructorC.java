package Constructors;

Class Student{
    int id;
    String name;

    // Non parameterized constructor : it is a constructor which does not take any parameters and initialize the data members of the class with default values
    Student(){
        System.out.println("Constructor is called");
    }
}


public class ConstructorC {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Name";
        System.out.println(s1.id + " " + s1.name);
    }
}
