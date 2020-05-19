/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that divides two intergers and determines whether they are divisible or not
*/
import java.util.Scanner;
public class Divisible{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = input.nextInt();
        if(divisor==1||dividend==0||divisor==0){
            if(divisor==1){
                System.out.print("Everything is divisible by " + divisor);
            }
            else if(dividend==0){
                System.out.print(dividend + " is divisible by everything");
            }
            else if(divisor==0){
                System.out.print("Are you trying to break me");
            }
        }
        else{
            float result = (int)dividend % (int)divisor;
            if(result==0){
                System.out.print("Yes, "+divisor+" will divide "+ dividend+ " evenly");
            }
            else if(result!=0){
                System.out.print("No, "+dividend+" is not divisible by  "+ divisor);
            }
        }
        

    }
}