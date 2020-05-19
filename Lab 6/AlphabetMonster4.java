/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that can get a different reaction
when feeding a monster, all while making this a type of mini-game
*/
import java.util.Scanner;
public class AlphabetMonster4{
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println(":E monster hungry!!! feed monster :o ");
            char food = input.next().charAt(0);
            int maxInitialHunger=4;
            int minInitialHunger=-4;
            int range= maxInitialHunger-minInitialHunger+1;
            int randomHunger=(int) (Math.random()*range)+1;
            int hungerStatus=randomHunger;
        while(hungerStatus<6){
            System.out.println(":E monster hungry!!! feed monster :o ");
            food = input.next().charAt(0);
            if((int)food >=97 && (int)food<=122){
                hungerStatus++;
                System.out.println("Yum");
            }
            else if((int)food >=65 && (int)food<=90){
                hungerStatus++;
                System.out.println("Yum");
            }
            else if((int)food >=48 && (int)food<=57){
                hungerStatus--;
                System.out.println("Yuck! monster not calculator");
            }
            else if((int)food ==84 || (int)food==116){
                hungerStatus=hungerStatus+2;
                System.out.println("ooh monster have t with milk and sugar!");
            }
            else{
                hungerStatus=hungerStatus-3;
                System.out.println("barffffff! :o=..&.~.&....&");
            }
            if(hungerStatus<0){
                System.out.println(":[ please feed me i am really hungry");
            }
        }
        System.out.print(":] monster full you may go");
    }
}