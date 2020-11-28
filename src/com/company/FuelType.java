package com.company;

public enum FuelType {
    GASOLINE,
    DIESEL,
    HYDROGEN,
    LPG,
    CNG;

    public static FuelType decode(int typeNumber) {
        return FuelType.values()[typeNumber];
    }
    public static String printNice() {
        return "1. GASOLINE\n" +
                "2. DIESEL\n" +
                "3. HYDROGEN\n" +
                "4. LPG\n" +
                "3. CNG\n";
    }
}
