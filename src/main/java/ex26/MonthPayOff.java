package ex26;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class MonthPayOff {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float i, APR, b, p, n1;
        int n2;

        System.out.print("What is your balance? ");
        b = input.nextFloat();
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = input.nextFloat()/100f;
        System.out.print("What is the monthly payment you can make? ");
        p = input.nextFloat();

        i = APR / 365f;
        n1 = PaymentCalculator.calculateMonthsUntilPaidOff(i, b, p);
        n2 = (int) PaymentCalculator.calculateMonthsUntilPaidOff(i, b, p);

        if(n1 > n2) //to round up, if necessary
            n2 += 1;
        System.out.printf("It will take you %d months to pay off this card", n2);
    }
}
