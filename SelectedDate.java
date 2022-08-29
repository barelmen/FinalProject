package com.example.registration;
//selected day on the week
public class SelectedDate {
    private String date;
    private int dayNumber;

    public SelectedDate() {
    }

    public SelectedDate(String date, int dayNumber) {
        this.date = date;
        this.dayNumber = dayNumber;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        if (dayNumber > 0 && dayNumber <= 7) {
            this.dayNumber = dayNumber;
        }
    }


    public SelectedDate(String date) {
        this.date = date;
    }


}
