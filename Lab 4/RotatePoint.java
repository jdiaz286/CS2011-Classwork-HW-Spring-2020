/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can compute the new coordinates of a 2D point rotated about the origin.
*/
import java.util.Scanner;
public class  RotatePoint{
    public static void main(String[] args){
        //get all user inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x- and y- coordinate: ");
        float xCo= input.nextFloat();
        float yCo= input.nextFloat();
        System.out.print("Enter angle of rotation in degrees: ");
        float degrees = input.nextFloat();
        System.out.print("Enter '+' for counter-clockwise or '-' for clockwise rotation: ");
        char direction = input.next().charAt(0);

        //check rotation here
        if(direction=='+'){
            //counterclockwise rotation
            float radians = (float)Math.toRadians(degrees);

            //new x coordinate calculated here
            float xPrime =xCo*( (float)Math.cos(radians)) - yCo*( (float)Math.sin(radians));

            //new y coordinate calculated here
            float yPrime = xCo*((float)Math.sin(radians)) + yCo*((float)Math.cos(radians));

            //round the values here
            System.out.print("Your Coordinates are ("+ Math.round(xPrime*100)/100.0+ ", "+ Math.round(yPrime*100)/100.0+")");
        }
        else if(direction=='-'){
            //clockwise rotation

            //convert degrees to negative terms
            degrees=degrees*(-1);
            float radians = (float)Math.toRadians(degrees);

            //new x coordinate calculated here
            float xPrime = xCo*((float)Math.cos(radians)) - yCo*((float)Math.sin(radians));

            //new y coordinate calculated here
            float yPrime = xCo*((float)Math.sin(radians)) - yCo*((float)Math.cos(radians));
            System.out.print("Your Coordinates are ("+ Math.round(xPrime*100)/100.0+ ", "+ Math.round(yPrime*100)/100.0+")");
        }
        else{
            System.out.print("Invalid Input: "+direction);
        }
        
    }
}