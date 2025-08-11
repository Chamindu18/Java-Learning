import java.util.Arrays;
public class Lesson_31_Array {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //    * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana"};

        System.out.println(fruits[0]);

        // we can replace any element by specifying it

        fruits[0] = "pineapple";

        System.out.println(fruits[0]);

        // length of an array

        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);

        // to print all the elements in an array use a loop

        for(int i=0 ; i< fruits.length ; i++){
            System.out.println(fruits[i]);
        }

        // enhanced for loop

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // sorting the array

        // we have to import class Array
        // import java.util.Arrays;

        Arrays.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // fill method
        // we can replace all the elements with a given element
        // using Array class

        Arrays.fill(fruits, "papaya");

        for(String fruit : fruits){
            System.out.println(fruit);
        }





    }
}
