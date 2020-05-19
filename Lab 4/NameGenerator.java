/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that creates a 4 letter "name" randomly
*/
public class NameGenerator{
    public static void main(String[] args){
        int max1= 122;
        int min1= 97;
        int range1 = max1-min1+1;
        
        int random1= (int) (Math.random()*range1) +1;
        random1 = random1+96;
        System.out.print((char)Character.toUpperCase(random1));

        int random2= (int) (Math.random()*range1) +1;
        random2 = random2+96;
        System.out.print((char)random2);

        int random3= (int) (Math.random()*range1) +1;
        random3 = random3+96;
        System.out.print((char)random3);

        int random4= (int) (Math.random()*range1) +1;
        random4 = random4+96;
        System.out.print((char)random4);
        
    }
}