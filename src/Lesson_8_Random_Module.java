import java.util.Random;   // Random = This class is used for generating random numbers

public class Lesson_8_Random_Module {
    public static void main(String[] args) {

        // Random Numbers

        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1, 7);  // Inside () we can set limits
        number2 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
