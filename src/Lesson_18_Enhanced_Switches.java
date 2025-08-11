import java.util.Scanner;
public class Lesson_18_Enhanced_Switches {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week : ");
        String day = scanner.next();

        // to make a switch we use switch(value/variable){}
        // -> means do this
        // case = if true
        // default = if it's not true

        //switch(day){
            //case "Monday" -> System.out.println("It's a weekday");
            //case "Tuesday" -> System.out.println("It's a weekday");
            //case "Wednesday" -> System.out.println("It's a weekday");
            //case "Thursday" -> System.out.println("It's a weekday");
            //case "Friday" -> System.out.println("It's a weekday");
            //case "Saturday" -> System.out.println("It's the weekend");
            //case "Sunday" -> System.out.println("It's the weekend");
            //default -> System.out.println("It's not a day.");
        //}

        // we can ',' separate the cases
        switch(day.toLowerCase()){
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("It's a weekday");
            case "saturday","sunday" -> System.out.println("It's the weekend");
            default -> System.out.println("It's not a day.");

        }



        scanner.close();

    }
}
