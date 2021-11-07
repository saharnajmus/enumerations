package be.intecbrussel;

public enum Day {
    //Chapter 11 Assignment 1.
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    private final boolean weekday;

    Day(boolean weekday) {
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        if(weekday){
        return name() + " is a weekday" ;}
        else
            return name() + " is not a weekday " ;
    }
}
