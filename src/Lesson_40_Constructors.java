public class Lesson_40_Constructors {
    public static void main(String[] args) {

        // CONSTRUCTOR = A SPECIAL METHOD TO INTIALIZE OBJECTS
        //               YOU CAN PASS ARGUMENTS TO A CONSTRUCTOR
        //               AND SET UP INITIAL VALUES

        // CALLING THE OBJECT

        Lesson_40_Student student1 = new Lesson_40_Student("Chamindu", 22, 3.3);
        Lesson_40_Student student2 = new Lesson_40_Student("Sanuka", 18, 3.2);
        Lesson_40_Student student3 = new Lesson_40_Student("Janidu", 23, 3.0);

        /*
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
         */

        student1.study();
        student2.study();
        student3.study();



    }
}
