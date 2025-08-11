import java.util.Scanner;
public class Lesson_23_For_Loops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN  amount of time

        //for(int i = 1; i <= 10 ; i++){
         //   System.out.println(i);
          //}

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter how many times you want to loop : ");
        int max = scanner.nextInt();

        for(int i = 0 ; i < max ; i++){
            System.out.println(i);
        }
        */

        // Count Down Timer

        System.out.print("How many seconds to scan down : ");
        int start = scanner.nextInt();

        for(int i = start ; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(500);
        }

        System.out.println("Hello!!!!");

        scanner.close();
    }
}
