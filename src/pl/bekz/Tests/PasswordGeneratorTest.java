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
            case SYMBOL:
                assertEquals( letter, SYMBOL );
                return;
            case NUMBER:
                assertEquals( letter, NUMBER );
                return;
            case UPPERCASE_CHARACTER:
                assertEquals( letter, UPPERCASE_CHARACTER );
                return;
            case LOWERCASE_CHARACTER:
                assertEquals( letter, LOWERCASE_CHARACTER );
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
            case SYMBOL:
                assertEquals( letter, SYMBOL );
                return;
            case NUMBER:
                assertEquals( letter, NUMBER );
                return;
            case UPPERCASE_CHARACTER:
                assertEquals( letter, UPPERCASE_CHARACTER );
                return;
            case LOWERCASE_CHARACTER:
                assertEquals( letter, LOWERCASE_CHARACTER );
                return;
            default:
                System.out.println( "Wrong choice" );
                System.exit( 0 );
        }
    }
}