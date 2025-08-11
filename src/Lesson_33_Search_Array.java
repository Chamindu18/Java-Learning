import java.util.Scanner;
import java.util.Arrays;
public class Lesson_33_Search_Array {
    public static void main(String[] args) {
        /*
        int[] numbers = {1,3,4,6,2,7,5};
        int target = 20;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index : " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element Not Found!");
        }

         */

        /*
        String[] names = {"A", "B", "C", "D"};
        String Target = "e";
        boolean found = false;

        // to find string values use equals method

        for (int i = 0; i < names.length; i++){
            if(names[i].equals(Target)){
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }
         */

        Scanner scanner = new Scanner(System.in);

        String[] array;
        int size;
        String target;
        int index = -1;
        int count = 0;

        System.out.print("Enter the size of the array : ");
        size = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        array = new String[size];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            array[i] = scanner.nextLine();
        }

        System.out.println("Array : " + Arrays.toString(array));

        System.out.print("Enter an element to search for : ");
        target = scanner.nextLine();

        for(String i : array){
            if(i.equals(target)){
                index = count;
                break;
            }
            count++;
        }

        if(index != -1){
            System.out.println("Element found at index : " + count);
        }
        else{
            System.out.println("Element not found!");
        }

        scanner.close();



    }
}
