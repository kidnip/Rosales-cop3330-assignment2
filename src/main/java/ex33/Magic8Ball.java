package ex33;

import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Magic8Ball {
    public static String ballAnswer(String[] answers){
        Random rand = new Random();
        return answers[rand.nextInt(answers.length)];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};

        System.out.println("What's your question?");
        System.out.print("> ");
        input.next();

        System.out.print("\n" +ballAnswer(answers));
    }
}
