/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: Write a program that asks the user enter the size 
of a square pattern block, and prints out a square block with a 
pattern or '.' and 'o' just like the one in sample below.
*/
import java.util.Scanner;
public class PatternBlock{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter block size (>2): ");
        int blockSize=input.nextInt();
        if(blockSize<3){
            System.out.print("Please make sure the length is greater than 2 ");
        }
        else{
            for(int i=1; i<=blockSize;i++){
                for(int j=1; j<=blockSize;j++){
                    if((j)>i){            
                        System.out.print("o");
                        continue;    
                    }
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}