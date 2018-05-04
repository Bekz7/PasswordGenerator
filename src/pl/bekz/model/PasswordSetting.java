package pl.bekz.model;

import java.util.Scanner;

public class PasswordSetting {
    private static final String REGEX = "\\w";

    private String passComponent;
    private int passLength;

    public String getPassComponent() {
        return passComponent;
    }

    public int getPassLength() {
        return passLength;
    }

    public void readSignsFromInput() {
        Scanner in = new Scanner( System.in );
        String input = in.nextLine();

        if (isCharacters( input )) {
            this.passComponent = input.toUpperCase();
        } else {
            throw new IllegalArgumentException( "Options is not an alphanumerical signs" );
        }
    }

    private boolean isCharacters(String input) {
//        return input.matches( REGEX ) ? true : false;
        // TODO fix my pattern
        return true;
    }

    public void readPasswordLengthFromInput() {
        Scanner in = new Scanner( System.in );
        this.passLength = in.nextInt();
    }

}
