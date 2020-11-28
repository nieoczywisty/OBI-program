package com.company;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Parking {
    final private static int parkingCapacity = 15;
    private Scanner scanner;
    final private Random random;
    static ArrayList<Vehicle> availableVeh = new ArrayList<>(parkingCapacity);

    public Parking() {
        this.scanner = new Scanner(System.in);
        this.random =  new Random();
        this.availableVeh = VehicleInitializer.initialize();
    }

    protected void addCar() {
        System.out.println("Input Make");
        String inputMake = scanner.nextLine();
        System.out.println("Input Model");
        String inputModel = scanner.nextLine();
        System.out.println("Provide vehicle type. Available types:" + BodyType.printNice());
        int bodyTypeNumber = scanner.nextInt();
        BodyType bodyType =  BodyType.decode(bodyTypeNumber - 1);
        System.out.println("Provide drivetrain type. Available types:" + DrivetrainType.printNice());
        int drivetrainNumber = scanner.nextInt();
        DrivetrainType drivetrainType =  DrivetrainType.decode(drivetrainNumber - 1);
        System.out.println("Provide fuel type. Available types:" + FuelType.printNice());
        int fuelTypeNumber = scanner.nextInt();
        FuelType fuelType =  FuelType.decode(fuelTypeNumber - 1);
        System.out.println("Input year of production");
        int inputYearOfProduction = scanner.nextInt();
        System.out.println("Input mileage");
        int inputMileage = scanner.nextInt();
        System.out.println("Provide market segment. Available types:" + MarketSegment.printNice());
        int marketNumber = scanner.nextInt();
        MarketSegment marketSegment =  MarketSegment.decode(marketNumber - 1);

        System.out.println("Is it <new> or <used> car?");
        String inputUsed = scanner.nextLine();
        boolean isused;
        if ("new".equals(inputUsed)) {
            isused = false;
        } else {
            isused = true;
        }

        availableVeh.add(new Car(inputMake, inputModel, drivetrainType, fuelType, inputYearOfProduction, inputMileage, isused, bodyType, marketSegment));
    }
    protected void addTruck() {
        System.out.println("Input Make");
        String inputMake = scanner.nextLine();
        System.out.println("Input Model");
        String inputModel = scanner.nextLine();
        System.out.println("Provide vehicle type. Available types:" + BodyType.printNice());
        int bodyTypeNumber = scanner.nextInt();
        BodyType bodyType =  BodyType.decode(bodyTypeNumber - 1);
        System.out.println("Provide drivetrain type. Available types:" + DrivetrainType.printNice());
        int drivetrainNumber = scanner.nextInt();
        DrivetrainType drivetrainType =  DrivetrainType.decode(drivetrainNumber - 1);
        System.out.println("Provide fuel type. Available types:" + FuelType.printNice());
        int fuelTypeNumber = scanner.nextInt();
        FuelType fuelType =  FuelType.decode(fuelTypeNumber - 1);
        System.out.println("Input year of production");
        int inputYearOfProduction = scanner.nextInt();
        System.out.println("Input mileage");
        int inputMileage = scanner.nextInt();
        System.out.println("Provide market segment. Available types:" + MarketSegment.printNice());
        int marketNumber = scanner.nextInt();
        MarketSegment marketSegment =  MarketSegment.decode(marketNumber - 1);
        System.out.println("Provide Cab type. Available types:" + CabType.printNice());
        int cabNumber = scanner.nextInt();
        CabType cabType =  CabType.decode(cabNumber - 1);

        System.out.println("Is it <new> or <used> car?");
        String inputUsed = scanner.nextLine();
        boolean isused;
        if ("new".equals(inputUsed)) {
            isused = false;
        } else {
            isused = true;
        }
        System.out.println("Input number of axles");
        int inputaxles = scanner.nextInt();

        availableVeh.add(new Truck(inputMake, inputModel, drivetrainType, fuelType, inputYearOfProduction, inputMileage, isused, bodyType,cabType, inputaxles));
    }
    protected void subtractVehicle() {
        System.out.println("Which vehicle do you want to delete? ");
        for (Vehicle v : availableVeh) {
            System.out.print(availableVeh.indexOf(v));
            System.out.println(
                            v.getMake() + " " +
                            v.getModel() + " " +
                            v.getYearOfProduction() + " " +
                            v.getMileage() + "km"
            );
        }
        int choice = scanner.nextInt();
        availableVeh.remove(choice);

    }
    protected void guiSubtractVehicle(int index) {
        availableVeh.remove(index);

    }
    static void printAvailableVeh(){
        for (Vehicle v : availableVeh) {
            System.out.print(availableVeh.indexOf(v));
            System.out.println(
                    v.getMake() + " " +
                            v.getModel() + " " +
                            v.getYearOfProduction() + " " +
                            v.getMileage() + "km"
            );
        }
    }
    public String[] getList(){
        Object[] conv = availableVeh.toArray();
        String[] conv2 = Arrays.stream(conv).toArray(String[]::new);
        return conv2;
    }
    public String[] stringArray(){
        String [] veh = new String[availableVeh.size()];
        for(Vehicle v : availableVeh) {
            veh[availableVeh.indexOf(v)] = availableVeh.indexOf(v) + " " +
                    v.getMake() + " " +
                    v.getModel() + " " +
                    v.getStringYearOfProduction() + " "+
                    v.getBodyType() + " " +
                    v.getStringMileage() + " " +
                    v.getStringDrivetrain() + " " +
                    v.getStringFuelType() + " " +
                    v.getStringUsed();
        }
        return veh;
    }
}

