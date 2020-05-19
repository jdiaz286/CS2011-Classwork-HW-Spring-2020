/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can get a different reaction
when feeding a monster a char, the program keeps going until the monster is no longer happy
*/
import java.util.Scanner;
public class AlphabetMonster2{
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println(":E monster hungry!!! feed monster :o ");
            char food = input.next().charAt(0);
        while((int)food >=97 && (int)food<=122){
            System.out.println(":E monster hungry!!! feed monster :o ");
            food = input.next().charAt(0);
            if((int)food >=97 && (int)food<=122){
                System.out.println("Yum");
            }
            
        }
        if((int)food >=65 && (int)food<=90){
            System.out.println("Yum");
        }
        else if((int)food >=48 && (int)food<=57){
            System.out.println("Yuck! monster not calculator");
        }
        else if((int)food ==84 || (int)food==116){
            System.out.println("ooh monster have t with milk and sugar!");
        }
        else{
            System.out.println("barffffff! :o=..&.~.&....&");
        }
        System.out.print(">:| BYE rude user");
    }
}