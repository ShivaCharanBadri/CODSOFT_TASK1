import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int roundsWon = 0;
        String playAgain;

        System.out.println("=================================");
        System.out.println("       WELCOME TO NUMBER GAME");
        System.out.println("=================================");

        do{
            int randomNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");
            while(attempts < maxAttempts){
                System.out.print("\nEnter your guess: ");
                if(!scanner.hasNextInt()){
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next();
                    continue;
                }
                int guess = scanner.nextInt();
                if(guess < 1 || guess > 100){
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }
                attempts++;
                if(guess == randomNumber){
                    System.out.println("\nCongratulations! 🎉");
                    System.out.println("You guessed the correct number: " + randomNumber);
                    System.out.println("Attempts used: " + attempts);
                    int score = (maxAttempts - attempts + 1) * 20;
                    System.out.println("Score for this round: " + score);
                    totalScore += score;
                    roundsWon++;
                    guessedCorrectly = true;
                    break;
                } 
                else if(guess < randomNumber){
                    System.out.println("Too low! Try again.");
                } 
                else{
                    System.out.println("Too high! Try again.");
                }
                System.out.println("Attempts remaining: "+ (maxAttempts - attempts));
            }
            if(!guessedCorrectly){
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + randomNumber);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            playAgain = scanner.next();
        } 
        while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n=================================");
        System.out.println("           FINAL RESULT");
        System.out.println("=================================");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total score: " + totalScore);
        System.out.println("\nThank you for playing!");
        System.out.println("=================================");

        scanner.close();
    }
}