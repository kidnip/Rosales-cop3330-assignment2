package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadInputTest {
    @Test
    void calculate() {
        String n = "4";
        assertEquals(18, BadInput.calculate(n));
    }

    @Test
    void main() {
    }
}