public class Lesson_39_Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 9999.99;
    boolean isRunning = false;

    // DEFINING A METHOD

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake " + model);
    }
}
