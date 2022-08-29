package com.example.registration;

import android.widget.Toast;

import com.example.atunticaitorapp.Register;
import com.example.atunticaitorapp.Trackers;

import java.util.Date;

public class FoodAlert extends Trackers {

    private double age;
    private Date hour;
    private String AppointmentType;
    private double weight;

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                "age='" + age + '\'' +
                ", hour='" + hour + '\'' + "AppointmentType='" + AppointmentType + '\'' + "weight='" + weight + '\'' +
                '}';
    }

    public FoodAlert() {
    }

    public FoodAlert(double age, Date hour, String AppointmentType,double weight) {
        this.age = age;
        this.hour = hour;
        this.AppointmentType = AppointmentType;
        this.weight=weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age)
    {
        if(age<=3){
            this.age = age;
        }
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
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void Meal(double weight,double age){
        double sum=0.0;
        String freshChild="if the child is hungry we recommend to feed him";
        while (weight>=0.1&&age>0.1){
                sum=weight*150.0%8;
        }
        Toast.makeText(FoodAlert.this, "The Average Amount per meal is : " + sum, Toast.LENGTH_SHORT).show();
        Toast.makeText(FoodAlert.this, "if your child is 3 days old or less , the recommended Amount is :20cc pre meal , every 2-3 hours  " +freshChild, Toast.LENGTH_SHORT).show();
        Toast.makeText(FoodAlert.this, "the Average child will be around 60 cc in the fourth day", Toast.LENGTH_SHORT).show();


    }
}
