package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Manager extends Employee implements Cloneable{

    Scanner scanner = new Scanner(System.in);

    private double bonus;
    private Date birthDay, hireDay;

    public Manager(String name, double salary, int year, int month, int day,double bonus) {
        super(name, salary, year, month, day);
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        birthDay =calendar.getTime();
        // GregorianCalendar uses 0 for January
        Calendar hireDate = GregorianCalendar.getInstance();
        hireDay = hireDate.getTime();
        bonus = 0;
    }

    public Manager() {
        super();
    }


    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double bonus){
       this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    protected Manager clone() throws CloneNotSupportedException {
        // call Object.clone()
        Manager cloned = (Manager) super.clone();

        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }
}
