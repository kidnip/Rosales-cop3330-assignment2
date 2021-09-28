package ex25;

import ex24.Word;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class PasswordStrength {
    static int passwordValidator(String password){
        password = password.toLowerCase();

        if(password.length() < 8) {
            if (password.matches("[0-9]+"))
                return 1;

            else if (password.matches("[a-z]+"))
                return 2;
        }
        else {
            if(password.matches("^[\\s\\w\\d]*[a-z0-9]+"))
                return 3;
            else
                return 4;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Word password = new Word();
        int result;
        String strength = null;

        System.out.print("Enter a password: ");
        password.setA(input.next());
        result = passwordValidator(password.getA());

        switch(result){
            case 1:
                strength = "very weak";
                break;
            case 2:
                strength = "weak";
                break;
            case 3:
                strength = "strong";
                break;
            case 4:
                strength = "very strong";
                break;
        }
        System.out.println("The password '" +password.getA() +"' is a " +strength +" password.");

    }
}
