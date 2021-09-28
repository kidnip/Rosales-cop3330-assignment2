package ex38;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class ValueFilter {
    public static String[] filterEvenNumbers(String[] list){
        ArrayList<String> newList = new ArrayList<>();
        int i;

        for(i = 0; i < list.length; i++){
            if(Integer.parseInt(list[i]) % 2 == 0) {
                newList.add(list[i]);
            }
        }
        return newList.toArray(new String[0]);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String numbers;

        System.out.print("Enter a list of numbers, separated by spaces: ");
        numbers = input.nextLine();
        String[] numberArray = numbers.split(" ");
        String[] newArray = filterEvenNumbers(numberArray);

        for(String c : newArray){
            System.out.print(c +" ");
        }

    }
}
