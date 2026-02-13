// From a static mwethod, we can directly call a static method, there is no need of creating a object
package static_keyword;

public class StaticC {
    public static void display() {
        System.out.println("hi");
    }
    public static void main(String[] args) {
        display();
    }
}
