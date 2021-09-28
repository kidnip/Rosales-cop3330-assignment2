package ex27;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class InputTaker {
    public static boolean validateFirst(String name){
        if(name.length() >= 2) {
            return name.matches("\\w+");
        }
        else{
            System.out.println("The first name must be at least 2 characters long.");
            if(name.matches("\\s+"))                        //can only work if just space is inputted
                System.out.println("The first name must be filled in.");
        }
        return false;
    }

    public static boolean validateLast(String name){
        if(name.length() >= 2) {
            return name.matches("\\w+");
        }
        else{
            System.out.println("The last name must be at least 2 characters long.");
            if(name.matches("\\s+"))                        //can only work if just space is inputted
                System.out.println("The last name must be filled in.");
        }
        return false;
    }

    public static boolean validateZIP(String zip){
        if(zip.length() <= 5){
            if(zip.matches("\\d{5}"))
                return true;
            else{
                System.out.println("The zipcode must be a 5 digit number.");
                return false;
            }
        }
        else{
            System.out.println("The zipcode must be a 5 digit number.");
            return false;
        }
    }

    public static boolean validateID(String eid){
        if(eid.matches("\\w{2}-\\d{4}")){
            return true;
        }
        else {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
    }

    public static void validateInput(String f_name, String l_name, String zip, String eid){
        boolean a, b, c, d;
        a = validateFirst(f_name);
        b = validateLast(l_name);
        c = validateZIP(zip);
        d = validateID(eid);
        if(a && b && c && d)
            System.out.println("There were no errors found.");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String f_name, l_name, zip, eid;

        System.out.print("Enter the first name: ");
        f_name = input.nextLine();
        System.out.print("Enter the last name: ");
        l_name = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        eid = input.nextLine();
        validateInput(f_name, l_name, zip, eid);

    }
}
