public class Lesson_41_User {

    String username;
    String email;
    int age;

    // creating constructor

    Lesson_41_User(){
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    Lesson_41_User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    Lesson_41_User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    Lesson_41_User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
