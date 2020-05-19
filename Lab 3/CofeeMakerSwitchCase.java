/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can take a number and give back the requested order(all done using
switch-case code)
*/
import java.util.Scanner;
public class CofeeMakerSwitchCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your code (15-Espresso,23-Americano,32-Cappucino,41-Cafe Latte,56-Mocha): ");
        int userChoice=input.nextInt();
        switch(userChoice){
            case 15: System.out.print("Espresso"); break;
            case 23: System.out.print("Americano"); break;
            case 32: System.out.print("Cappucino"); break;
            case 41: System.out.print("Cafe Latte"); break;
            case 56: System.out.print("Mocha"); break;
            default: System.out.print("Please type in a valid choice (15-Espresso,23-Americano,32-Cappucino,41-Cafe Latte,56-Mocha) ");
        }
    }
}