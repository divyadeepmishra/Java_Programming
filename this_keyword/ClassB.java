package this_keyword;

public class ClassB {
    int id;
    int marks;

    ClassB(){
        System.out.println("A");
    }

    ClassB(int a, int b){
        System.out.println("B");
        id = a;
        marks = b;
    }

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println(obj.id + " " + obj.marks);
    }
}
