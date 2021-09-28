package ex29;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class BadInput {
    public static int calculate(String r){
        return 72 / Integer.parseInt(r);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int years;
        String r;

        System.out.print("What is the rate of return? ");
        r = input.next();

        while(!r.matches("[1-9][0-9]*")){    //traps bad input, literally
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("What is the rate of return? ");
            r = input.next();
        }

        years = calculate(r);
        System.out.printf("It will take %.2f years to double your initial investment.", years);
    }
}
