package pl.bekz.model.impl;

import pl.bekz.model.PasswordComponent;
import pl.bekz.model.PasswordContent;
import pl.bekz.model.PasswordSetting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator extends PasswordContent implements PasswordComponent {
    private List<Character> passwordElementsList = new ArrayList<>();

    public void generatePassword(PasswordSetting setting) {
        for (int i = 0; i < setting.getPassLength(); i++) {
            singleSign( setting.getPassComponent() );
        }
        Collections.shuffle( passwordElementsList );
    }

    private void singleSign(String passComponent) {
        if (passComponent != null) {
            switch (randomLetter( passComponent )) {
                case SYMBOL:
                    passwordElementsList.add( drawSymbol() );
                    break;
                case NUMBER:
                    passwordElementsList.add( drawNumber() );
                    break;
                case UPPERCASE_CHARACTER:
                    passwordElementsList.add( drawUpperCaseChar() );
                    break;
                case LOWERCASE_CHARACTER:
                    passwordElementsList.add( drawLowerCaseChar() );
                    break;
                default:
                    System.out.println( "Wrong choice" );
                    System.exit( 0 );
            }
        }
    }

    private char randomLetter(String passComponent){
        Random random = new Random();
        int randomNumberOfPasswordComponents = random.nextInt( passComponent.length() );
        return passComponent.charAt( randomNumberOfPasswordComponents );
    }

    public String printPassword() {
        StringBuilder sb = new StringBuilder();
        for (Character passCharacters : passwordElementsList) {
            sb.append( passCharacters );
        }
        return String.valueOf( sb.toString() );
    }
}
