import java.util.Arrays;

/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: The objective of this code is to write a program to solve the box puzzle:
There are 100 boxes and 100 people. The boxes are labeled from 1 to 100, they are lined 
up in ascending order (i.e. 1, 2, 3, ..., 100), and at the beginning they are all closed. 
Then people enter one by one. The first person (P1) opens every box. Then the second person 
(P2) enters, begins with the second box (B2) and closes every other box. Then the third person 
(P3) starts with third box (B3) and changes every third box -- if the box is open, the person 
closes it, and if it was closed, the person opens it. Person P4 begins with box B4 and changes
every fourth box. Person P5 begins with box B5 and changes every 5th box. And so on, until 
person P100 changes box B100.
Your program should simulate this process, and display the labels of boxes that are opened at the end.
*/
public class Boxes {
    public static void main(String[] args){
        //create the method Boolean array
        Boolean[] boxNumber= new Boolean[100];
        Arrays.fill(boxNumber, Boolean.FALSE);
        int boxHoper=1;
        //while loop that controls the amount of leaps
        while(boxHoper<=boxNumber.length){
            //for loop that counts by each number of boxHoper value
            for(int i=0;i<boxNumber.length; i+=boxHoper){
                //if box is open then close
                if(boxNumber[i]==true){
                    boxNumber[i]=false;
                }
                //if box is closed then open
                else{
                    boxNumber[i]=true;
                }
            }
            //increase after each for loop iteration
            boxHoper++;
        }
        //call method to print all open boxes in array
        findAndPrintOpenBoxes(boxNumber);
    }
    //find all boxes that are open in the end
    public static void findAndPrintOpenBoxes(Boolean[] boxNumber){
        System.out.println("The boxes that are open include: ");
        //for loop that goes through all boxes
        for(int j=0; j<boxNumber.length;j++){
            //if the box is open then show the index + 1
            if(boxNumber[j]==true){
                System.out.println("Box #"+ (j) );
            }
            
        }
    }

}