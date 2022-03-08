package com.company;

import java.util.Scanner;

public class MyСalculator {

    public static void main(String[] args) {
        Scanner myFirstScanner = new Scanner(System.in);
        String c = myFirstScanner.nextLine();
        String[] goInMassive = c.split(" ");
        int[] goInMassive2 = new int[goInMassive.length];
        char arth = '0';

        if ((goInMassive[0].equals("I") || goInMassive[0].equals("II") || goInMassive[0].equals("III") || goInMassive[0].equals("IV") || goInMassive[0].equals("V") || goInMassive[0].equals("VI") || goInMassive[0].equals("VII") || goInMassive[0].equals("VIII") || goInMassive[0].equals("IX") || goInMassive[0].equals("X")) && (goInMassive[2].equals("I") || goInMassive[2].equals("II") || goInMassive[2].equals("III") || goInMassive[2].equals("IV") || goInMassive[2].equals("V") || goInMassive[2].equals("VI") || goInMassive[2].equals("VII") || goInMassive[2].equals("VIII") || goInMassive[2].equals("IX") || goInMassive[2].equals("X"))) {
            for (int o = 0; o < goInMassive.length; ) {
                if (goInMassive[o].equals("/")) {
                    arth = '/';
                    o++;
                    continue;
                }
                if (goInMassive[o].equals("*")) {
                    arth = '*';
                    o++;
                    continue;
                }
                if (goInMassive[o].equals("-")) {
                    arth = '-';
                    o++;
                    continue;
                }
                if (goInMassive[o].equals("+")) {
                    arth = '+';
                    o++;
                    continue;
                }
                goInMassive2[o] = RomanArabicConverter.romanToArabic(goInMassive[o]);
                o++;
            }
            int a = goInMassive2[0];
            int b = goInMassive2[2];
            int ab;
            if (arth == '/') {
                ab = a / b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicRomanConverter.arabicToRoman(ab));
                } else {
                    System.out.println(ArabicRomanConverter.arabicToRoman(ab));
                }
            }
            if (arth == '*') {
                ab = a * b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicRomanConverter.arabicToRoman(ab));
                } else {
                    System.out.println(ArabicRomanConverter.arabicToRoman(ab));
                }
            }
            if (arth == '-') {
                ab = a - b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicRomanConverter.arabicToRoman(ab));
                } else {
                    System.out.println(ArabicRomanConverter.arabicToRoman(ab));
                }
            }
            if (arth == '+') {
                ab = a + b;
                if (ab < 0) {
                    ab = Math.abs(ab);
                    System.out.println("-" + ArabicRomanConverter.arabicToRoman(ab));
                }
                System.out.println(ArabicRomanConverter.arabicToRoman(ab));
            }

        } else {
            int firstNumber = Integer.parseInt(goInMassive[0]);
            int secondNumber = Integer.parseInt(goInMassive[2]);
            int result;
            if ((firstNumber >= 0 & firstNumber <= 10) & (secondNumber >= 0 & secondNumber <= 10)) {
                switch (goInMassive[1]) {
                    case "+":
                        result = firstNumber + secondNumber;
                        System.out.println(result);
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        System.out.println(result);
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        System.out.println(result);
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        System.out.println(result);
                        break;
                }
            } else throw new IllegalArgumentException("Wrong input");
        }
    }
}
