package com.company;

import java.util.*;


public class Employee extends Person implements Comparable<Employee> ,Cloneable {
    Scanner scanner = new Scanner(System.in);
    private double salary;
    private Date hireDay, birthDay;
    private double bonus;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name, year, month, day);
        this.hireDay = hireDay;
        this.birthDay = birthDay;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        birthDay = calendar.getTime();
        // GregorianCalendar uses 0 for January
        Calendar hireDate = GregorianCalendar.getInstance();
        hireDay = hireDate.getTime();
    }

    public Employee() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, hireDay);
    }

    public String getName() {
        return name;
    }

    protected double getSalary() {
        return salary;
    }

    protected Date getHireDay() {
        return hireDay;
    }

    protected Date getBirthDay() {
        return birthDay;
    }

    protected void raiseSalary() {
        System.out.println("Input % rise");
        double byPercent = scanner.nextDouble();
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

        public String getDescription () {
            return String.format("an employee with a salary of $%.2f", salary);
        }

        protected Employee clone () throws CloneNotSupportedException {
            // call Object.clone()
            Employee cloned = new Employee(this.name, this.salary, this.getYear(), this.getMonth(), this.getDay());

            // clone mutable fields
            cloned.hireDay = (Date) hireDay.clone();

            return cloned;
        }

        public int compareTo (Employee other){
            return Double.compare(salary, other.salary);
        }
    }
