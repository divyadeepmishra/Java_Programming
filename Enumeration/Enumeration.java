package Enumeration;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enumeration {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY; // Assigning an enum constant to a variable
        System.out.println("Today is: " + today);
    }
}
