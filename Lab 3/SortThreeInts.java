/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can sort three digits
without using Math.min()
*/
import java.util.Scanner;
public class SortThreeInts{
    public static void main(String[] args){
        //gets the three ints from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in three integers: ");
        int firstVal = input.nextInt();
        int secondVal = input.nextInt();
        int thirdVal = input.nextInt();
        
        if ( (firstVal <= secondVal) && (secondVal <= thirdVal) &&  (secondVal>=firstVal)&&(secondVal<=thirdVal) ){
            System.out.println("The sorted numbers are " + firstVal + " " + secondVal + " " + thirdVal);
            }
        else if ( (firstVal <= secondVal) && (secondVal >= thirdVal) &&  (thirdVal>=firstVal)&& (thirdVal<=secondVal)  ){
            System.out.println("The sorted numbers are " + firstVal + " " + thirdVal + " " + secondVal);
            }
        else if ((firstVal >= secondVal) && (secondVal >= thirdVal)  &&  (secondVal>=thirdVal)&&(secondVal<=firstVal)  ){
            System.out.println("The sorted numbers are " + thirdVal + " " + secondVal + " " + firstVal);
            }
        else if ((firstVal >= secondVal) && (secondVal <= thirdVal) &&  (firstVal>=secondVal)&&(firstVal<=thirdVal)  ){
            System.out.println("The sorted numbers are " + secondVal + " " + firstVal + " " + thirdVal);
            }
        else if((thirdVal<= secondVal) && (thirdVal <= firstVal) &&  (firstVal>=thirdVal)&&(firstVal<=secondVal)  ){
            System.out.println("The sorted numbers are " + thirdVal + " " + firstVal + " " + secondVal);
        }
    }
}