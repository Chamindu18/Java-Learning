import java.util.Scanner;
public class Lesson_14_Substring {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string - string.substring(start,end)

        /*
        String email = "fake123@gmail.com";
        String username = email.substring(0,email.indexOf("@"));  // indexOf() to pick a index
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
        */

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email : ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contains @");
        }





        scanner.close();


    }
}
