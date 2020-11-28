package com.company;

public class Truck  extends Vehicle{

    private CabType cabType;
    int numOfAxles;

    public Truck(String make, String model, DrivetrainType drivetrain, FuelType fuelType, int yearOfProduction, int mileage, boolean used, BodyType bodyType, CabType cabType, int numOfAxles) {
        super(make, model, drivetrain, fuelType, yearOfProduction, mileage, used, bodyType);
        this.cabType = cabType;
        this.numOfAxles = numOfAxles;
    }
}
