/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that rolls a die and displays the image on the screen
*/
import java.lang.Math;
public class RollADie{
    public static void main(String[] args){
        //sets the range of the dice
        int max = 6; 
        int min = 1; 
        int range = max - min + 1; 
        int tries = 0;
        //gets a random number from 1-6
        while (tries<20){
            int rand = (int) (Math.random()*range)+1;
            //determines which dice to print
            switch(rand){
                //execute this code if the dice's side is one
                case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
                //execute this code if the dice's side is two
                case 2:
                System.out.println("+-------+");
                System.out.println("|   *   |");
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("+-------+");
                break;
                //execute this code if the dice's side is three
                case 3:
                System.out.println("+-------+");
                System.out.println("|   *   |");
                System.out.println("|   *   |");
                System.out.println("|   *   |");
                System.out.println("+-------+");
                break;
                //execute this code if the dice's side is four
                case 4:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|       |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
                //execute this code if the dice's side is five
                case 5:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|   *   |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
                //execute this code if the dice's side is six
                case 6:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            }
            tries++;
    }
    }
}