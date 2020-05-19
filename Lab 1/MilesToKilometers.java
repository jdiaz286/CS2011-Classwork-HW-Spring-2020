/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that converts miles to kilometers
*/
import java.util.Scanner;
public class MilesToKilometers{
	public static void main (final String[] args) {
        Scanner myDouble = new Scanner(System.in);
        //gets a number and assigns it as miles
        System.out.print("Enter number of miles: ");
        double miles = myDouble.nextDouble();
        //converts miles into kilometers
        double kilometers = miles *1.6;
        System.out.println(miles + " miles is " + kilometers+ " km.");
	}
}