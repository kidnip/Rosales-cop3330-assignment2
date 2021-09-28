package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class WinnerPickerTest {
    @Test
    void pick() {
        String[] testArr = {"Homer", "Bart", "Maggie", "Lisa", "Moe"};
        ArrayList<String> testList = new ArrayList<>();
        Collections.addAll(testList, testArr);
        int counter = testArr.length;

        String result = WinnerPicker.pick(testList, counter);
        assertNotEquals(null, result);
    }

    @Test
    void main() {
    }
}