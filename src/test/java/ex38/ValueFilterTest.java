package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ValueFilterTest {

    @Test
    void filterEvenNumbers() {
        String[] testArray1 = {"1", "2", "3", "4", "5", "6"};
        String[] testArray2 = {"2", "4", "6"};

        assertArrayEquals(testArray2, ValueFilter.filterEvenNumbers(testArray1));
    }

    @Test
    void main() {
    }
}