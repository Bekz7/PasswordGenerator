package pl.bekz.model.imp;

import pl.bekz.model.PasswordComponent;
import pl.bekz.model.PasswordContent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator extends PasswordContent implements PasswordComponent {
    private List<Character> passwordElementsList = new ArrayList<>();

    public void generatePassword(int passLength, String passComponent) {
        for (int i = 0; i < passLength; i++) {
            singleSign( passComponent );
            Collections.shuffle( passwordElementsList );
        }
    }

    private void singleSign(String passComponent) {
        try {
            switch (randomLetter( passComponent )) {
                case symbol:
                    passwordElementsList.add( drawSymbol() );
                    break;
                case number:
                    passwordElementsList.add( drawNumber() );
                    break;
                case uppercaseCharacter:
                    passwordElementsList.add( drawUpperCaseChar() );
                    break;
                case lowercaseCharacter:
                    passwordElementsList.add( drawLowerCaseChar() );
                    break;
                default:
                    System.out.println( "Wrong choice" );
                    System.exit( 0 );
            }
        }catch (NullPointerException e){
            System.out.println(e+ "");
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
