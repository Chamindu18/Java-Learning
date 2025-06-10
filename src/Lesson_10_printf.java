public class Lesson_10_printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "Chamindu";
        char firstLetter = 'C';
        int age = 22;
        double height = 66.8;
        boolean isStudent = true;

        // Adding variable to a statement

        System.out.printf("Hello %s!\n", name);   // %s = string
        System.out.printf("Your name start with a %c.\n", firstLetter);   // %c = char
        System.out.printf("You are %d years old.\n", age);   // %d = integer
        System.out.printf("Your are %.2f inches tall.\n", height);  // %f = double
        System.out.printf("Student : %b\n", isStudent);   // %b = boolean

        // Adding multiple variables to a statement

        System.out.printf("%s is %d years old.\n", name, age);

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if ngative, space if positive

        // Have to add after % sign

        double price1 = 90000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        // +
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);

        // ,
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n", price3);

        // (
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        // space = useful for lining up
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        // Width

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // o = zero padding
        // after 0 you have to add how many padding to be

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // right justify
        // adding a positive number

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        // left justify
        // adding a negative number

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);












    }
}
