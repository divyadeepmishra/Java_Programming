public class Student {
    int id;
    String name;
    int marks;
    public static void main(String[] args) {
        Student s1 = new Student();     // wheneever we use new it is inside heap memory and it will create an object and return the reference of that object and store it in s1 variable
        s1.id = 1;
        s1.name = "Name";
        s1.marks = 85;

        System.out.println(s1.id + " " + s1.name + " " + s1.marks);

    }
}
