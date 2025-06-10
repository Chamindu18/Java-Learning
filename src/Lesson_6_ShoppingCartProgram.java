import java.util.Scanner;

public class Lesson_6_ShoppingCartProgram {
    public static void main(String[] args) {

        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        // Declare Variables

        String item;
        double prize;
        int quantity;
        char currency = '$'; // Assigning Variable
        double total;

        System.out.print("What item would you buy : ");
        item = scanner.nextLine();

        System.out.print("What is the prize for each : $ ");
        prize = scanner.nextDouble();

        System.out.print("How many would you like : ");
        quantity = scanner.nextInt();

        total = prize * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);




        scanner.close();


    }
}
