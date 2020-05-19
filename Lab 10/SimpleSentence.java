/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: Write a program that generates a simple <subject>
 <verb> <adjective> sentence on each run using three String arrays.
*/
public class SimpleSentence {
    public static void main(String[] args){
        String[] myNouns={"Song", "Soup", "Internet", "Measurement", "Love", "Maintenance", "Revolution", "Dinner", "Basket", "King"};
        String[] myVerbs={"runs", "smells", "dances", "thinks", "feels"};
        String[] myAdjectives={"scruffy", "perplexed", "weary", "inteligent", "tall","short", "funny", "quickly", "slowly", "jolly", "cautiously", "furiously", "atentively", "colorful", "annoying"};

        System.out.print(getSimpleSentence(myNouns, myVerbs, myAdjectives));
    }

    public static String getSimpleSentence(String[] subjects, String[] verbs, String[] adjectives){
        int randomNounIndex=(int) (Math.random()*(subjects.length));
        int randomVerbIndex=(int) (Math.random()*(verbs.length));
        int randomAdjectiveIndex=(int) (Math.random()*(adjectives.length));

        String myword=subjects[randomNounIndex]+" "+ verbs[randomVerbIndex]+" "+adjectives[randomAdjectiveIndex];
        return myword;
    }
}
