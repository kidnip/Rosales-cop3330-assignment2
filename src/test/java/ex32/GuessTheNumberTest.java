package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    @Test
    void createRandom() {
        int difficulty = 1;
        int goal = GuessTheNumber.createRandom(difficulty);
        assertTrue((goal >= 1 && goal <= 10));
    }

    @Test
    void main() {
    }
}