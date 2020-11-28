package com.company;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Person implements Cloneable{
    public abstract String getDescription();

    protected String name;
    private Date birthDay;
    private int year;
    private int month;
    private int day;


    public Person(String name, int year, int month, int day) {
        this.name = name;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        // GregorianCalendar uses 0 for January
        birthDay = calendar.getTime();
    }

    public Person() {
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }
    public Date getBirthday(){
        return birthDay;
    }
    protected Person clone() throws CloneNotSupportedException {
        // call Object.clone()
        Person cloned = (Person) super.clone();

        // clone mutable fields
        cloned.birthDay = (Date) birthDay.clone();

        return cloned;
    }
}
