import java.util.Scanner;
public class Lesson_3_UserInput_Exersice {
    public static void main(String[] args) {

        // Calculate area of a rectangle

        // Declare  variables
        double width;
        double height;
        double area;

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Accept inputs
        System.out.print("Enter the width : ");
        width = scanner.nextDouble();

        System.out.print("Enter the height : ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Area is " + area + " cm² "); // For square --> alt + 0178





    }
}
