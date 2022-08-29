package com.example.registration;

import java.util.Date;

public class ConfirmedAppointment {


    private String username;
    private Date hour;
    private String AppointmentType;

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                "username='" + username + '\'' +
                ", hour='" + hour + '\'' + "AppointmentType='" + AppointmentType + '\'' +
                '}';
    }

    public ConfirmedAppointment() {}
    public ConfirmedAppointment(String username, Date hour,String AppointmentType) {
        this.username = username;
        this.hour = hour;
        this.AppointmentType=AppointmentType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }
    public String getAppointmentType(){
        return AppointmentType;
    }
    public void setAppointmentType(String AppointmentType){
        this.AppointmentType=AppointmentType;
    }
}
