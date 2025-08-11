import java.util.Scanner;
public class Lesson_29_Banking_Program {

    // make the scanner inside the class instead of mainmethod
    // so we can use the scanner outside the method to accept user inputs
    // use static

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA Banking Program



        // Declare variables

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            // Display menu

            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // Get and Process user choice

            System.out.print("Enter your choice (1 - 4) : ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    break;
                case 3:
                    balance -= withdraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("!!! INVALID CHOICE !!!");
            }
        }

        System.out.println("*********************************");
        System.out.println("Thank you for Banking with US !!!");
        System.out.println("Have a Nice Day !!!");
        System.out.println("*********************************");






        // withdraw()

        // Exit message

        scanner.close();

    }
    // Method to show balance

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("Balance : Rs. %.2f \n", balance);
    }

    // Method for deposit

    static double deposit(){
        double amount;
        System.out.print("Enter an amount to deposited : ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("***************");
            System.out.println("Amount can't be NEGATIVE !!!");
            return 0;
        }
        else{
            return amount;
        }
    }

    // Method for withdrawal

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter an amount to Withdraw : ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("***************");
            System.out.println("!!! INSUFFICIENT ACCOUNT BALANCE !!!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("***************");
            System.out.println("AMount can't be NEGATIVE !!!");
            return 0;
        }
        else{
            return amount;
        }
    }

}
