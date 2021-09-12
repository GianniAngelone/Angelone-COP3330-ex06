/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
import java.time.Year;
public class Exercise06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Here we take in the input from a user
        System.out.print("What is your current age? ");
        String Number1 = input.nextLine();
        System.out.print("At what age would you like to retire? ");
        String Number2 = input.nextLine();
        //Since we can't do math with strings, we have to convert it
        int currentAge = Integer.parseInt(Number1);
        int retirementAge = Integer.parseInt(Number2);
        System.out.print(String.format("You have %d years left until you can retire.\n", retirementAge - currentAge));
        //We take the previous amount of years left, and add it to the current year, to find out exactly which year
        //the user can retire.
        int year=Year.now().getValue();
        System.out.print(String.format("It's %d, so that means you can retire in %d\n", year, year+(retirementAge - currentAge)));
    }
}
