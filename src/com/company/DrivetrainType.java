package com.company;

public enum DrivetrainType {
    RWD,
    FWD,
    AWD;

    public static DrivetrainType decode(int typeNumber) {
        return DrivetrainType.values()[typeNumber];
    }
    public static String printNice() {
        return "1. RWD\n" +
                "2. FWD\n" +
                "3. AWD\n";
    }
}
