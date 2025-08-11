public class Lesson_35_2d_Arrays {
    public static void main(String[] args) {

        // 2D ARRAYS = an array where each element is an array
        //             useful for storing a matrix of data

        /*
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();


        }

         */

        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + "   ");
            }
            System.out.println();
        }
    }
}
