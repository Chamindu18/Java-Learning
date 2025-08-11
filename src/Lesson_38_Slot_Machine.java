import java.util.Random;
import java.util.Scanner;
public class Lesson_38_Slot_Machine {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES
        // DISPLAY WELCOME MESSAGE
        // PLAY IF BALANCE > 0
        // ENTER BET AMOUNT
        //      VERIFY IF BET > BALANCE
        //      VERIFY IF BET > 0
        //      SUBTRACT BET FROM BALANCE
        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // Welcome msg
        System.out.println("*****************************");
        System.out.println("Welcome to Java Slot Machine!");
        System.out.println("  Symbols : ☠️ 🔔 🍉 7️⃣ 💣  ");
        System.out.println("*****************************");

        while(balance > 0){
            System.out.println("Current Balance : $ " + balance);
            System.out.print("Place your bet amount : ");
            bet = scanner.nextInt();

            if(bet > balance){
                System.out.println("Insufficient Funds!");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be Greater than 0 !");
                continue;
            }
            else{
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round");
            }
        }

        scanner.close();



    }

    static String[] spinRow(){

        String[] symbols = {"☠️", "🔔", "🍉",  "7️⃣", "💣"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        System.out.print(row[0] + row[1] + row[2]);

        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "💣" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🔔" -> bet * 5;
                case "7️⃣" -> bet * 10;
                case "☠️" -> bet * 20;
                default -> 0;
            };
        }

        return 0;
    }
}
