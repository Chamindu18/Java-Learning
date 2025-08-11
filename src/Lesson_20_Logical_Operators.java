import java.util.Scanner;
public class Lesson_20_Logical_Operators {
    public static void main(String[] args) {

        // && = AND
        // || = Or
        // !  = NOT

        /*
        double temp = 40;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good!");
            System.out.println("It's sunny!");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good!");
            System.out.println("It's cloudy!");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad!");
        }

         */

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscore

        String username;

        System.out.print("Enter your username : ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username must not contain spaces or underscores!");
        }
        else{
            System.out.println("Welcome " + username + "!");
        }

        scanner.close();



    }
}
