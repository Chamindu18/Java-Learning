public class Lesson_27_Overloaded_methods {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        System.out.println(add(1, 2));
        System.out.println((add(2, 4, 5)));
        System.out.println(add(1, 2, 3, 4));

        String pizza1 = bakePizza("thick break") ;
        System.out.println(pizza1);

        String pizza2 = bakePizza("thick bread", "cheesy");
        System.out.println(pizza2);
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + " pizza";
    }
}
