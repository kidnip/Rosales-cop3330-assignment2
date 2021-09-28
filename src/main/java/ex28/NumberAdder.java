package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class NumberAdder {
    public static int sum(int[] numbers){
        int sum = 0;

        for(int i = 0 ; i < numbers.length; i++)
            sum += numbers[i];

        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum;

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }

        sum = sum(numbers);
        System.out.println("The total is " +sum +".");

    }
}

