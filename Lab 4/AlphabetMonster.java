/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can get a different reaction
when feeding a monster a char
*/
import java.util.Scanner;
public class AlphabetMonster{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(":E monster hungry!!! feed monster :o ");
        char food = input.next().charAt(0);
        if((int)food >=97 && (int)food<=122){
            System.out.print("Yum");
        }
        else if((int)food >=65 && (int)food<=90){
            System.out.print("Yum");
        }
        else if((int)food >=48 && (int)food<=57){
            System.out.print("Yuck! monster not calculator");
        }
        else if((int)food ==84 || (int)food==116){
            System.out.print("ooh monster have t with milk and sugar!");
        }
        else{
            System.out.print("barffffff! :o=..&.~.&....&");
        }
    }
}