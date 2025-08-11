public class Lesson_43_Friend {

    static int numOfFriends;
    String name;

    // CONSTRUCTOR

    Lesson_43_Friend(String name){
        this.name = name;
        numOfFriends++ ;
    }

    // methods also can be modified by static keyword

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
        // when using static no need for 'this' keyword
    }

}
