import java.util.Scanner;
public class Lesson_9_Math_Class_Exercise1 {
    public static void main(String[] args) {

        // HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        // Declare Variables

        double a;
        double b;
        double c;

        // Accept user inputs

        System.out.print("Enter the length of side A : ");
        a = scanner.nextDouble();

        System.out.print("Enter the length od side B : ");
        b = scanner.nextDouble();

        // Assigning C

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse : " + c);

        scanner.close();



    }
}
