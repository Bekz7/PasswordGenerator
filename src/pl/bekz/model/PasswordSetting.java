package pl.bekz.model;

import java.util.Scanner;

public class PasswordSetting {
    private String passComponent;
    private int passLength;

    public String getPassComponent() {
        return passComponent;
    }

    public int getPassLength() {
        return passLength;
    }

    public void passwordCharacters() {
        Scanner in = new Scanner( System.in );
        this.passComponent = in.nextLine();

       toUpperCase();
    }

    private void toUpperCase() {
       this.passComponent = getPassComponent().toUpperCase();
    }

    public void passwordLength() {
        Scanner in = new Scanner( System.in );
        this.passLength = in.nextInt();
    }
}
