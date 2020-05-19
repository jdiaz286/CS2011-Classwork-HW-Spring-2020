/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: The objective of this program is to write a program that generates a deck 
of card which is initially ordered, and then shuffles the deck so that on each run the 
cards appear in random order. Cards are represented by integers in [0, 51] interval. There
are several sub-problems here: produce an ordered deck of cards; shuffle a deck cards; print
out a deck of cards. Full points will be given for programs that encapsulate each of these 
problems in a separate method.
*/
public class CardShuffle{
    public static void main(String[] args){
        //create array of cards with length 52
        int[] deckOfCards = new int[52];
        //assign values to deck of cards
        for(int i=0; i<deckOfCards.length;i++){
            deckOfCards[i]=i;
        }
        //call method to print out all values in the array
        printOutDeck(deckOfCards);
        printShuffledDeck(deckOfCards);

    }

    //method to print out the starting deck
    public static void printOutDeck(int[]deckOfCards){
        System.out.println("Fresh Deck: ");
        System.out.println("________________________________________");
        //variable to keep track of the amount of values in line
        int numOfValsPerLine=0;
        //get array and print out each value in lines
        for(int j=0; j<deckOfCards.length;j++){
            System.out.printf("%3d", deckOfCards[j]);
            numOfValsPerLine++;
            if(numOfValsPerLine==13){
                numOfValsPerLine=0;
                System.out.println();
            }
        }
        System.out.println("________________________________________");
    }

    //method to print out the shuffled deck
    public static void printShuffledDeck(int[] deckOfCards){
        //get all values in array and shuffle each one
        System.out.println("Shuffled Deck: ");
        System.out.println("________________________________________");
        //call shuffleDeck method 
        shuffleDeck(deckOfCards);
        //variable to keep track of the amount of values in line
        int numOfValsPerLine=0;
        //get array and print out each value in lines
        for(int j=0; j<deckOfCards.length;j++){
            System.out.printf("%3d", deckOfCards[j]);
            numOfValsPerLine++;
            if(numOfValsPerLine==13){
                numOfValsPerLine=0;
                System.out.println();
            }
        }
        System.out.println("________________________________________");
    }

    public static void shuffleDeck(int[] deckOfCards){
        for (int i = 0; i < deckOfCards.length-1; i++) {
            // Generate an index j randomly
            int j = (int)(Math.random() * deckOfCards.length );
            //Swap myList[ i ] with myList[ j ]
            int temp = deckOfCards[ i ] ;
            deckOfCards[ i ] = deckOfCards[ j ] ;
            deckOfCards[ j ] = temp ;
        }
    }
}