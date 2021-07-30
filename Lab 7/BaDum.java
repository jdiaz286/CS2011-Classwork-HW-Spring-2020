/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to write a program that prints 
the numbers from 1 to 100. But if the number is divisible by 3 print 'Ba' instead of the number 
and if it is divisible by 5 print 'Dum'. For numbers which are divisible by both 3 and 5 print 'BaDum'.
*/
public class BaDum{
    public static void main(String[] args){
        for(int i=1; i<=100;i++){
            if(i%15==0){
                System.out.println("BaDum");
                continue;
            }
            if(i%3==0){
                System.out.println("Ba");
                continue;
            }
            if(i%5==0){
                System.out.println("Dum");
                continue;
            }
            
            System.out.println(i);
        }
    }
}
