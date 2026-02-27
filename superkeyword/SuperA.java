// Super is used refer to parent class object
// it is used when -:
// parent and child class have same variable names
// it is used to call parent class method from child class
// it is used to call parent class constructor

package superkeyword;

class X1 {
    int a = 10;
}

class X2 extends X1 {
    int a = 20;

    public void display() {
        System.out.println("Value of a in child class: " + a);
        System.out.println("Value of a in parent class: " + super.a);
    }
}

public class SuperA {
    public static void main(String[] args) {
        X2 obj = new X2();
        obj.display();
    }
}
