package com.company;

import java.util.ArrayList;

public class EmployeesInitializer {
    public static ArrayList<Employee> initialize() {
        ArrayList result = new ArrayList();
        result.add(new Employee("Harry",50000,1960, 11,14));
        result.add(new Employee("Jon",80000,1985, 12,22));
        result.add(new Manager("Brian",35000,1937, 9,21,0));
        result.add(new Employee("Tom",60000,1980, 1,19));
        result.add(new Employee("Ann",23000,1990, 3,11));
        result.add(new Employee("Jenny ",58000,1985, 6,10));
        result.add(new Employee("Monica",50600,1967, 8,16));
        result.add(new Employee("Kate",40000,2000, 12,4));
        return result;
    }
}
