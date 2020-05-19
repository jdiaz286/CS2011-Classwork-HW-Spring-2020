/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can take a number and give back the requested order
*/
import java.util.Scanner;
public class VendingMachine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your favorite category ( 1-Snacks, 2-Soda Pop and Drinks, 3-Bulk Candy): ");
        int favoriteCategory=input.nextInt();
        if(favoriteCategory==1||favoriteCategory==2||favoriteCategory==3){
            if(favoriteCategory==1){
            //all the code for category one
            System.out.print("Please enter the id of your favorite item ( 1- Lay's potato chips, 2-Doritos, 3-Cheetos ): ");
            int oneID = input.nextInt();
            //executes the code to choose option for category one
            switch(oneID){
                case 1: System.out.print("Your selected item is: Lay's potato chips"); break;
                case 2:System.out.print("Your selected item is: Doritos"); break;
                case 3:System.out.print("Your selected item is: Cheetos"); break;
                default: System.out.print("Please type in a valid choice ( 1- Lay's potato chips, 2-Doritos, 3-Cheetos ) ");
                }
            }

            else if(favoriteCategory==2){
            //all the code for category two 
            System.out.print("Please enter the id of your favorite item ( 1- Water, 2- Dr. Pepper, 3- Pepsi, 4- Coke ): ");
            int twoID = input.nextInt();
            //executes the code to choose option for category two
            switch(twoID){
                case 1: System.out.print("Your selected item is: Water"); break;
                case 2:System.out.print("Your selected item is: Dr.Pepper"); break;
                case 3:System.out.print("Your selected item is: Pepsi"); break;
                case 4:System.out.print("Your selected item is: Coke"); break;
                default: System.out.print("Please type in a valid choice ( 1- Water, 2- Dr. Pepper, 3- Pepsi, 4- Coke ) ");
                }
            }

            else if(favoriteCategory==3){
            //all the code for category three
            System.out.print("Please enter the id of your favorite item ( 1- Peanut M&M’s, 2-Runts, 3-Gumballs ): ");
            int threeID = input.nextInt();
            //executes the code to choose option for category three
            switch(threeID){
                case 1: System.out.print("Your selected item is: Peanut M&M’s"); break;
                case 2:System.out.print("Your selected item is: Runts"); break;
                case 3:System.out.print("Your selected item is: Gumballs"); break;
                default: System.out.print("Please type in a valid choice ( 1- Peanut M&M’s, 2-Runts, 3-Gumballs ) ");
            }
           }
        }
        else{
            System.out.print("Please type in a valid category ( 1-Snacks, 2-Soda Pop and Drinks, 3-Bulk Candy) ");
        }
    }
}