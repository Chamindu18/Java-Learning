import java.util.Scanner;
public class Lesson_36_Quiz_Game {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        // QUESTIONS ARRAY[]
        // OPTIONS ARRAY[][]
        // DECLARE VARIABLES
        // WELCOME MESSAGE
        // QUESTION (LOOP)
        //      OPTIONS
        //      GET GUESS FROM USER
        //      CHECK OUR GUESS
        // DISPLAY FINAL SCORE

        String[] questions = {"01) What is the main function of a router?",
                              "02) Which part of the computer is considered the brain?",
                              "03) What year was Facebook launched?",
                              "04) Who is known as the father of computer?",
                              "05) What was the first programming language?"};

        String[][] options = {{"1. Storing files","2. Encrypting data","3. Directing internet traffic","4. Managing passwords"},
                              {"1. CPU","2. Hard drive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
                              {"1. COBOL","2. C#","3. Fortran","4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        System.out.println();

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);


            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.println();
            System.out.print("Enter your guess : ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println();
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                System.out.println();
                score++;
            }else{
                System.out.println();
                System.out.println("********");
                System.out.println("Wrong!");
                System.out.println("********");
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("***********************");
        System.out.println("Final Score : " + score + " / 5");
        System.out.println("***********************");

        scanner.close();

    }
}
