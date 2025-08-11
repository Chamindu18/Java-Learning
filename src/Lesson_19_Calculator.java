import java.util.Scanner;
public class Lesson_19_Calculator {
    public static void main(String[] args) {

        // Creating a Calculator

        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        // assign result to a value

        System.out.print("Enter first number : ");
        number1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^) : ");
        operator = scanner.next().charAt(0);
        //above line gives string
        //to make it into char we use .charAt() method to return a single character

        System.out.print("Enter second number : ");
        number2 = scanner.nextDouble();

        // use single quotes since we are working with characters
        // double quotes used for strings

        switch(operator){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            // if divide by 0
            // use if inside {}
            case '/' -> {
                if(number2 == 0){
                    System.out.println("Can't divide by Zero.");
                    validOperator = false;
                }
                else{
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default ->{
                System.out.println("Invalid operator");
                validOperator = false;
            }
        }

        if(validOperator){
            System.out.println(result);
        }

        scanner.close();

    }
}
