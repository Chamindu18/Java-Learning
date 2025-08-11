import java.util.Scanner;
import java.util.Random;
public class Lesson_37_Rock_Paper_Scissor {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FROM THE COMPUTER
        // CHECK WIN CONDITION
        // ASK TO PLAY AGAIN?
        // GOODBYE MESSAGE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock" ,"paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        
        do{
            System.out.print("Enter your move (rock, paper, scissors) : ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice : " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a TIE!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("You WIN!");
            }
            else{
                System.out.println("You LOSE!");
            }

            System.out.print("Play Again (yes / no) : ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        scanner.close();



    }
}
