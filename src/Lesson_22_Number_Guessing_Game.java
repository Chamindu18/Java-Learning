import java.util.Random;
import java.util.Scanner;
public class Lesson_22_Number_Guessing_Game {
    public static void main(String[] args) {

        // Number Guessing Game

        // create a Random object

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game!");
        System.out.printf("Guess a number between %d - %d\n", min,max);

        do{
            System.out.print("Enter your number : ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low! Try Again.");
            }
            else if(guess > randomNumber){
                System.out.println("Too High! Try Again.");
            }
            else{
                System.out.println("You Won! The Number was : " + randomNumber);
                System.out.println("Number of Attempts : " + attempts);
            }
        }while(guess != randomNumber);

        scanner.close();

    }
}
