package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAdderTest {
    @Test
    void sum() {
        int[] test = {1, 2, 3, 4, 5};
        assertEquals(15, NumberAdder.sum(test));
    }

    @Test
    void main() {
    }
}