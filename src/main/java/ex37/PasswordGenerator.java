package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class PasswordGenerator {
    public static ArrayList<Character> createList(String string){
        ArrayList<Character> list = new ArrayList<>();
        for(char c: string.toCharArray())  //creates lists of characters to use
            list.add(c);

        return list;
    }

    public static ArrayList<Character> passwordBuilder(int minLength, int s, int n)
    {
        Random rand = new Random();

        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "0123456789";
        String s3 = "!@#$%^&*?";
        ArrayList<Character> letters = createList(s1);
        ArrayList<Character> numbers = createList(s2);
        ArrayList<Character> special = createList(s3);

        ArrayList<Character> password = new ArrayList<>();

        for(int i = 0; i < minLength; i++){
            if(s > 0){
                password.add(special.get(rand.nextInt(special.size())));
                s--;
                continue;
            }
            if(n > 0){
                password.add(numbers.get(rand.nextInt(numbers.size())));
                n--;
                continue;
            }
            password.add(letters.get(rand.nextInt(letters.size())));
        }

        Collections.shuffle(password);
        return password;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int minLength, s, n, i;

        System.out.print("What's the minimum length? ");
        minLength = input.nextInt();
        System.out.print("How many special characters? ");
        s = input.nextInt();
        System.out.print("How many numbers? ");
        n = input.nextInt();

        ArrayList<Character> password = passwordBuilder(minLength, s, n);

        System.out.print("Your password is ");
        for(i = 0; i < minLength; i++){
            System.out.print(password.get(i));
        }
    }
}
