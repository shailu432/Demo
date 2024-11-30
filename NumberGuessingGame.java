import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalRounds = 0; // Count of total rounds played
        int totalWins = 0;   // Count of rounds won by the user
        
        // Game loop for multiple rounds
        while (true) {
            totalRounds++;
            System.out.println("\n--- Round " + totalRounds + " ---");
            
            // Generate a random number between 1 and 100
            int targetNumber = random.nextInt(100) + 1;
            
            // Define the number of attempts allowed
            int maxAttempts = 10;
            int attemptsLeft = maxAttempts;
            boolean isGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100! You have " + maxAttempts + " attempts.");
            
            // Prompt the user to guess the number
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;
                
                // Compare the guess with the generated number
                if (userGuess == targetNumber) {
                    isGuessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                System.out.println("You have " + attemptsLeft + " attempts left.");
            }
            
            // If the user guesses correctly or runs out of attempts
            if (isGuessedCorrectly) {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly.");
                totalWins++;
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }
            
            // Ask the user if they want to play another round
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        // Display the final score
        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Total Rounds Won: " + totalWins);
        
        // Optionally calculate the win rate
        double winRate = (totalRounds > 0) ? ((double) totalWins / totalRounds) * 100 : 0;
        System.out.printf("Your win rate: %.2f%%\n", winRate);
        
        // Close the scanner
        scanner.close();
    }
}
