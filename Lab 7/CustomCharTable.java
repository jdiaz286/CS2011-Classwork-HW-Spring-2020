/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: Write a program that asks the user to enter a character 
range (start and end), and the number of characters per line, and prints 
all the characters in the range separated by one space.
*/
import java.util.Scanner;
public class CustomCharTable{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first char: ");
        char firstChar = input.next().charAt(0);

        System.out.print("Enter last char: ");
        char lastChar = input.next().charAt(0);

        int numofLettersCounted = 0;
        if(firstChar>lastChar){
            System.out.print("That's not a valid character range.");
        }

        else if(firstChar<lastChar){
            System.out.print("How many per line?: ");
            int lettersPerLine=input.nextInt();
            if(lettersPerLine>1){
                for(char j=firstChar; j<=lastChar;j++){
                    System.out.print(j+" ");
                    numofLettersCounted++;
                    if(numofLettersCounted==lettersPerLine){
                        numofLettersCounted=0;
                        System.out.println();
                    }
                }
            }
            else{
                System.out.print("There must be at least 2 lines.");
            }
            System.out.println();
        }
    }
}