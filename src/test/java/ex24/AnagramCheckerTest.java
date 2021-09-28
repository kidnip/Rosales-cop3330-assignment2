package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram() {
        String test1 = "star";
        String test2 = "rats";
        assertTrue(AnagramChecker.isAnagram(test1, test2));
    }

    @Test
    void main() {
    }
}