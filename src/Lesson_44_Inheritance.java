public class Lesson_44_Inheritance {
    public static void main(String[] args) {

        // INHERITANCE = ONE CLASS INHERITS THE ATTRIBUTES AND METHODS FROM
        //               ANOTHER CLASS.
        //               CHILD <- PARENT <- GRANDPARENT

        // Organism class = grandparent
        // Animal class = parent
        // Dog, Cat classes = children

        // in order for a class to inherit all the attributes & methods from
        // another class
        // after the class name use 'extends' keyword then specify the parent class

        Lesson_44_Dog dog = new Lesson_44_Dog();
        Lesson_44_Cat cat = new Lesson_44_Cat();
        Lesson_44_Plant plant = new Lesson_44_Plant();

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        dog.speak();

        System.out.println(cat.lives);
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println(plant.isAlive);
        plant.photosynthesize();


    }
}
