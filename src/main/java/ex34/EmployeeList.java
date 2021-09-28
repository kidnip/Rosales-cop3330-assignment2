package ex34;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class EmployeeList {
    public static String[] removeName(String remove, String[] list)
    {
        String[] newList = new String[list.length-1];
        int i, flag = 0;
        for(i = 0; i < newList.length; i++)
        {
            if(list[i].equals(remove) || flag == 1)
            {
                newList[i] = list[i+1];
                flag = 1;
            }else
            {
                newList[i] = list[i];
            }
        }
        return newList;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] EmployeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String remove;
        int i;

        System.out.println("There are 5 employees: ");
        for(i = 0; i < EmployeeList.length; i++)
        {
            System.out.println(EmployeeList[i]);
        }

        System.out.print("\nEnter an employee name to remove: ");
        remove = input.nextLine();
        EmployeeList = removeName(remove, EmployeeList);

        System.out.println("\nThere are 4 employees: ");
        for(i = 0; i < EmployeeList.length; i++)
        {
            System.out.println(EmployeeList[i]);
        }
    }
}
