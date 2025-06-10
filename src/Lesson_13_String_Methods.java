public class Lesson_13_String_Methods {
    public static void main(String[] args) {

        // String Methods

        String name = "Password";

        //int length = name.length(); // length() = This method is used to check how many characters in it
        //char letter = name.charAt(5); // charAt() = Returns the character at a specific index
        //int index = name.indexOf("n"); // indexOf() = Finds the index of a character or a word(This method finds the first one)
        //int lastIndex = name.lastIndexOf("n"); // lastIndexOf() = This method finds the last index of the given character or a word

        //name = name.toUpperCase(); // toUpperCase() = Convert string into upper case
        //name = name.toLowerCase(); // toLowerCase() = Convert string into lower case
        //name = name.trim(); // trim() = Remove leading and trailing space
        //name = name.replace("a", "o"); // replace() = Replaces a character or a word

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }
        else{
            System.out.println("Hello "+ name);
        }
         */
        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space.");
        }
        else{
            System.out.println("Your name doesn't contain any spaces.");
        }
        */
        //System.out.println(length);
        //System.out.println(letter);
        //System.out.println(index);
        //System.out.println(lastIndex);
        //System.out.println(name);

        if(name.equalsIgnoreCase("password")){    //IgnoreCase to ignor letter case
            System.out.println("Your name can't be password.");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
