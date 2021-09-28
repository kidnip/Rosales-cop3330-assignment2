package ex24;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class AnagramChecker {
    static boolean isAnagram(String word1, String word2){
        boolean flag;
        if(word1.length() != word2.length()){
            flag = false;
        }
        else{
            char[] wordArr1 = word1.toLowerCase().toCharArray();
            char[] wordArr2 = word2.toLowerCase().toCharArray();
            Arrays.sort(wordArr1);
            Arrays.sort(wordArr2);
            flag = Arrays.equals(wordArr1, wordArr2);
        }
        return flag;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Word word1 = new Word();
        Word word2 = new Word();
        boolean result;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        word1.setA(input.next());
        System.out.print("Enter the second string: ");
        word2.setA(input.next());

        result = isAnagram(word1.getA(), word2.getA());
        if(result)
            System.out.println("\"" +word1.getA() +"\" and \"" +word2.getA() +"\" are anagrams.");
        else
            System.out.println("\"" +word1.getA() +"\" and \"" +word2.getA() +"\" are not anagrams.");

    }
}
