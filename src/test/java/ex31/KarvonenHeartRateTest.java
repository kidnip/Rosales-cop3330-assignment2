package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {
    @Test
    void calcTarget() {
        int age = 22;
        int resting = 65;
        float intensity = 0.55f;
        assertEquals(138, KarvonenHeartRate.calcTarget(age, resting, intensity));
    }

    @Test
    void main() {
    }
}