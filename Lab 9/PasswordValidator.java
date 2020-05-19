/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that 
prompts the user to enter a password and displays Valid Password if the 
rules are followed or Invalid Password otherwise.
*/
import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args){
        //driver class
        Scanner input = new Scanner(System.in);
        System.out.print("Type in a password: ");
        String myPassword=input.next();

        if(longEnough(myPassword)==true && lettersAndDigits(myPassword)==true && atLeastThree(myPassword)){
            System.out.print("Password valid");
        }
        else{
            System.out.print("Password invalid");
        }
    }

    public static boolean longEnough(String myPassword){
        boolean appropriateLength=false;
        if(myPassword.length()>=10){
            appropriateLength=true;
        }
        return appropriateLength;
    }

    public static boolean lettersAndDigits(String myPassword){
        boolean appropriateChars=false;
        int amountOfCharacters=myPassword.length();
        int amountOfLettersAndDigits=0;
        for(int i=0; i<=myPassword.length()-1; i++){
            //converts int to char
            char valueInPassword=myPassword.charAt(i);
            //checks if char is letter or digit
            if(Character.isDigit(valueInPassword)==true || Character.isLetter(valueInPassword)==true ){
                amountOfLettersAndDigits++;
            }
        }
        if(amountOfCharacters==amountOfLettersAndDigits){
            appropriateChars=true;
        }
        return appropriateChars;
    }

    //checks to see if the password has three ints
    public static boolean atLeastThree(String myPassword){
        boolean threeInts=false;
        int amountofInts=0;
        for(int i=0; i<=myPassword.length()-1; i++){
            //converts int to char
            char valueInPassword=myPassword.charAt(i);
            //checks if char is letter or digit
            if(Character.isDigit(valueInPassword)==true){
                amountofInts++;
            }
        }
        if(amountofInts>=3){
            threeInts=true;
        }

        return threeInts;
    }

}