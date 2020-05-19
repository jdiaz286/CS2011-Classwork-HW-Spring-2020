/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program 
that prompts the user to specify an integer range, and displays 
all the perfect squares (if any) in that range.
*/
import java.util.Scanner;
public class PerfectSquares{
	public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter range: ");
        int firstNumber=input.nextInt();
        int lastNumber=input.nextInt();
        printSquaresInRange(firstNumber, lastNumber);  
    }

    public static boolean isPerfectSquare(int n){
        double squareRoot=Math.sqrt(n);
        return ((squareRoot - Math.floor(squareRoot)) == 0);
    }
    
    public static void printSquaresInRange(int begin, int end){
        for(int i=begin; i<=end;i++){
            if(isPerfectSquare(i)==true){
                System.out.print(i+" ");
            }
            else if(isPerfectSquare(i)==false){
                continue;
            }
        }
    }
}