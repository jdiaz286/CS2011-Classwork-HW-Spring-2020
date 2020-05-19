/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can predict what day of the week it will be based off of user inputs
*/
import java.util.Scanner;
public class DayOfWeek{
    public static void main(String[] args){
        //defining what day is what number
        Scanner input = new Scanner(System.in);
        System.out.print("What day is today? Enter number from 0-6 (0 for Sunday, 1 for Monday, etc): ");
        int todaysDay = input.nextInt();
        //executes only if the current day is not actually a day that
        if(todaysDay>6||todaysDay<0){
            System.out.print(todaysDay + " does not correspond to a day of the week.");
            System.exit(1);
        }
        else if(todaysDay>=0 && todaysDay<=6){
            System.out.print("Enter number of days from today: ");
            int futureDays = input.nextInt();
            if(futureDays>7){
                //takes mod 7 and gets the remainder then subtracts by one 
                int futureOutsideWeek=(futureDays%7);
                int counter=(todaysDay+futureOutsideWeek)%7;
                //adds from current amount of days using case switch
                switch(counter){
                    case 0:System.out.print("In "+futureDays+ " days it will be Sunday"); break;
                    case 1:System.out.print("In "+futureDays+ " days it will be Monday"); break;
                    case 2:System.out.print("In "+futureDays+ " daysit will be Tuesday"); break;
                    case 3:System.out.print("In "+futureDays+ " days it will be Wednesday"); break;
                    case 4:System.out.print("In "+futureDays+ " days it will be Thursday"); break;
                    case 5:System.out.print("In "+futureDays+ " days it will be Friday"); break;
                    case 6:System.out.print("In "+futureDays+ " days it will be Saturday"); break;
                }

            }
            else if(futureDays<=7){
                //gets current day number and adds using case switch
                int futureWithinWeek=futureDays;
                int counter=(todaysDay+futureWithinWeek)%7;
                
                switch(counter){
                    case 0:System.out.print("In "+futureDays+ " days it will be Sunday"); break;
                    case 1:System.out.print("In "+futureDays+ " days it will be Monday"); break;
                    case 2:System.out.print("In "+futureDays+ " days it will be Tuesday"); break;
                    case 3:System.out.print("In "+futureDays+ " days it will be Wednesday"); break;
                    case 4:System.out.print("In "+futureDays+ " days it will be Thursday"); break;
                    case 5:System.out.print("In "+futureDays+ " days it will be Friday"); break;
                    case 6:System.out.print("In "+futureDays+ " days it will be Saturday"); break;
                }

            }
        }
    }
}