package ex32;

import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class GuessTheNumber
{
    public static int createRandom(int difficulty)
    {
        Random rand = new Random();
        int goal = 0;

        switch(difficulty)
        {
            case 1:
                goal = rand.nextInt(11 - 1);
                break;
            case 2:
                goal = rand.nextInt(101 - 1);
                break;
            case 3:
                goal = rand.nextInt(1001 - 1);
                break;
        }
        return goal;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int difficulty, goal, guess, counter = 1;
        String choice;

        System.out.println("Let's play Guess the Number!");

        while(true){
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            difficulty = input.nextInt();
            goal = createRandom(difficulty);

            System.out.print("I have my number. What's your guess? ");
            guess = input.nextInt();

            while(guess != goal){
                if(guess > goal){
                    System.out.print("Too high. Guess again: ");
                    guess = input.nextInt();
                    counter += 1;
                }
                else if(guess < goal){
                    System.out.print("Too low. Guess again: ");
                    guess = input.nextInt();
                    counter += 1;
                }
            }

            System.out.println("You go it in " +counter +" guesses!\n");
            counter = 1;

            System.out.print("Do you wish to play again (Y/N)? ");
            choice = input.next().toLowerCase();
            if(choice.equals("n"))
                break;
        }
    }
}
