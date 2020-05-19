/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that multiplies the area of a rectangle based
off of given height and width
*/
import java.util.Scanner;
public class RectangleArea{
    public static void main(String[] args){
        Scanner myFloat = new Scanner(System.in);
        System.out.print("Please enter rectangle width and height: ");
        //get the two values of the input, even after spaces
        float inta = myFloat.nextFloat();
        float intb = myFloat.nextFloat();
        float area = inta*intb;
        if (area<0){
            //done if the value is area is negative
            System.out.print("Please enter a valid non-negative number");
        }
        else{
            //done if area is positive
            System.out.print("Area: "+ area);
        }
        
    }
}