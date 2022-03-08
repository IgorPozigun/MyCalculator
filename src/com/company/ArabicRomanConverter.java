package com.company;

import java.util.List;

public class ArabicRomanConverter {
    public static String arabicToRoman(int number) {
        if ((number <= 0)) {
            throw new IllegalArgumentException("Roman can't be less or equal zero");
        }

        List<RomanNumber> romanNumerals = RomanNumber.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumber currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
