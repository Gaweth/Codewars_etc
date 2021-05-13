package Enum.Zadanie1;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WENDSDAY,
    THURDSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay(){

        return this != SATURDAY && this != SUNDAY;
    }
    boolean isHoliday(){
        return this == SATURDAY && this == SUNDAY;
    }

    void whichIsGreater(Weekday day){
        if (this.ordinal()< day.ordinal()){
            System.out.println("before " + day);
        }
        else if (this.ordinal() == day.ordinal())
        {
            System.out.println("same day");
        }
        else System.out.println("after " + day);
    }


}
