package ex36;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class StatCompute
{
    public static float average(ArrayList<Integer> list, int counter)
    {
        int i, sum = 0;
        float result;

        for(i = 0; i < counter; i++)
        {
            sum += list.get(i);
        }

        result = (float) sum / counter;
        return result;
    }

    public static int min(ArrayList<Integer> list, int counter)
    {
        int i, min;

        min = list.get(0);
        for(i = 1; i < counter; i++)
        {
            if(min > list.get(i))
            {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> list, int counter)
    {
        int i, max;

        max = list.get(0);
        for(i = 1; i < counter; i++)
        {
            if(max < list.get(i))
            {
                max = list.get(i);
            }
        }
        return max;
    }

    public static float std(ArrayList<Integer> list, int counter, float mean)
    {
        int i;
        float result, sum = 0;

        for(i = 0; i < counter; i++)
        {
            sum += pow((list.get(i) - mean), 2);
        }

        sum = sum / counter;
        result = (float) sqrt(sum);

        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        String number;
        int i, min, max, counter = 0;
        float average, std;

        System.out.print("Enter a number: ");
        number = input.next();
        while(number.matches("[0-9]+"))
        {
            numberList.add(Integer.parseInt(number));
            counter += 1;
            System.out.print("Enter a number: ");
            number = input.next();
        }

        System.out.print("Numbers: ");
        for(i = 0; i < counter; i++)
        {
            if(i > 0)
                System.out.print(", ");
            System.out.print(numberList.get(i));
        }

        average = average(numberList, counter);
        System.out.printf("\nThe average is: %.1f\n", average);
        min = min(numberList, counter);
        System.out.println("The minimum is " +min);
        max = max(numberList, counter);
        System.out.println("The maximum is " +max);
        std = std(numberList, counter, average);
        System.out.printf("The standard deviation is %.2f", std);
    }
}
