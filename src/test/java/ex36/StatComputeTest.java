package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatComputeTest {

    @Test
    void average() {
        int[] inputs = {100, 200, 1000, 300};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : inputs)
            list.add(i);

        int counter = 4;
        assertEquals(400f, StatCompute.average(list, counter));
    }

    @Test
    void min() {
    }

    @Test
    void max() {
    }

    @Test
    void std() {
    }

    @Test
    void main() {
    }
}