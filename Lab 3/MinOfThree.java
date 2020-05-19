/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can get the minimum of three digits
without using Math.min()
*/
import java.util.Scanner;
public class MinOfThree{
    public static void main(String[] args){
        //gets the three ints from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in three integers: ");
        int firstVal = input.nextInt();
        int secondVal = input.nextInt();
        int thirdVal = input.nextInt();
        int min=(int) firstVal;

        //sorts out the given values
        if(secondVal<min){
            min=secondVal;
        }
        else{
            min=thirdVal;
        }
        System.out.print(min);
    }
}