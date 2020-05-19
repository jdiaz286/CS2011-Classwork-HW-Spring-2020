/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that converts cups into tablespoons
*/
import java.util.Scanner;
public class CupsToTablespoons{
	public static void main (final String[] args) {
        Scanner myCups = new Scanner(System.in);
        //gets number and assigns it as cups
        System.out.print("Enter number of cups: ");
        double cups = myCups.nextDouble();
        //converts cups into tablespoons
        double tablespoons = cups*16.213;
        System.out.println(cups+ " cups is " + tablespoons + " tablespoons");
	}
}