public class Lesson_28_Variable_Scope {

    static int x = 3; // class scope
    // inside the class not the method

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        // Local =  Where declared: Inside a method, constructor, or block.
        //          Scope: Only within that method or block.

        // Class =  Where declared: Inside a class, outside methods,
        //          with static.
        //          Scope: Shared across all objects of the class;
        //          accessible by all methods (both static and non-static).

        // a variable declared inside a method has a local scope

        int x = 1;  // local scope
        System.out.println(x);

        doSomething();
    }

    static void doSomething(){
        int x = 2; // local scope
        System.out.println(x);
    }
}
