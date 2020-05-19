/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that creates a "name" randomly based off of the users desired
length
*/
import java.util.Scanner;
public class NameGenerator1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Name length: ");
        int length = input.nextInt();
        int max1= 122;
        int min1= 97;
        int range1 = max1-min1+1;
        String randomName="";
        if(length<0){
            System.out.print("The length must be at least 1");
        }
        else if(length>0){
            int random= (int) (Math.random()*range1) +1;
            random = random+96;
            randomName=randomName+(char)Character.toUpperCase(random);
            length=length-1;
            while(length>0){
                length=length-1;
                random= (int) (Math.random()*range1) +1;
                random = random+96;
                randomName=randomName+(char)random;
            }
            System.out.print(randomName);
        }
        
    }
}