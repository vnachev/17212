package com.JJ03;

import java.util.ArrayList;

public class RomanNumerals {
    public int value;
    public String symbol;

    static int n = 0;
    static RomanNumerals[] allNumerals = new RomanNumerals[13];


    public RomanNumerals(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
        allNumerals[n] = this;
        n++;
    }

    public static void convertor(Integer number) {

        RomanNumerals M = new RomanNumerals(1000, "M");
        RomanNumerals CM = new RomanNumerals(900, "CM");
        RomanNumerals D = new RomanNumerals(500, "D");
        RomanNumerals CD = new RomanNumerals(400, "CD");
        RomanNumerals C = new RomanNumerals(100, "C");
        RomanNumerals XC = new RomanNumerals(90, "XC");
        RomanNumerals L = new RomanNumerals(50, "L");
        RomanNumerals XL = new RomanNumerals(40, "XL");
        RomanNumerals X = new RomanNumerals(10, "X");
        RomanNumerals IX = new RomanNumerals(9, "IX");
        RomanNumerals V = new RomanNumerals(5, "V");
        RomanNumerals IV = new RomanNumerals(4, "IV");
        RomanNumerals I = new RomanNumerals(1, "I");

        String[] convertedNumber = new String[15];

        int i = 0;
        for (RomanNumerals num : allNumerals) {

                while (number >= num.value) {
                    convertedNumber[i] = num.symbol;
                    number = number - num.value;
                    i++;
                }

        }

        for (String string : convertedNumber) {

            if (string != null) {
                System.out.print(string);
            }

        }

        System.exit(0);
    }
}