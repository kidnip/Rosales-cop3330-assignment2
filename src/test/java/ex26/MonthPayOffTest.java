package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthPayOffTest {
    @Test
    void calculateMonthsUntilPaidOff() {
        assertEquals(70, (int) PaymentCalculator.calculateMonthsUntilPaidOff(12f/100f/365f, 5000, 100) + 1);
    }

    @Test
    void main() {
    }
}