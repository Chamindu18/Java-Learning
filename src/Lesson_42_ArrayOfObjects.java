public class Lesson_42_ArrayOfObjects {
    public static void main(String[] main) {

        /*
        Lesson_42_Car car1 = new Lesson_42_Car("Mustang", "Red");
        Lesson_42_Car car2 = new Lesson_42_Car("BMW", "Black");
        Lesson_42_Car car3 = new Lesson_42_Car("Benz", "White");
         */

        // CREATING AN ARRAY

        // STORING Lesson_42_Car objects

        //Lesson_42_Car[] cars = new Lesson_42_Car[3];

        // we can assign the values to the array too!

        //Lesson_42_Car[] cars = {car1, car2, car3};

        // we can use a for loop to iterate through this array

        /*
        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }
         */

        // ENHANCED FOR LOOP WOULD BE BETTER

        /*
        for(Lesson_42_Car car:cars){  // for every car object in array of cars
            car.drive();
        }
         */

        // when crating an array we can pass anonymous objects rather than mentioning the objects

        Lesson_42_Car[] cars = {new Lesson_42_Car("Mustang", "Red"),
                                new Lesson_42_Car("BMW", "Black"),
                                new Lesson_42_Car("Benz","White")};

        // we can change the color of each car using enhaned for loop

        for(Lesson_42_Car car:cars) {
            car.color = "Black";
        }

        for(Lesson_42_Car car:cars) {
            car.drive();
        }
    }

}
