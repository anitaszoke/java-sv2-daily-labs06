package day04;


import day04.hangman.BusinessModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BusinessModelTest {

    @Test
    void testSimpleWord() {
        BusinessModel businessModel = new BusinessModel("aaaa", 3);
        businessModel.takeGuess("a");
        assertTrue(businessModel.won());
    }

    @Test
    void testSimpleWordFail() {
        BusinessModel businessModel = new BusinessModel("aaaa", 3);
        businessModel.takeGuess("b");
        assertFalse(businessModel.won());
    }

}
