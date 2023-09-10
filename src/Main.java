import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int min=1;
        int max=100;
        int score=0;
        int max_attempts=10;
        int attempts=0;
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("***WELCOME TO NUMBER GUESSING GAME***");
        do {
            int actual_number = rn.nextInt(max - min + 1) + min;
            boolean guessed_answer = false;
            System.out.println("Try to guess a number between " + min + " and " + max);

            while (attempts < max_attempts) {
                System.out.print("Enter your guessed number : ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == actual_number) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessed_answer = true;
                    break;
                } else if (userGuess < actual_number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (!guessed_answer) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + actual_number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        } while (true);

        System.out.println("Game over. Your final score is: " + score);
        sc.close();
    }
}