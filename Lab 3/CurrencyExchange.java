/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that converts RMB to Dollars and Vice-Versa
*/
import java.util.Scanner;
public class CurrencyExchange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        float exRate=input.nextFloat();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        float conversion = input.nextFloat();
        if(conversion==0){
            //code to execute conversion from dollars to RMB
            System.out.print("Enter dollar amount: ");
            float dollarAmount = input.nextFloat();
            float finalConversion=dollarAmount*exRate;
            System.out.print("$"+dollarAmount+" is "+finalConversion+" yuan.");

        }
        else if(conversion==1){
            //code to execute conversion from RMB to dollars
            System.out.print("Enter RMB amount: ");
            float RMBAmount = input.nextFloat();
            float finalConversion=RMBAmount/exRate;
            
            System.out.print(RMBAmount+ " yuan is "+"$"+finalConversion );
        }
        else{
            //in case the conversion isn't 1 or 0
            System.out.print("Please type in a valid input, 0 to convert dollars to RMB and 1 vice versa");
        }
    }
}