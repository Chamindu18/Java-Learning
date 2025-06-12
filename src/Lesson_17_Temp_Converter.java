import java.util.Scanner;
public class Lesson_17_Temp_Converter {
    public static void main(String[] args) {

        // Temperature Converter

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();


        System.out.print("Convert to Celsius or Fahrenheit? ( C or F ) : ");
        unit = scanner.next().toUpperCase(); // .toUpperCase() = convert into upper case
        // instead of nextLine() we can use next() too!

        // Using ternary operator

        // (condition) ? true : false;

        // unit.equals() to check string equality, string has this built in method

        // we have to assign the condition into a variable

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5 ) + 32;

        // ° = alt + 0176

        System.out.printf("%.2f°%s", newTemp, unit);

        scanner.close();

    }
}
