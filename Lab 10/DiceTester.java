/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: The objective of this program is to write a program which 
tosses a virtual die the number of times specified by the user, and reports 
how many times each number (or face) came up. The user enters the number of 
throws on the command-line.
*/
public class DiceTester{
    public static void main(String[] args){  
        //executed if command-line argument is typed
        if(args.length>0){
            //Create an array here in which all values stored are zero
            int[] valueOfRolls={0,0,0,0,0,0};
            //Convert input to int
            int amountOfRolls=Integer.parseInt(args[0]);
            //loop to control the spins, rolls by the amount of rolls user typed in
            for(int i=0; i<amountOfRolls;i++){
                //print the number for each random spin
            	int randomSpin=(int)(Math.random()*6)+1;
                valueOfRolls[randomSpin-1]++;
                
            }
            //gets each value in the array and prints them out
            
            for(int i=0; i<6; i++){
                System.out.println( (i+1)+ " was thrown "+ valueOfRolls[i]+" times.");
            }
        }
        //executed if the user just types in "java DiceTester" in the command prompt
        else{
            System.out.print("Usage: java DiceTester [number of throws]");
        }
    }
}