package pl.bekz.model.imp;

import pl.bekz.model.PasswordComponent;
import pl.bekz.model.CopyToClipboard;
import pl.bekz.model.PasswordContent;
import pl.bekz.model.PasswordSetting;

import java.util.*;

public class GeneratorImp extends PasswordContent implements PasswordComponent {
    private String passComponent;
    private int passLength;
    private List<Character> passwordElementsList = new ArrayList<>();
    private String password;

    public void choosePasswordChars() {
        Scanner in = new Scanner( System.in );
        this.passComponent = in.nextLine();

        toUpperCase();
    }

    private String toUpperCase(){
        return passComponent.toUpperCase();
    }

    public void choosePasswordLength() {
        Scanner in = new Scanner( System.in );
        this.passLength = in.nextInt();
    }

    public void generatePassword() {
        PasswordSetting passwordSetting = new PasswordSetting();
        for (int i = 0; i < passLength; i++) {
            singleSign();
            Collections.shuffle( passwordElementsList );
        }
        convertListToString();
    }

    private void singleSign() {
        Random random = new Random();
        int randomNumberOfPasswordComponents = random.nextInt( passComponent.length() );
        char letter = passComponent.charAt( randomNumberOfPasswordComponents );

        switch (letter) {
            case symbol:
                passwordElementsList.add( drawSymbol() );
                return;
            case number:
                passwordElementsList.add( drawNumber() );
                return;
            case uppercaseCharacter:
                passwordElementsList.add( drawUpperCaseChar() );
                return;
            case lowercaseCharacter:
                passwordElementsList.add( drawLowerCaseChar() );
                return;
            default:
                System.out.println( "Wrong choice" );
                System.exit( 0 );
        }
    }

    private void convertListToString() {
        StringBuilder sb = new StringBuilder();
        for (Character passCharacters : passwordElementsList) {
            sb.append( passCharacters );
        }
        password = sb.toString();
    }

    public void copyToClipBoard() {
        CopyToClipboard toClipboard = new CopyToClipboard();

        toClipboard.copyToClip( password );
    }
}
