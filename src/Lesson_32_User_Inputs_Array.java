import java.util.Scanner;
import java.util.Arrays;
public class Lesson_32_User_Inputs_Array {
    public static void main(String[] args) {

        // Declare an Array

        // we have to create an empty array with assigned size

        Scanner scanner = new Scanner(System.in);

        /*
        String[] names = new String[4];

        for(int i = 0; i < names.length ; i++){
            System.out.print("Enter name " + (i+1) + " : ");
            names[i] = scanner.nextLine();
        }

        // print the whole array at once
        // toString method

        System.out.println(Arrays.toString(names));

        for(String name : names){
            System.out.println(name);
        }
         */

        String[] foods;
        int size;

        System.out.print("Number of foods you want : ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter food " + (i+1) + " : ");
            foods[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(foods));


        scanner.close();

    }
}
