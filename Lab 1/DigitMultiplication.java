/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that multiplies a number from 1000-9999 by all of its digits
*/
import java.util.Scanner;
public class DigitMultiplication{
	public static void main (final String[] args) {
        Scanner myint = new Scanner(System.in);
        //gets the number typed in by user
        System.out.print("Enter an integer between 1000 and 9999: ");
        int mynum = myint.nextInt();
        //gets number in ones place and stores it as the first digit
        int firstDigit = mynum%10;
        //takes out digit in ones place
        mynum = mynum/10;
        //gets number in ones place and stores it as the second digit
        int secondDigit = mynum%10;
        //takes out digit in ones place
        mynum = mynum/10;
        //gets number in ones place and stores it as the third digit
        int thirdDigit = mynum%10;
        //takes out digit in ones place
        mynum = mynum/10;
        //gets number in ones place and stores it as the fourth digit
        int fourthDigit = mynum%10;
        //multiplies all digits of number together
        int productOfNum = firstDigit * secondDigit * thirdDigit *fourthDigit;
        System.out.println(productOfNum);
	}
}