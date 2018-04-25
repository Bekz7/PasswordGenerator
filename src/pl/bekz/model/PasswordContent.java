package pl.bekz.model;

import java.util.Random;

public abstract class PasswordContent {
    private Random random = new Random();

    protected char drawLowerCaseChar() {
        final String LOWER_CASE_CHARACTER = "abcdefghijklmnoprstuwxyz";
        final int lowerCaseCharLength = LOWER_CASE_CHARACTER.length();
        return LOWER_CASE_CHARACTER.charAt( random.nextInt( lowerCaseCharLength ) );
    }

    protected char drawUpperCaseChar() {
        final String UPPER_CASE_CHARACTER = "ABCDEFGHIJKLMNOPRSTUWXYZ";
        final int upperCaseCharLength = UPPER_CASE_CHARACTER.length();
        return UPPER_CASE_CHARACTER.charAt( random.nextInt( upperCaseCharLength ) );
    }

    protected char drawSymbol() {
        final String SYMBOLS = "`~!@#$%^&*()_+=-,./<>?;':{}[]\\|";
        int symbolsLength = SYMBOLS.length();
        return SYMBOLS.charAt( random.nextInt( symbolsLength ) );
    }

    protected char drawNumber() {
        String numbers = "0123456789";
        int numbersLength = numbers.length();
        return numbers.charAt( random.nextInt( numbersLength ) );
    }
}
