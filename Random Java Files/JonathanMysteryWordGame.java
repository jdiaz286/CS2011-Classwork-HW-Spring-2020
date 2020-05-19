import java.util.Scanner;
import java.util.Random;
/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: Make a game that is similar to hangman where you guess the word
*/
public class JonathanMysteryWordGame {
    //in this case the main method just plays the game as long as isPlaying is always true
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean isPlaying = true;
      while (isPlaying) {
        isPlaying = playGame();
      }
      //only done if the game is over and repeats the main method again
      if(isPlaying==false){
        System.out.print("Do you want to play again?[y/n]:");
        char playAgain=input.next().charAt(0);
        if(playAgain=='y' || playAgain=='Y'){
            main(null); 
        }
        else{
            System.out.print("Thanks for playing, have a nice day :)");
        }
      }

  }

  //this is the method that controls the game itself
  //returns boolean because if true it continues to play and if not then it asks if the user wants to play again
  public static boolean playGame() {
    // initialize
    Scanner input = new Scanner(System.in);
    //variables that control all of the scores and guesses and sets them equal to zero
    int score, numOfGuesses, numOfWrongGuesses, numOfWordGuesses, numOfHints;
    score = numOfGuesses = numOfWrongGuesses = numOfWordGuesses = numOfHints = 0;
    //gets the random word from the array of words
    String randomlyGeneratedWord = createRandomWord();
    //boolean variables that check if the word is guessed if the game is almost ending
    boolean isWordGuessed, isExiting;
    isWordGuessed = isExiting = false;
    //this method sets the max amount of guesses needed to guess the word
    int maxGuesses = getNumOfDistinctLetters(randomlyGeneratedWord);
    //array to hold the chars typed in by the user
    String[] guessedLetters = new String[randomlyGeneratedWord.length()];

    do {
        //seperates new menu from old one by two lines
      System.out.println(""); 
      System.out.println("");

      String wordDisplay = getWordDisplay(randomlyGeneratedWord, guessedLetters);
      System.out.println("The word is: " + wordDisplay);

      // display guesses left and choices
      displayGuessesAndMenu(numOfGuesses,maxGuesses);

        // ask user for their choice
        System.out.print("Please enter the appropriate number to continue: ");
        int choice=input.nextInt();
        //makes sure that input is in the valid range
        if( choice<1 || choice>5 ){
            while(choice<1 || choice>5){
                System.out.print("Please choose a valid option (1, 2, 3, 4, or 5): ");
                choice=input.nextInt();
            }
        } 

        //switch case controls the users choice and executes the appropriate option
      switch (choice) {
          //case to guess a letter
        case 1: { 
            //keeps track if the user previously typed in the letter they are typing in 
          boolean alreadyGuessed = false;
          String guess;
          do {
            System.out.println("----------------- Guess a Letter ----------------");
            System.out.print("Please enter your guess: ");
            guess = input.next();
            //checks to see the user had already typed in the same letter
            alreadyGuessed = letterAlreadyGuessed(guess, guessedLetters);
            if (alreadyGuessed) {
              System.out.println("This letter has already been guessed. Pick another one!");
            }
            else if (guess.length() > 1) {
              System.out.println("Please only guess with one letter!");
              alreadyGuessed = true;
            }
          } while (alreadyGuessed); 

          // check if guess is correct
          if (letterInWord(guess, randomlyGeneratedWord)){ 
              System.out.println("Your guess is correct!"); score++; 
            }
          else {
            System.out.println("Your guess is incorrect!");
            //decrease score by one and increase wrong guesses by one
            score--; numOfWrongGuesses++;
            //set the max wrongs possible as 40% of letters possible
            int maxWrong = (int) (getNumOfDistinctLetters(randomlyGeneratedWord) * .4);
            //exit loop if wrong guesses is more than what is allowed
            isExiting = numOfWrongGuesses > maxWrong;
          }
          //add letter that user guessed to the array of guesses
          guessedLetters[numOfGuesses] = guess;
          numOfGuesses++;
          // check if the word is guessed
          isWordGuessed = wordGuessed(randomlyGeneratedWord, guessedLetters); 
          break;
        }

        // guess the word
        case 2: { 
          // if the user guessed word twice then it won't allow them to guess again
          if (numOfWordGuesses == 2){ 
              System.out.println("You've already guessed twice!"); 
            }
          else {
            System.out.println("----------------- Guess a word ----------------");
            String guess = input.next();
            if (guess.equals(randomlyGeneratedWord)) {
              // check number of hidden letters
              int hiddenCount = 0;
              for (int i = 0; i < wordDisplay.length(); i++) {
                if (wordDisplay.charAt(i) == '_') { hiddenCount++; }
              }
              // increment score
              if (hiddenCount > 1) { score += hiddenCount * 2; }
              else { score--; }
              numOfGuesses++;
              isWordGuessed = true;
            } else { System.out.println("Wrong guess!"); numOfGuesses++; }
          }
          break;
        }

        //executed if the user chooses to get a hint
        case 3: { 
          char[] distinctLetters = getDistinctLetters(randomlyGeneratedWord);
            //sets the max amount of guesses that the user can get(40% of hints)
          int maxHints = (int) (distinctLetters.length * .4);
          if (numOfHints == maxHints) {
            System.out.println("You have reached the max limit of hints!");
          }
          else {
            // determine characters that repeats the least amount of times
            
            // get counts of each distinct letter
            char[] wordLetters = randomlyGeneratedWord.toCharArray();
            int[] distinctCounts = new int[distinctLetters.length];
            for (int i = 0; i < distinctLetters.length; i++) {
              char c = distinctLetters[i];
              int currentCount = 0;
              for (int k = 0; k < wordLetters.length; k++) {
                if (c == wordLetters[k]) { currentCount++; }
              }
              distinctCounts[i] = currentCount;
            }

            // get the least occuring number count
            int leastCount = distinctCounts[0];
            for (int i = 1; i < distinctCounts.length; i++) {
              int currentCount = distinctCounts[i];
              leastCount = currentCount < leastCount ? currentCount : leastCount;
            }

            //get the first index of least occuring count that isnt already revealed
            int leastIndex = 0;
            boolean alreadyRevealed = true;
            for (int i = 0; i < distinctCounts.length; i++) {
              int currentCount = distinctCounts[i];
              if (currentCount == leastCount) {
                // is this already revealed?
                String currentLetter = String.valueOf(distinctLetters[i]);
                alreadyRevealed = letterAlreadyGuessed(currentLetter, guessedLetters);
                if (!alreadyRevealed) { leastIndex = i; break; }
              }
            }

            //return hint if alreadyRevealed is false
            if (alreadyRevealed) { System.out.println("There are no more available hints."); }
            else {
              System.out.println("----------------- Guess a word ----------------");
              String hint = String.valueOf(distinctLetters[leastIndex]);
              System.out.println("Your hint is: " + hint);
              score--; // a hint is considered an incorrect guess, score decreaased by 1
              guessedLetters[numOfGuesses] = hint;
              numOfGuesses++; // hint makes user lose one guess
              numOfHints++;
              isWordGuessed = wordGuessed(randomlyGeneratedWord, guessedLetters);
            }
          }
          break;
        }

        //execute to see the previously guessed letters
        case 4: {
          System.out.print("Guessed letters: ");
          //use a for each loop to go through all the values in the guessedLetters array
          for (String c : guessedLetters) {
              //prints contents if it has a value
            if (c != null) { System.out.print(c + " "); }
          }
          System.out.println("");
          break;
        }

        //execute if the user wants to quit the game
        case 5: {
            System.out.println("Thanks for playing :)");
          isExiting = true;
          break;
        }
      }


    } while (!isExiting && (numOfGuesses < maxGuesses && !isWordGuessed));

    //gives more space when presenting
    System.out.println(""); 
    System.out.println("");

    //check if the word is guessed
    if (isWordGuessed) { System.out.println("You guesseed the word!"); }
    else if (numOfGuesses == maxGuesses) { System.out.println("You ran out of guesses!"); }
    else {
      System.out.println("You exited the game!");
    }

    System.out.println("The word was: " + randomlyGeneratedWord);
    System.out.println("Your final score is: " + score);

    //ask the user to play again
    String playAgain;
    do {
      System.out.print("Would you like to play again? [Y/N]: ");
      playAgain = input.next();
    } while (!(playAgain.toLowerCase().equals("y") || playAgain.toLowerCase().equals("n")));

    boolean isPlaying = playAgain.toLowerCase().equals("y") ? true : false;
    return isPlaying;
  }

  //prints the menu and appropriate info
  public static void displayGuessesAndMenu(int numOfGuesses, int maxGuesses) {
    System.out.println("          Number of guesses: "+ numOfGuesses + " / " + maxGuesses);
        System.out.println("---------------------------------------------");
        System.out.println("|   [1] Guess a letter                      |");
        System.out.println("|   [2] Guess a whole word                  |");
        System.out.println("|   [3] Ask for a hint                      |");
        System.out.println("|   [4] View previous guessed letters       |");
        System.out.println("|   [5] Exit                                |");
        System.out.println("---------------------------------------------");
  }

  //gets the random word
  public static String createRandomWord() {
    // array of strings with approxamitely 50 words
    String[] possibleWords = new String[]{"word", "potato", "refreshing","carts", "backspace", "coding", "java", "javascript", "html", "css", "computers", "repository", "errors", 
            "guess","aeroplane", "air", "album", "backpack", "banana", "butterfly", "cappuccino", "diamond", "explosive",
            "feather","festival", "hammer", "hieroglyph", "kaleidoscope", "magnet", "microscope", "mosquito", "necklace", "parachute",
            "pendulum","restaurant", "signature", "wheelchair", "videotape", "treadmill", "televison", "tiger", "surveyor", "stomach",
            "staircase","sunglasses", "sword", "typewriter", "vampire", "tunnel", "thermometer", "software", "spectrum", "spiral"};
    //this gets a random index 
    int randomWordChoice=(int) (Math.random()*(possibleWords.length));
    //creates a string from the index of the random word choice and returns it
    String returnedWord=possibleWords[randomWordChoice];
    return returnedWord;
  }

  //gets all the distinct letters
  public static char[] getDistinctLetters(String word) {
    char[] letters = word.toCharArray();
    char[] initialDistinctList = new char[word.length()];
    int distinctCount = 0;
    for (char c : letters) {
      if (!(new String(initialDistinctList).contains(String.valueOf(c)))) {
        for (int i = 0; i < initialDistinctList.length; i++) {
            //if null at index
          if (initialDistinctList[i] == '\u0000') {
            initialDistinctList[i] = c;
            distinctCount++;
            break;
          }
        }
      }
    }
    char[] distinctLetters = new char[distinctCount];
    for (int i = 0; i < distinctCount; i++) {
      distinctLetters[i] = initialDistinctList[i];
    }
    return distinctLetters;
  }

  //this method uses a default method and goes through all through the letters in the string and returns the amount of different letters
  public static int getNumOfDistinctLetters(String wordToGuess) {
    int numOfDistincts= (int) wordToGuess.chars().distinct().count();
    return numOfDistincts;
  }

  //method to reveal the word and its current status
  public static String getWordDisplay(String word, String[] guessedLetters) {
    String toReturn = "";
    char[] letters = word.toCharArray();
    for (int i = 0; i < word.length(); i++) {
      String letter = String.valueOf(letters[i]);
      boolean revealed = false;
      for (String c : guessedLetters) {
        if (c == null) { revealed = false; break; }
        else if (c.equals(letter)) { revealed = true; break; }
      }
      if (revealed) { toReturn += letter + " "; }
      else { toReturn += "_ "; }
    }
    return toReturn;
  }

  //check if the letter is in word
  public static boolean letterInWord(String guess, String word) {
    return word.contains(guess);
  }

  //checks if the user already typed in the their input 
  public static boolean letterAlreadyGuessed(String guess, String[] guessedLetters) {
    for (String c : guessedLetters) {
      if (c == null) { return false; }
      else if (guess.equals(c)) { return true; } // once returned, the method ends
    }
    return false; // only reached if there is no match
  }

  //check to see if the word is guessed
  public static boolean wordGuessed(String word, String[] guessedLetters) {
    int numOfDistinctLetters = getNumOfDistinctLetters(word);
    int numOfLettersCorrect = 0;
    for (String letter : guessedLetters) {
      if (!(letter == null)) {
        if (letterInWord(letter, word)) { numOfLettersCorrect++; }
      }
    }
    return numOfLettersCorrect == numOfDistinctLetters;
  }













}
