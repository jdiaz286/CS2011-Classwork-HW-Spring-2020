/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that converts RMB to Dollars and Vice-Versa
*/
import java.util.Scanner;
public class CurrencyExchange1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exRate=input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        double conversion = input.nextDouble();
        if(conversion==0){
            //code to execute conversion from dollars to RMB
            System.out.print("Enter dollar amount: ");
            double dollarAmount = input.nextDouble();
            double finalConversion=dollarAmount*exRate;
            finalConversion = Math.round(finalConversion*100)/100.0;
            System.out.print("$"+dollarAmount+" is "+finalConversion+" yuan.");

        }
        else if(conversion==1){
            //code to execute conversion from RMB to dollars
            System.out.print("Enter RMB amount: ");
            double RMBAmount = input.nextDouble();
            double finalConversion=RMBAmount/exRate;
            finalConversion = Math.round(finalConversion*100)/100.0;
            System.out.print(RMBAmount+ " yuan is "+"$"+finalConversion );
        }
        else{
            //in case the conversion isn't 1 or 0
            System.out.print("Please type in a valid input, 0 to convert dollars to RMB and 1 vice versa");
        }
    }
}

//formula to have two digits after floating point: Math.round(x*100)/100