package tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        String anotherRound = "";
        int score = 0;
        int maxAttempts = 5;
        int attempt;
        int rounds = 0;

        Scanner sc = new Scanner(System.in);

        do {
        	
        	rounds++;		//increments the value if the user goes for multiple rounds
            attempt = 0; 	//increments the value the number of times the user makes an attempt to guess the number.
            boolean correctGuess = false;

            Random num = new Random();	
            int randomNum = num.nextInt(11); //generates a number between 0 and 10 and stores in randomNum variable

            System.out.println("\nGuess a number between 0 and 10:\n");

            while (attempt < maxAttempts && !correctGuess) {	//checks the no. of attempts left and performs the following task until the user guesses the correct num.
                int guessNum = sc.nextInt();
                attempt++;

                if ( guessNum > randomNum ) {
                    System.out.println("\nYour guess is High\nAttempts left: " + (maxAttempts - attempt+"\n"));
                							} 
                else if ( guessNum < randomNum ){
                    System.out.println("\nYour guess is Low\nAttempts left: " + (maxAttempts - attempt+"\n"));
                								} 
                else {
                    correctGuess = true;
                    score += 10;
                    System.out.println("\nYou have Guessed the Correct Number!\n");
                	}
            												}

            if (!correctGuess) {   	//if user's guesses are all wrong then the following message is displayed 
                System.out.println("\nyou are out of attempts. Correct number was " + randomNum+"\n");
            				   }

            System.out.println("\nDo you want to play another round? yes/no"); 
            anotherRound = sc.next();

        } while (anotherRound.equalsIgnoreCase("yes"));			// checks the condition and accordingly performs the appropriate task.

        System.out.println("\nYour Total score in "+rounds+" rounds is " + score);
        sc.close();
    										}
						}
