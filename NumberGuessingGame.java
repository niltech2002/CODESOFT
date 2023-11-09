
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int roundsWon = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            
            System.out.println("Guess the number between " + minRange + " and " + maxRange);
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                attempts++;
                
                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Out of attempts! The number was " + targetNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = input.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Game over! You won " + roundsWon + " rounds.");
    }
}

