package ex26;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class PaymentCalculator {

    public static float calculateMonthsUntilPaidOff(float i, float b, float p){
        return (float) (-(1f/30f) * log(1f + b/p * (1f - pow((1f + i), 30f))) / log(1f + i));
    }
}
