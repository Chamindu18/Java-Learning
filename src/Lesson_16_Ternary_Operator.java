public class Lesson_16_Ternary_Operator {
    public static void main(String[] args) {

        // ternary operator ? = return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        // int score = 55;

        // Normal method
        /*
        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        */

        // Using ternary operator

        /*
        String passOrFail = (score >= 60) ? "PASS" : "FAIL" ;

        System.out.println(passOrFail);

         */

        /*
        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD" ;

        System.out.println(evenOrOdd);

         */

        /*
        int hours = 6;

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeOfDay);

         */

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);



    }
}
