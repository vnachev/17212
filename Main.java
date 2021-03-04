package com.JJ03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        catcher();
    }

    private static void catcher (){
        int number;

        try {
            number = enterNumber();
        }

        catch (Exception e) {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("ГРЕШКА! Опитайте отново!");
            System.out.println("Допустими стойности при въвеждане: ЦЕЛИ ПОЛОЖИТЕЛНИ ЧИСЛА до 3999 САМО!");
            System.out.println("-------------------------------------------------------------------------------------------");
            catcher();
            number = 1;
        }
        RomanNumerals.convertor(number);
    }

    private static int enterNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Въведете число за преобразуване: ");
        int i = input.nextInt();
        if (i > 3999 || i < 1) {
            throw new ArithmeticException("Number is too big or too small!");
        }
        return i;
    }
}

