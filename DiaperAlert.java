package com.example.registration;

import com.example.atunticaitorapp.Trackers;

import java.util.Date;

public class DiaperAlert extends Trackers {
    private Date hour;
    private String AppointmentType;

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                ", hour='" + hour + '\'' + "AppointmentType='" + AppointmentType + '\'' +
                '}';
    }

    public DiaperAlert() {
    }

    public DiaperAlert(Date hour, String AppointmentType) {
        this.hour = hour;
        this.AppointmentType = AppointmentType;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public String getAppointmentType() {
        return AppointmentType;
    }

    public void setAppointmentType(String AppointmentType) {
        this.AppointmentType = AppointmentType;
    }
    public void ChangeDaiper(Date hour){


    }

}
