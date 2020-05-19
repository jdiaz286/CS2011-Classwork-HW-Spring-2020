/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that generates a random string and then dictates if a person 
types the string out correctly
*/
import java.util.Scanner;
public class TypingTutor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the following");

        int max1= 122;
        int min1= 97;
        int range1 = max1-min1+1;
        
        int random1= (int) (Math.random()*range1) +1;
        random1 = random1+96;
        char c1 = (char)random1;
        c1 = Character.toUpperCase(c1);

        int random2= (int) (Math.random()*range1) +1;
        random2 = random2+96;
        char c2= (char)random2;

        int random3= (int) (Math.random()*range1) +1;
        random3 = random3+96;
        char c3 = (char)random3;

        int random4= (int) (Math.random()*range1) +1;
        random4 = random4+96;
        char c4 = (char)random4;
        
        String randomWord = "";
        randomWord = randomWord+(char)c1+(char)c2+(char)c3+(char)c4;
        System.out.println(randomWord);

        String text=input.next();

        if(text.length()>4){
            System.out.print("You typed in too many letters, type in the right amount of letters");
        }
        else if(c1==text.charAt(0) && c2==text.charAt(1) && c3==text.charAt(2) && c4==text.charAt(3)){
            System.out.print("You got it!!!");
        }
        else if(c1!=text.charAt(0) && c2!=text.charAt(1) && c3!=text.charAt(2) && c4!=text.charAt(3)){
            System.out.print("Wrong.");
        }
        else if(text.length()<4){
            System.out.print("You typed in too few letters, type in the right amount of letters");
        }
        else if(c1!=text.charAt(0) && c2==text.charAt(1) && c3==text.charAt(2) && c4==text.charAt(3)){
            char firstCharacter = text.charAt(0);
            if(Character.toUpperCase(firstCharacter)==c1){
                System.out.print("Almost right, but mind the case next time");
            }
            else{
                System.out.print("Wrong.");
            }
        }
    }
}