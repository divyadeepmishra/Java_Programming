/*Static variable are for :
    Static variable are shared among objects
    Static variable are made indise the method area
*/

package static_keyword;

public class StaticA {

    int id;
    static String college;

    public static void main(String[] args) {

        StaticA obj1 = new StaticA();
        obj1.id = 2;
        StaticA.college = "ABC";


        StaticA obj2 = new StaticA();
        obj2.id = 5;
        StaticA.college = "DEF";

        System.out.println(obj1.id + " " + StaticA.college);
        System.out.println(obj2.id + " " + StaticA.college);
    }
}
