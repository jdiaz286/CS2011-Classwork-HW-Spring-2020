/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can take a number and give back the requested order
*/
import java.util.Scanner;
public class CofeeMaker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your code (15-Espresso,23-Americano,32-Cappucino,41-Cafe Latte,56-Mocha): ");
        int userChoice=input.nextInt();
        if(userChoice==15||userChoice==23||userChoice==32||userChoice==41||userChoice==56){
            if(userChoice==15){
                System.out.print("Espresso");
            }
            else if(userChoice==23){
                System.out.print("Americano");
            }
            else if(userChoice==32){
                System.out.print("Cappucino");
            }
            else if(userChoice==41){
                System.out.print("Cafe Latte");
            }
            else if(userChoice==56){
                System.out.print("Mocha");
            }
        }
        else{
            System.out.print("Please type in a valid choice (15-Espresso,23-Americano,32-Cappucino,41-Cafe Latte,56-Mocha) ");
        }
    }
}