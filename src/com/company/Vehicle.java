package com.company;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public abstract class Vehicle implements Cloneable{
    private String make, model;
    private int yearOfProduction, mileage;
    private boolean used;
    private BodyType bodyType;
    private FuelType fuelType;
    private DrivetrainType drivetrain;


    public Vehicle(String make, String model, DrivetrainType drivetrain, FuelType fuelType, int yearOfProduction, int mileage, boolean used, BodyType bodyType) {
        this.make = make;
        this.model = model;
        this.drivetrain = drivetrain;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.mileage = mileage;
        this.used = used;
        this.bodyType = bodyType;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getStringMileage(){
        return String.valueOf(mileage);
    }
    public String getStringDrivetrain(){
        return String.valueOf(drivetrain);
    }
    public String getStringFuelType(){
        return String.valueOf(fuelType);
    }
    public String getStringUsed(){
        return String.valueOf(used);
    }
    public String getBodyType(){
        return String.valueOf(bodyType);
    }
    public int getMileage() {
        return mileage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public String getStringYearOfProduction() {
        return String.valueOf(yearOfProduction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return used == vehicle.used &&
                Objects.equals(make, vehicle.make) &&
                bodyType == vehicle.bodyType &&
                mileage == vehicle.mileage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, used, bodyType);
    }
}


