package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {
    @Test
    void passwordValidator() {
        assertEquals(1, PasswordStrength.passwordValidator("1234567"));
    }

    @Test
    void main() {
    }
}