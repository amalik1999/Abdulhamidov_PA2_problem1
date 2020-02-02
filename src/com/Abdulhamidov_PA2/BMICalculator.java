package com.Abdulhamidov_PA2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        double bmi = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select which formula to use: 1. pounds&inches 2. kilograms&meters");
        int formula = scan.nextInt();

        if (formula == 1) {
            System.out.println("Weight in pounds: ");
            double pound = scan.nextDouble();

            System.out.println("Height in inches: ");
            double inches = scan.nextDouble();

            bmi = (703 * pound) / (inches * inches);

        } else if (formula == 2) {
            System.out.println("Weight in kilograms: ");
            double kg = scan.nextDouble();

            System.out.println("Height in Meters: ");
            double meters = scan.nextDouble();

            bmi = kg / (meters * meters);

        } else {
            System.out.println("Invalid Selection!!!");

        }

        System.out.println("BMI = "+bmi);
        System.out.println();

        if(bmi<18.5) {
            System.out.println("According to National Heart, Lung, and Blood Institute, your BMI is underweight");
        }else if(bmi>=18.5||bmi<=24.9) {
            System.out.println("According to National Heart, Lung, and Blood Institute, your BMI is Normal Weight");
        }else if(bmi>=25||bmi<=29.9) {
            System.out.println("According to National Heart, Lung, and Blood Institute, your BMI is Overweight");
        }else{
            System.out.println("According to National Heart, Lung, and Blood Institute, your BMI is Obesity");
        }

        System.out.println("Thanks for using the BMI Calculator!");

    }

}
