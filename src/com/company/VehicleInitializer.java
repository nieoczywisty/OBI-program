package com.company;

import java.util.ArrayList;

public class VehicleInitializer {
    public static ArrayList<Vehicle> initialize() {
        ArrayList result = new ArrayList();
        result.add(new Car("BMW", "e36",DrivetrainType.RWD, FuelType.LPG, 1992, 3402324, true, BodyType.COUPE, MarketSegment.S));
        result.add(new Car("Audi", "80",DrivetrainType.AWD, FuelType.GASOLINE, 1989, 5002156, true, BodyType.SEDAN, MarketSegment.C));
        result.add(new Car("Skoda", "Fabia",DrivetrainType.FWD, FuelType.DIESEL, 2012, 13024, true, BodyType.HATCHBACK, MarketSegment.B));
        result.add(new Car("Fiat", "500",DrivetrainType.FWD, FuelType.LPG, 2015, 10000, true, BodyType.HATCHBACK, MarketSegment.A));
        result.add(new Truck("KENWORTH", "T470",DrivetrainType.RWD, FuelType.DIESEL, 1980, 12347853, true, BodyType.SEMITRUCK, CabType.LONGNOSE, 3));
        result.add(new Truck("MAN", "TGA",DrivetrainType.RWD, FuelType.DIESEL, 2014, 82347853, true, BodyType.SEMITRUCK, CabType.SINGLE_CAB, 2));
        result.add(new Truck("MAN", "TGS",DrivetrainType.RWD, FuelType.DIESEL, 2018, 62347853, true, BodyType.SEMITRUCK, CabType.DOUBLE_CAB, 3));
        result.add(new Truck("Mercedes", "Actross",DrivetrainType.RWD, FuelType.DIESEL, 2005, 32347853, true, BodyType.SEMITRUCK, CabType.SINGLE_CAB, 3));


        return result;
    }
}
