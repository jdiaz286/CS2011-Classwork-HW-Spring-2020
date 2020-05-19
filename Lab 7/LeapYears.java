/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that asks the user to enter 
year range, prints out all the leap years within that range, and counts them. A year is a 
leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
*/
import java.util.Scanner;
public class LeapYears{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter year range: ");
        int startingYear=input.nextInt();
        int endingYear=input.nextInt();
        int amountOfLeapyears=0;
        int leapyears=0;
        if(startingYear>endingYear){
            System.out.print("Inalid range");
        }
        else{
            for(int i=startingYear; i<=endingYear;i++){
                if(i%400==0){
                    System.out.print(i+" ");
                    amountOfLeapyears++;
                    leapyears++;
                }
                if(i%4==0 && i%100==0){
                    continue;
                }
                else if(i%4==0){
                    System.out.print(i+" ");
                    amountOfLeapyears++;
                    leapyears++;
                }
                
                if(i%100==0){
                    continue;
                }
                
                if(amountOfLeapyears==5){
                    System.out.println("");
                    amountOfLeapyears=0;
                }
            }
            System.out.println();
            System.out.print("There were "+ leapyears+ " leap years between "+ startingYear+" and "+ endingYear);
        }
        
    }
}