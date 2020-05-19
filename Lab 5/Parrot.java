/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that repeats input text with exclamation mark
*/
import java.util.Scanner;
public class Parrot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text=input.next();
        System.out.print(text+"!");
    }
}