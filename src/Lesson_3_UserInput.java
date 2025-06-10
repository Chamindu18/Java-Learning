// We need to use a SCANNER to get User Inputs.
// Scanner is an object that allows us to accept user inputs.


import java.util.Scanner;   // To accept inputs we need this statement.

public class Lesson_3_UserInput {
    public static void main(String[] args){

        // To accept user input we need to create a scanner object.

        Scanner scanner = new Scanner(System.in); // Statement to create the scanner object.

        // Always remember to close the scanner.
        // Statement for closing the scanner is : scanner.close();

        //String Input
        System.out.print("Enter your name : ");
        String name = scanner.nextLine(); //scanner.nextLine used for string variables.

        System.out.println("Hello " +name);

        //Integer Input
        System.out.print("Enter your age : ");
        int age = scanner.nextInt(); //scanner.nextInt used for integer.

        System.out.println("You are " + age + " years old.");

        //Decimal Input

        System.out.print("What is your GPA : ");
        double gpa = scanner.nextDouble(); //scanner.nextDouble used for decimal numbers.

        System.out.println("Your GPA is " + gpa);

        //Boolean Input

        System.out.print("Are you a student (true/false) : ");
        boolean isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }


        // COMMON ISSUE

        // If we accept a integer/double as the first input and then accept a string input we will face an issue.
        // The string will pick the integer line as output because of nextLine.
        // To solve that if we are accepting integer as first input, use scanner.nextLine() at the end of that statement.

        System.out.print("What is your age : ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your favourite color : ");
        String color = scanner.nextLine();

        System.out.println("You are " + age1 + " years old.");
        System.out.println("Your favourite color is " + color);





        scanner.close();









    }
}
