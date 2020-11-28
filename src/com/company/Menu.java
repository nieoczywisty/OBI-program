package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Dealership dealership = new Dealership();
    Parking parking = new Parking();
    Manager manager = new Manager();

    final void Start() throws CloneNotSupportedException {

        System.out.println("\"Welcome, how can I help you?");
        do {
            System.out.printf("1.Print callendar\n" +
                    "2.Preview available Vehicles\n" +
                    "3.Print Sale Agreement\n" +
                    "4.Subtract Vehicle form parkingn\n" +
                    "5.Add Car to parking\n" +
                    "6.Add Truck to parking\n" +
                    "7.Timer\n" +
                    "8.Get Class Info\n" +
                    "9.Manage employees\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    dealership.printCallendar();
                    break;
                case 2:
                    parking.printAvailableVeh();
                    break;
                case 3:
                    dealership.printSaleAgreement();
                    break;
                case 4:
                    parking.subtractVehicle();
                    break;
                case 5:
                    parking.addCar();
                    break;
                case 6:
                    parking.addTruck();
                    break;
                case 7:
                    dealership.timer();
                    break;
                case 8:
                    dealership.getClassInfo();
                    break;
                case 9:
                    System.out.printf("1.Hire Employee\n" +
                            "2.Hire Manager\n" +
                            "3.Show current employees\n" +
                            "4.Set Bonus\n" +
                            "5.Rise Salary\n" +
                            "6.Swap Employee x , Employee y\n" +
                            "7.Equals Employee x , Employee y\n" +
                            "8.Get salary \n" +
                            "9.Clone employee \n" +
                            "10.Get Hashcode \n" +
                            "11.Compare \n" +
                            "12.back\n");
                    int select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            dealership.hireEmployee();
                            break;
                        case 2:
                            dealership.hireEManager();
                            break;
                        case 3:
                            dealership.printEmployees();
                            break;
                        case 4:
                            dealership.setBonus();
                            break;
                        case 5:
                            manager.raiseSalary();
                            break;
                        case 6:
                            dealership.swap();
                            break;
                        case 7:
                            dealership.equalstest();
                            break;
                        case 8:
                            dealership.getSalary();
                            break;
                        case 9:
                            dealership.cloneEmployee();
                            break;
                        case 10:
                            dealership.getHashcode();
                        case 11:
                            dealership.compare();
                        case 12:
                            break;
                    }
            }
        } while (true);
    }
}
