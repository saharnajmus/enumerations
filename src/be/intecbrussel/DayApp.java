package be.intecbrussel;

public class DayApp {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.print(day.toString());
            System.out.println(" and its ordinal value is " + day.ordinal());
        }
    }
}
