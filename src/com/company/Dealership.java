package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.GregorianCalendar;
import java.util.Timer;

public class Dealership {
    int year;
    int month;
    int day;
    Employee employee = new Employee();
    Manager manager = new Manager();
    Timer t = new Timer();
    GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
    final Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();

    public Dealership(){
        this.employeeList = EmployeesInitializer.initialize();
    }

    protected void printSaleAgreement(){
        System.out.printf("Seller Details\n"+
                "Full Name:\n"+
                "Address:\n"+
                "Postcode:\n"+
                "Phone Number:\n"+
                "Buyer Details\n"+
                "Full Name:\n"+
                "Address:\n"+
                "Postcode:\n"+
                "Phone Number:\n"+
                "Vehicle Details\n"+
                "Make:\n"+
                "Model:\n"+
                "Year:\n"+
                "Current Mileage (Confirmed True by Seller):\n"+
                "VIN/Chassis Number:\n"+
                "(The Vehicle Identification Number must be verified on the vehicle body and DVLA V5\n"+
                "Registration Certificate)\n"+
                "Engine Number (optional):\n"+
                "Vehicle Sale Price: £\n"+
                "Amount Paid to Seller: £ );\n");
    }
    protected void printCallendar(){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // Set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
    protected void hireEmployee(){
        System.out.println("Input name");
        String inputName = scanner.nextLine();
        System.out.println("Input salary");
        double inputSalary = scanner.nextDouble();
        System.out.println("Input birthday yyyy,mm,dd");
        int inputYear = scanner.nextInt();
        int inputMonth = scanner.nextInt();
        int inputDay = scanner.nextInt();
        Calendar hireDate = GregorianCalendar.getInstance();
        Date hireDay = hireDate.getTime();

        employeeList.add(new Employee(inputName,inputSalary,inputYear,inputMonth,inputDay));
    }
    protected void hireEManager(){
        System.out.println("Input name");
        String inputName = scanner.nextLine();
        System.out.println("Input salary");
        double inputSalary = scanner.nextDouble();
        System.out.println("Input birthday yyyy,mm,dd");
        int inputYear = scanner.nextInt();
        int inputMonth = scanner.nextInt();
        int inputDay = scanner.nextInt();
        System.out.println("input bonus");
        double inputbonus = scanner.nextDouble();
        Calendar hireDate = GregorianCalendar.getInstance();
        Date hireDay = hireDate.getTime();

        employeeList.add(new Manager(inputName,inputSalary,inputYear,inputMonth,inputDay,inputbonus));
    }
    protected void printEmployees(){
        int counter = 0;
        for (Employee v : employeeList) {
            System.out.println( counter++ + " " + v.getName()+ " " + v.getDescription() + " hired " + v.getHireDay() + " " + v.getBonus());
        }
    }
    protected void swap() {
        System.out.println("Choose employee x");
        for (Employee v : employeeList) {
            System.out.println((employeeList.indexOf(v))+ " " + v.getName()+ " " + v.getDescription() + " hired " + v.getHireDay());
        }
        int indexX = scanner.nextInt();

        System.out.println("Choose employee y");
        for (Employee v : employeeList) {
            System.out.println((employeeList.indexOf(v))+ " " + v.getName()+ " " + v.getDescription() + " hired " + v.getHireDay());
        }
        int indexY = scanner.nextInt();
        Collections.swap(employeeList,indexX,indexY);

        printEmployees();
    }
    protected void equalstest(){
        System.out.println("Pick employee No.1");
        printEmployees();
        int temp1 = scanner.nextInt();
        System.out.println("Pick employee No.2");
        printEmployees();
        int temp2 = scanner.nextInt();
        System.out.println("Class test = " + (employeeList.get(temp1).getClass().equals(employeeList.get(temp2).getClass())));
        System.out.println("== test with Object : " + (employeeList.get(temp1) == (employeeList.get(temp2))));
        System.out.println("== test with hashcode : " + (employeeList.get(temp1).hashCode() == employeeList.get(temp2).hashCode()));
    }
    protected void cloneEmployee() throws CloneNotSupportedException {
        System.out.println("Select object to clone");
        printEmployees();
        int select = scanner.nextInt();
        employeeList.add(employeeList.get(select).clone());
        System.out.println(employeeList.size());
        printEmployees();
        }
    protected void getSalary(){
        System.out.println("Select desired Employee");
        printEmployees();
        int select = scanner.nextInt();
        System.out.println(employeeList.get(select).getSalary());
    }
    protected void setBonus() {
        System.out.println("Select person");
        for (Employee v : employeeList) {
            if (v instanceof Manager) {
                System.out.println((employeeList.indexOf(v))+ " " + v.getName()+ " " + v.getDescription() + " hired " + v.getHireDay() + " " + v.getBonus());
            }else if (v.equals(null)) {
            System.out.println("No managers");
            }
        }
        int selection = scanner.nextInt();
        System.out.println("enter bonus value");
        double bonus = scanner.nextDouble();
        employeeList.get(selection).setBonus(bonus);

    }
    protected void getHashcode(){
        System.out.println("Select person");
        printEmployees();
        int select = scanner.nextInt();
        System.out.println(employeeList.get(select).hashCode());
    }
    protected void compare(){
        System.out.println("Pick 1st employee");
        printEmployees();
        int pick1 = scanner.nextInt();
        System.out.println("Pick 2nd employee");
        printEmployees();
        int pick2 = scanner.nextInt();
        System.out.println(employeeList.get(pick1).compareTo(employeeList.get(pick2)));

    }
    protected void timer(){
        ActionListener listener = new Timeprinter();
        // construct a timer that calls the listener
        // once every 10 seconds
        javax.swing.Timer t = new javax.swing.Timer(1000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
    protected void getClassInfo(){
        System.out.println("Finf more about: ");
        System.out.println("BodyType");
        System.out.println("CabType");
        System.out.println("Car");
        System.out.println("Dealership");
        System.out.println("DrivetrainType");
        System.out.println("Employee");
        System.out.println("FuelType");
        System.out.println("Main");
        System.out.println("Manager");
        System.out.println("MarketSegment");
        System.out.println("Menu");
        System.out.println("Parking");
        System.out.println("Person");
        System.out.println("Timeprinter");
        System.out.println("Truck");
        System.out.println("Vehicle");
        System.out.println("input selected Class");
        String name = "com.company."+ scanner.nextLine();
        try {
            // print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class)
                System.out.print(" extends " + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }
        System.exit(0);
        }
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
                System.out.print(name + "(");

            // print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0)
                   System.out.print(", ");
                System.out.print(paramTypes[j].getName());
                }
            System.out.println(");");
        }
    }
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print(" ");
    // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");
    // print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print(paramTypes[j].getName());
                }
            System.out.println(");");
        }
    }
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
            for (Field f : fields) {
                Class type = f.getType();
                String name = f.getName();
                System.out.print(" ");
                String modifiers = Modifier.toString(f.getModifiers());
                if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
                System.out.println(type.getName() + " " + name + ";");
            }
    }




    }
//    protected void print(){
//        System.out.println(employeeList.get(2).getClass());
//        System.out.println(manager.getClass());
//    }




