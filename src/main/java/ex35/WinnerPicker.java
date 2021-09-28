package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class WinnerPicker
{
    public static String pick(ArrayList<String> list, int counter){
        Random rand = new Random();
        return list.get(rand.nextInt(counter));
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        String name, winner;
        int counter = 0;

        System.out.print("Enter a name: ");
        name = input.nextLine();
        while(!name.equals(""))
        {
            nameList.add(name);
            counter += 1;
            System.out.print("Enter a name: ");
            name = input.nextLine();
        }

        winner = pick(nameList, counter);
        System.out.println("The winner is... " +winner);
    }
}
