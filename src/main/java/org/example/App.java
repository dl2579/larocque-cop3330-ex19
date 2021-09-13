package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter your height in inches: " );
        float h = sc.nextFloat();
        System.out.print( "Enter your weight in pounds: " );
        float w = sc.nextFloat();

        float bmi = w/(h*h) * 703;
        System.out.printf("Your BMI is %.1f.%n", bmi);
        String advice = bmi >18.5 && bmi<25 ? "You are within the ideal weight range." : "You are overweight. You should see your doctor.";
        System.out.printf("%s%n", advice);
    }
}
