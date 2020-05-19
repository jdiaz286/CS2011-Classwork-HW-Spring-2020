/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program reads an unspecified number of integers,
determines how many positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). The program ends with the input 0.
*/
import java.util.Scanner;
public class CountTotalAndAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (0 to end input): ");
        int myNumber = input.nextInt();
        int numOfPositives = 0;
        int numOfNegatives = 0;
        int numberOfDigits=0;
        double sum = 0;
        while(myNumber !=0){
            if(myNumber>0){
                numOfPositives++;
            }
            else if(myNumber<0){
                numOfNegatives++;
            }
            sum = sum+myNumber;
            numberOfDigits++;
            myNumber = input.nextInt();
        }
        double average = sum/numberOfDigits;
        System.out.println("# of positives: "+numOfPositives);
        System.out.println("# of negatives: "+numOfNegatives);
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+Math.round(average*100.0)/100.0);
        
    }
}