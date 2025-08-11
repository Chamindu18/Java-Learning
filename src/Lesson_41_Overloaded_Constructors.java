public class Lesson_41_Overloaded_Constructors {
    public static void main(String[] main) {

        // OVERLOADED CONSTRUCTORS = ALLOW A CLASS TO HAVE MULTIPLE CONSTRUCTORS
        //                          WITH DIFFERENT PARAMETER LISTS.
        //                          ENABLE OBJECTS TO BE INITIALIZED IN VARIOUS WAYS

        Lesson_41_User user1 = new Lesson_41_User("Chamindu");
        Lesson_41_User user2 = new Lesson_41_User("Chamindu", "fake@gmail.com");
        Lesson_41_User user3 = new Lesson_41_User("Chamindu","fake@gmail.com", 22);
        Lesson_41_User user4 = new Lesson_41_User();

        // user1
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        // user2
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        // user3
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        // user4
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
