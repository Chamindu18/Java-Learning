public class Lesson_26_Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called

        /*
        String name = "Chamindu";
        int age = 22;

        bSong(name, age);

         */

        /*
        double result = square(10);
        System.out.println(result);

        String fullName = getFullName("chamindu", "hansana");
        System.out.println(fullName);

         */

        int age = 2;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up!");
        }
    }

    static void bSong(String name, int age) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");


    }

    static double square(double number) {
        return number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

}
