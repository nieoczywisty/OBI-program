package com.company;

public enum MarketSegment {
    A, //mini cars
    B, //small cars
    C, //medium cars
    D, //large cars
    E, //executive cars
    F, //luxury cars
    S, //sport coupes
    H, //cabrio
    J, //SUV
    M; //MPV

    public static MarketSegment decode(int typeNumber) {
        return MarketSegment.values()[typeNumber];
    }
    public static String printNice() {
        return  "1. A, //mini cars\n" +
                "2. B, //small cars\n" +
                "3. C, //medium cars\n" +
                "4. D, //large cars\n" +
                "5. E, //executive cars\n" +
                "6. F, //luxury cars\n" +
                "7. S, //sport coupes\n" +
                "8. H, //cabrio\n" +
                "9. J, //SUV\n" +
                "10 M; //MPV\n";

    }
}
