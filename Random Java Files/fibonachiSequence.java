import java.util.Scanner;
public class fibonachiSequence{
    //write a program that computes the nth number of the sequence where n is the value entered by user
    /*fibonachi sequence
    1,1,2,3,5,....
    Each number except the first two*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i =3; //sets the initial value at the third digit of fibonachi sequence
        int sum=0; //sets default sum
        int initial = 1; //first digit in sequence
        int finalnumber= 1; //second digit in sequence
        System.out.print("Type in the nth number of fibonachi's sequence you would like to know (Please type in a number greater than 2): ");
        int nth=input.nextInt(); //sets this number as the goal of the fibonachi sequence

        //if the nth number is 2 or 1
        if(nth<=2){
            System.out.print("Type in a number greater than 2 for the sequene to work");
        }
        //if the nth number is greater than 2
        else if(nth>2){
            //get the first sum and add it by the second sum here
            while(i<=nth){
                sum=initial+finalnumber; //calculate the sum of the current position index
                initial=finalnumber; //move the number order "one to the left"
                finalnumber=sum; //set sum as the final number
                i++;
            }
        }
        System.out.print(sum); //print out the sum
    }
}