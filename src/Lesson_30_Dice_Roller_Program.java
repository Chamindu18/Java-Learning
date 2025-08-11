import java.util.Random;
import java.util.Scanner;
public class Lesson_30_Dice_Roller_Program {
    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // DECLARE VARIABLES

        int numOfDice;
        int total = 0;

        // GET THE NUMBER OF DICE FROM USER

        System.out.print("Enter the number of dice to roll : ");
        numOfDice = scanner.nextInt();

        // CHECK IF NUMBER OF DICE > 0

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice ; i++){
                int roll = random.nextInt(1, 7);
                printAscii(roll);
                System.out.println("You rolled : " + roll);
                total += roll;
            }
            System.out.println("Total : " + total);
        }
        else{
            System.out.println("Number of dice must be greater than ZERO!");
        }

        // ROLL ALL THE DICE

        // GET THE TOTAL

        // DISPLAY ASCII OF DICE

        scanner.close();
    }

    static void printAscii(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                |●      |
                |       |
                |      ●|
                 -------
                """;

        String dice3 = """
                 -------
                |●      |
                |   ●   |
                |      ●|
                 -------
                """;

        String dice4 = """
                 -------
                |●     ●|
                |       |
                |●     ●|
                 -------
                """;

        String dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
                """;

        String dice6 = """
                 -------
                |●     ●|
                |●     ●|
                |●     ●|
                 -------
                """;

        switch(roll){
            case 1:
                System.out.print(dice1);
                break;
            case 2:
                System.out.print(dice2);
                break;
            case 3:
                System.out.print(dice3);
                break;
            case 4:
                System.out.print(dice4);
                break;
            case 5:
                System.out.print(dice5);
                break;
            case 6:
                System.out.print(dice6);
                break;
            default:
                System.out.println("Invalid Roll !!!");
                break;
        }




    }
}
