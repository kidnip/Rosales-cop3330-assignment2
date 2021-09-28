package ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    @Test
    void createList() {
        String test = "test phrase";
        ArrayList<Character> testList = PasswordGenerator.createList(test);

        assertNotNull(testList);
    }

    @Test
    void passwordBuilder() {
    }

    @Test
    void main() {
    }
}