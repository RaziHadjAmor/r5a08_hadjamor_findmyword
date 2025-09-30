package r5a08_findmyword;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WordTest {
    @Test
    void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot a déviner fait une lettre

        // Act
        Score score = word.guess("B"); // tentative du joueur
        Letter expected = Letter.INCORRECT;
        Letter actual = score.letter(0);

        //Assert
        assertEquals(Letter.INCORRECT, score.letter(0));
    }
}
