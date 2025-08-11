public class Lesson_34_varargs {
    public static void main(String[] args) {

        // variable arguments = varargs

        // varargs = allow a method to accept a varying number of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ...(ellipsis)

        //System.out.println(add(1, 2, 3, 4));

        System.out.println(avg());

    }
    static int add(int... numbers){

        int total = 0;

        for(int number : numbers){
            total += number;
        }
        return total;
    }

    static double avg(double... numbers){

        double total = 0;
        double avg;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            total += number;
        }
        return total / numbers.length;
    }
}
