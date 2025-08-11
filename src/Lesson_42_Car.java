public class Lesson_42_Car {

    String model;
    String color;

    // Constructor

    Lesson_42_Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    // Method

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
