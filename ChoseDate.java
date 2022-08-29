package com.example.registration;

public class ChoseDate {
    private int dayNumber;

public ChoseDate(){

}
public ChoseDate(int dayNumber){
    this.dayNumber=dayNumber;
}
public int getDayNumber(){
    return dayNumber;
}
public void setDayNumber(int dayNumber){
    if (dayNumber>0&&dayNumber<=7) {
        this.dayNumber = dayNumber;
    }
}
@Override
    public String toString(){
         return "DayOfWeek{" +
            "dayNumber=" + dayNumber +
            '}';
}

}