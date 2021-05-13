package Enum.Zadanie1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Weekday.SATURDAY.isHoliday());
        Weekday.FRIDAY.whichIsGreater(Weekday.FRIDAY);
    }
}
