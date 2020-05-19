/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: Write a program that asks the user enter the size 
of a square pattern block, and prints out a square block with a 
pattern that the user chooses.
*/
import java.util.Scanner;

public class PatternBlock1{
    public static void displayPattern(int n, char c1, char c2){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                if((j)>i){            
                    System.out.print(c2+" ");
                    continue;    
                }
                System.out.print(c1+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter block size (>2): ");
        int length=input.nextInt();
        while(length<3){
            System.out.print("Please make sure the length is greater than 2 ");
            length=input.nextInt();
        }
        System.out.print("Enter two characters: ");
        char firstChar=input.next().charAt(0);
        char secondChar=input.next().charAt(0);

        displayPattern(length,firstChar,secondChar);
        displayPattern(length, secondChar, firstChar);

        
    }
}