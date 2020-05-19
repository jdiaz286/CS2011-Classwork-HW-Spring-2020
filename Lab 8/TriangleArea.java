/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that reads 
three sides for a triangle, and displays its area if the input is valid using 
Heron's formula
*/
import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if(isValid(s1, s2, s3)==true){
            System.out.print(area(s1, s2, s3));
        }
        else if(isValid(s1, s2, s3)==false){
            System.out.print("Invalid Input");
        }

    }

    public static boolean isValid(double a, double b, double c){
        boolean isTrue=true;
        if(a+b>c && a+c>b && b+c>a){
            isTrue=true;
        }
        else{
            isTrue=false;
        }
        return isTrue;
    }

    public static double area(double a, double b, double c){
        double triangleArea=0.0;
        double semiPerimeter=(a+b+c)/2;
        triangleArea=Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        return triangleArea;
    }
}