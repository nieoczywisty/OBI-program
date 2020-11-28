package com.company;

public class Car extends Vehicle {

    private MarketSegment segment;

    public Car(String make, String model, DrivetrainType drivetrain, FuelType fuelType, int yearOfProduction, int mileage, boolean used, BodyType bodyType, MarketSegment segment) {
        super(make, model, drivetrain, fuelType, yearOfProduction, mileage, used, bodyType);
        this.segment = segment;
    }
}
