package com.company;

public enum CabType {
    SINGLE_CAB,
    DOUBLE_CAB,
    LONGNOSE;


    public static CabType decode(int typeNumber) {
        return CabType.values()[typeNumber];
    }
    public static String printNice() {
        return "1. SINGLE_CAB\n" +
                "2. DOUBLE_CAB\n" +
                "3. LONGNOSE\n";
    }
}
