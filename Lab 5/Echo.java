/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that gets the user input and echoes it 
*/
import java.util.Scanner;
public class Echo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in one or more words: ");
        String text=input.next();
        if(text.length()<3 || text.substring(text.length()-3, text.length()).matches("[0-9]+")){
            System.out.print("Your entry must be at least 3 characters long, and the last three characters must be letters");
        }
        else{
            System.out.println(text.toUpperCase());
            System.out.println(text.substring(text.length()-3, text.length()).toUpperCase());
            System.out.println(text.substring(text.length()-3, text.length()).toLowerCase());
            System.out.println(text.substring(text.length()-2, text.length()).toLowerCase());
            System.out.println(text.substring(text.length()-1));
        }
    }
}
