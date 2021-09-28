package ex31;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class KarvonenHeartRate {
    public static int calcTarget(int age, int restingHR, float intensity){
        return (int) (((220 - age) - restingHR) * intensity) + restingHR;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, age, restingHR, target;
        float intensity;

        System.out.print("What is your age? ");
        age = input.nextInt();
        System.out.print("What is your resting heart rate? ");
        restingHR = input.nextInt();

        System.out.println("Resting Pulse: " +restingHR +"\t\tAge: " +age);
        System.out.println("\nIntensity\t | Rate");
        System.out.println("-------------|--------");
        for(i = 55; i <= 95; i += 5){
            intensity = i/100f;
            target = calcTarget(age, restingHR, intensity);
            System.out.println(i +"%\t\t\t | " +target +" bpm");
        }
    }
}
