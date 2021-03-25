package Extra_Questions;

import java.util.Scanner;

/*

Q1 - Draw this:

   **       ** 
  ****     **** 
 ******   ******
******** ********

Row     0 1 2 3
space1  3 2 1 0
star1   2 4 6 8
space2  7 5 3 1
star2   2 4 6 8
*/
public class DrawStars {

    public static Scanner scanInt = new Scanner(System.in);

    public static void main(String args[]){
        
        // call first question
        draw_Q1(get_row_count());
        
    }

    public static int get_row_count(){

        // Errors
        try{
            // inform the user 
            System.out.println("Row Count : "); int rowCount = scanInt.nextInt();

            // Restrictions
            if (rowCount <= 0){
                System.out.println("Number cannot be less than or equal to zero !");
                return get_row_count();
            }
            return rowCount;
       
        // In case any problem
        }catch(Exception e){
            // Warn the user
            System.out.println("Please type a valid number !!");
            // Get a new value and return it
            return get_row_count();
        }
        
    }

    public static void draw_Q1(int rowCount){

        // Constants
        int firstSpace      = rowCount -1;
        int initialStar     = 2;
        int secindSpace     = 2 * rowCount - 1;

        // iteare rows
        for(int row = 0 ; row < rowCount ; row++){

            // Spaces 1
            for(int space = 0 ; space < firstSpace - row; space++){

                System.out.print(" ");

            }

            // Stars 1
            for (int star = 0 ; star < initialStar + (initialStar * row) ; star ++){
                System.out.print("*");
            }

            // Spaces 2
            for(int space = 0 ; space < secindSpace - (row * 2) ; space++){

                System.out.print(" ");

            }

            // Stars 2
            for (int star = 0 ; star < initialStar + (initialStar * row) ; star ++){
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
    
}
