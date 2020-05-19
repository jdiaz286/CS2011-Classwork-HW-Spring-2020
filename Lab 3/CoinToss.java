/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that flips a coin
*/
import java.lang.Math;
public class CoinToss{
    public static void main(String[] args){
        int max = 2; 
        int min = 1; 
        int range = max - min + 1; 
        int rand = (int) (Math.random()*range)+1;
        var option = (rand==1)? "heads": "tails";
        System.out.print(option);
    }
}