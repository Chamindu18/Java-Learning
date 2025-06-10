import java.util.Scanner;

public class Lesson_9_Math_Class_Exercise2 {
    public static void main(String[] args) {

        // circumference = 2 * PI * radius;
        // area = PI * radius²;
        // volume = (4/3) * PI * pow(radius, 3);

        Scanner scanner = new Scanner(System.in);

        // Declare variables

        double radius;
        double circumference;
        double area;
        double volume;

        // Accept user inputs

        System.out.print("Enter the radius : ");
        radius = scanner.nextDouble();

        // Assigning

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI *Math.pow(radius, 3);

        //To Add a place holder use "printf"
        // use %f inside the statement and instead of '+' use ','

        System.out.printf("The circumference of the circle : %.1f cm\n ", circumference);
        System.out.printf("The area of the circle : %.1f cm²\n ", area); // x² = alt + 0178
        System.out.printf("The volume of the circle : %.1f cm³\n ", volume); // x³ = alt + 0179

        /*Specifier     Description
             %d	        Integer (int)
             %f	        Floating point (double)
            %.2f	    Floating point (2 decimals)
             %s	        String
             %c	        Character
             %n	        New line (better than \n for portability)

         */







        scanner.close();


    }
}
