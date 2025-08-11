public class Lesson_40_Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Creating a Constructor
    // same name as the class

    Lesson_40_Student(String name, int age, double gpa){
        //to assign attributes we use 'this' keyword

        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying!");
    }


}
