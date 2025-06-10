import java.util.Scanner;
public class Lesson_15_WeightConverter {
    public static void main(String[] args) {

        // Weight Conversion Program

        Scanner scanner = new Scanner(System.in);

        // Declare Variables

        double weight;
        double newWeight;
        int choice;

        // Welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        // Prompt for user input

        System.out.print("Choose an option : ");
        choice = scanner.nextInt();

        // option 1 convert lbs to kgs

        if(choice == 1){
            System.out.println("Enter the weight in lbs : ");
            weight = scanner.nextDouble();

        }

        // option 2 convert kgs to lbs

        //else print not a valid choice

    }
}
