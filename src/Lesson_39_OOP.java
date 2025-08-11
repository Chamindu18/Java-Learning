public class Lesson_39_OOP {
    public static void main(String[] args){

        // object = an entity that hols data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        // calling car object

        Lesson_39_Car car = new Lesson_39_Car();

        //System.out.println(car);
        // if we print car object we get the memory address directly

        //if we want to access attributes in the class
        // objectname.  (use a dot . )
        // known as dot operator
        // allows to access things within an object

        //System.out.println(car.year);
        //System.out.println(car.model);

        // can modify & change the attributes

        //car.isRunning = false;

        //System.out.println(car.isRunning);

        // CALLING THE METHODS

        /*
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
         */

        car.drive();
        car.brake();
    }
}
