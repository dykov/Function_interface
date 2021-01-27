package com.company;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, String> converter = NumConverter::convertToString;
        String stringNum = converter.apply(12345); // "12345"

        Function<String, String> sqrtConverter = NumConverter::convertSqrtToString;
        String sqrtVal = sqrtConverter.apply("100"); // "10.0"
    }
}

class NumConverter {

    public static String convertToString(int num) {
        return String.valueOf(num);
    }

    public static String convertSqrtToString(String val) {
        return String.valueOf(Math.sqrt(Integer.parseInt(val)));
    }

}
