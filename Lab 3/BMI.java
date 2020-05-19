/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can calculate an individuals BMI based off of the
answers provided and be able to state what category the input falls under
*/
import java.util.Scanner;
public class BMI{
	public static void main (final String[] args) {
        Scanner myDouble = new Scanner(System.in);

        //takes input and assigns it as pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = myDouble.nextDouble();

        //takes input and assigns it as inches
        System.out.print("Enter height in inches: ");
        double inches = myDouble.nextDouble();
        
        //checks to see if pounds or inches is negative
        if(pounds<0 || inches<0){
                System.out.print("Invalid input.");
                System.exit(1);
        }
        //converts pounds to kilograms
        double kilograms = pounds * 0.45359237;

        //converts inches to meters
        double meters = inches * 0.0254;

        //calculates bmi
        double bmi = kilograms/(meters*meters);
        System.out.println("BMI: " + bmi);
        if(bmi<18.5){
                System.out.print("Underweight");
        }
        else if(bmi>=18.5 && bmi<25.0){
                System.out.print("Normal");
        }
        else if(bmi>=25.0 && bmi<30.0){
                System.out.print("Overweight");
        }
        else if(bmi>=30.0){
                System.out.print("Obese");
        }

	}
}