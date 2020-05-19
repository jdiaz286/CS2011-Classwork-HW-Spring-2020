/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program 
that contains methods which analyze Strings with respect to their 
vowel and consonant content. For the purpose of this problem, 'y' 
is considered a vowel.
*/
import java.util.Scanner;
public class VowelsAndConsonants{
    public static void main(String[] args){
        //driver class
        Scanner input = new Scanner(System.in);
        System.out.print("Type in a word: ");
        String myWord=input.next();
        //gets info about vowels in string
        System.out.println("Vowels: "+ getVowels(myWord));
        System.out.println("# of vowels: "+ numVowels(myWord));
        //gets info about consonants in string
        System.out.println("Consonants: "+ getConsonants(myWord));
        System.out.println("# of consonants: "+ numConsonants(myWord));
    }

    //controls the string that is made up of vowels
    public static String getVowels(String str){
        String wordOfVowels="";
        //loop to go through all chararcters in string
        for(int i=0; i<=str.length()-1; i++){
            //converts int to char
            char letterInString=str.charAt(i);
            //checks if char is vowel
            if(isVowel(letterInString)){
                wordOfVowels= wordOfVowels + str.charAt(i);
            }
        }
        return wordOfVowels;
    }

    //counts the number of vowels
    public static int numVowels(String str){
        int numberOfVowels=0;
        //loop to go through all chararcters in string
        for(int i=0; i<=str.length()-1; i++){
            char letterInString=str.charAt(i);
            //checks if char is a vowel
            if(isVowel(letterInString)==true){
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }

    public static String getConsonants(String str){
        //some code
        String wordOfConsonants="";
        //loop to go through all chars in string
        for(int i=0; i<=str.length()-1; i++){
            char letterInString=str.charAt(i);
            //checks if it is not a vowel and is a character
            if(isVowel(letterInString)==false && Character.isLetter(letterInString)==true){
                wordOfConsonants= wordOfConsonants + str.charAt(i);
            }
        }
        return wordOfConsonants;
    }

    public static int numConsonants(String str){
        int numberOfConstants=0;
        //loop to go through all chars in string
        for(int i=0; i<=str.length()-1; i++){
            char letterInString=str.charAt(i);
            //checks if it is not a vowel and is a character
            if(isVowel(letterInString)==false && Character.isLetter(letterInString)==true){
                numberOfConstants++;
            }
        }
        return numberOfConstants;
    }

    //check to see if char is vowel
    public static boolean isVowel(char currentLetter){
        boolean isItVowel=false;
        switch ( currentLetter ){
            case 'a': isItVowel= true;
            case 'e': isItVowel= true; 
            case 'i': isItVowel= true;
            case 'o': isItVowel= true; 
            case 'u': isItVowel= true; 
            case 'y': isItVowel= true;
            case 'A': isItVowel= true;
            case 'E': isItVowel= true; 
            case 'I': isItVowel= true;
            case 'O': isItVowel= true; 
            case 'U': isItVowel= true; 
            case 'Y': isItVowel= true;
        }
        return isItVowel;
    }
}