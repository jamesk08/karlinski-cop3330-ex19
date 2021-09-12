/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class BmiCalculator
{
    final static double BMI_LOW_END = 18.5;
    final static double BMI_HIGH_END = 25;

    public double getInput(String prompt)
    {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);

        double inputValue = 0;
        if(scanner.hasNextDouble())
        {
            return scanner.nextDouble();
        }
        else
        {
            System.out.println("Validation Error: Input must be numeric.");
            System.exit(0);
        }
        return inputValue;
    }

    public double calculateBmi(double weight, double height)
    {
        return (weight / (height * height)) * 703;
    }

    public void displayMessage(double result)
    {
        String message = MessageFormat.format("Your BMI is {0}.\n", result);
        if (result < BMI_LOW_END)
            message += "You are underweight. You should see your doctor.";
        else if(result > BMI_HIGH_END)
            message += "You are overweight. You should see your doctor.";
        else
            message += "You are within the ideal weight range.";

        System.out.println(message);
    }
}
