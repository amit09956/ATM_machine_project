import java.util.Random;
import java.util.Scanner;
public class Number_Game {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalScore = 0;
        int rounds = 0;
        
        while (true) {
            rounds++;
            int score = playGame(random, scanner);
            totalScore += score;
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        
        System.out.printf("Thanks for playing! You played %d rounds and your total score is %d.%n", rounds, totalScore);
        scanner.close();
    }

    private static int playGame(Random random, Scanner scanner) {
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int attempts = 10;
        int score = 0;
        
        System.out.printf("Guess the number between %d and %d. You have %d attempts.%n", lowerBound, upperBound, attempts);
        
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess;
            
          
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
                continue;
            }
            
            if (guess < lowerBound || guess > upperBound) {
                System.out.printf("Please enter a number within the range %d to %d.%n", lowerBound, upperBound);
                continue;
            }
            
            attempts--;
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number.");
                score++;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            
            if (attempts == 0) {
                System.out.printf("Sorry, you've run out of attempts. The correct number was %d.%n", randomNumber);
            }
        }
        
        return score;
    }
}

