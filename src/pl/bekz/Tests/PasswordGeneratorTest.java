package pl.bekz.Tests;

import org.junit.Test;
import pl.bekz.model.PasswordComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class PasswordGeneratorTest implements PasswordComponent {


    @Test
    public void printFromEmptyList() {
        List<Character> passwordElementsList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        passwordElementsList.clear();

        for (Character passCharacters : passwordElementsList) {
            sb.append( passCharacters );
        }

        assertNull( sb.toString() );
    }

    @Test
    public void drawLetter() {
        Random random = new Random();
        String choice = "SLUN";
        int randomNumberOfPasswordComponents = random.nextInt( choice.length() );
        char letter = choice.charAt( randomNumberOfPasswordComponents );

        switch (letter) {
            case symbol:
                assertEquals( letter, symbol );
                return;
            case number:
                assertEquals( letter, number );
                return;
            case uppercaseCharacter:
                assertEquals( letter, uppercaseCharacter );
                return;
            case lowercaseCharacter:
                assertEquals( letter, lowercaseCharacter );
                return;
            default:
                System.out.println( "Wrong choice" );
                System.exit( 0 );
        }
    }

    @Test
    public void drawEmptyLetter() {
        Random random = new Random();
        String choice = null;
        int randomNumberOfPasswordComponents = random.nextInt( choice.length() );
        char letter = choice.charAt( randomNumberOfPasswordComponents );

        switch (letter) {
            case symbol:
                assertEquals( letter, symbol );
                return;
            case number:
                assertEquals( letter, number );
                return;
            case uppercaseCharacter:
                assertEquals( letter, uppercaseCharacter );
                return;
            case lowercaseCharacter:
                assertEquals( letter, lowercaseCharacter );
                return;
            default:
                System.out.println( "Wrong choice" );
                System.exit( 0 );
        }
    }
}