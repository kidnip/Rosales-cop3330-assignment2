package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {
    @Test
    void ballAnswer() {
        String[] test = {"1", "2", "3", "4"};
        String result = Magic8Ball.ballAnswer(test);

        assertNotEquals(null, result);
    }

    @Test
    void main() {
    }
}