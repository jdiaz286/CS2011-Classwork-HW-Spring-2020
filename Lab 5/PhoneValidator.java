/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that verifys the user has the correct phone number
format (###) ###-####
*/
import java.util.Scanner;
public class PhoneValidator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number as (###) ###-#### : ");
        String text=input.nextLine();
        //checks to see that length is actually the right size
        if(text.length()<14 || text.length()>14){
            System.out.print("Error: Wrong format number");
        }
        //code to check each value is in it's correct corresponding location
        else if(text.charAt(0)=='(' && Character.isDigit(text.charAt(1)) && Character.isDigit(text.charAt(2)) 
        && Character.isDigit(text.charAt(3)) && text.charAt(4)==')' && text.charAt(5)==' ' && Character.isDigit(text.charAt(6))
        && Character.isDigit(text.charAt(7)) && Character.isDigit(text.charAt(8)) && text.charAt(9)=='-' && Character.isDigit(text.charAt(10))
        && Character.isDigit(text.charAt(11)) && Character.isDigit(text.charAt(12)) && Character.isDigit(text.charAt(13))
        )
        {
            System.out.print("Thank you");
        }
        //if no situation is met
        else{
            System.out.print("Error: Wrong format number");
        }
    }
}
