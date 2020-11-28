package com.company;

public enum BodyType {
    PICKUP,
    COUPE,
    SEDAN,
    HATCHBACK,
    SEMITRUCK,
    OTHER;

    public static BodyType decode(int typeNumber) {
        return BodyType.values()[typeNumber];
    }

    public static String printNice() {
        return "1. PICKUP\n" +
                "2. CUOPE\n" +
                "3. SEDAN\n" +
                "4. HATCHBACK\n" +
                "5. SEMITRUCK\n" +
                "6. OTHER\n";
    }
}

