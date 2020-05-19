import java.util.Scanner;
public class Lottery{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery number guess (Two digits): ");
        int guess = input.nextInt();

        int lottery = (int)(Math.random()*100);

        int lotteryDigit1=lottery/10;
        int lotteryDigit2=lottery%10;

        int guessDigit1=guess/10;
        int guessDigit2=guess%10;

        //check the guess exact match?
        if(guess==lottery){
            System.out.print("Exact Match: You win $10,000");
        }
        //if it is not the exact match, then we check whether all digits match
        else if(guessDigit2==lotteryDigit1 && guessDigit1 == lotteryDigit2){
            System.out.print("Match all digits: you win $3,000");
        }
        //If it is not exact match and all digits match, then we check wherter one digit is in the lottery
        else if(guessDigit1==lotteryDigit1
                || guessDigit1==lotteryDigit2
                || guessDigit2==lotteryDigit1
                || guessDigit2==lotteryDigit2){
            System.out.print("Match one digit: You win $1,000");
        }
        //if nothing matches
        else{
            System.out.print("The lottery number is: "+ lottery);
            System.out.print("Sorry, no match");
            
        }
        

    }
}