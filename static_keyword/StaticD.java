// From a static function, if we are calling a non-static function , we have to create object first

package static_keyword;

public class StaticD {
    public void greet() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        StaticD obj = new StaticD();
        obj.greet();
    }
}
