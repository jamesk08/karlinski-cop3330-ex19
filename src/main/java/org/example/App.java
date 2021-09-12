/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

public class App
{
    public static void main( String[] args )
    {
        BmiCalculator bmiCalculator = new BmiCalculator();
        double weight = bmiCalculator.getInput("Please enter your weight pounds: ");
        double height = bmiCalculator.getInput("Please enter your height in inches: ");
        double result = bmiCalculator.calculateBmi(weight, height);
        bmiCalculator.displayMessage(result);
    }
}