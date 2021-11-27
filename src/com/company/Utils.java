package com.company;

public class Utils {
    // коллекция имен для генератора работников
    private static final String[] names = {"John", "Bill", "Ashton","Elon","Miles","Mike","Elton","Shaggy","Boris","Samuel"};

    public static String getRandomName() {
        return names[(int) (Math.random() * names.length)];
    }
}
