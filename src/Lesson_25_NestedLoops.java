import java.util.Scanner;
public class Lesson_25_NestedLoops {
    public static void main(String[] args) {

        // nested loop = a loop inside another loop
        // used often with matrices or DS & A

        /*
        for(int i = 1;i <= 3; i++){
            for(int j = 1;j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
         */

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns : ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol you want to print : ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns ; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();



    }
}
