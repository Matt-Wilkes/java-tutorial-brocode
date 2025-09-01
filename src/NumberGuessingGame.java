import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
//    number guessing game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 1000;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number guessing game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess < randomNumber){
                System.out.println("Too low, try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("CORRECT! the number was " + randomNumber);
                System.out.println("# of attempts "+ attempts);
            }

        }while(guess != randomNumber);

        scanner.close();
    }
}
