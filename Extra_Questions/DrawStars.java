package Extra_Questions;

/*

Q1 - Draw this:

   **       ** 
  ****     **** 
 ******   ******
******** ********

*/
public class DrawStars {



    public static void draw_Q1(){

        // Constants
        int rowCount = 4;

        // iteare rows
        for(int row = 0 ; row < rowCount ; row++){

            // Spaces
            for(int space = 0 ; space < 3 ; space++){

                System.out.print(" ");

            }

            // Stars
            for (int star = 0 ; star < 2 ; star ++){
                System.out.print("*");
            }

            // Spaces
            for(int space = 0 ; space < 7 ; space++){

                System.out.print(" ");

            }

            // Stars
            for (int star = 0 ; star < 2 ; star ++){
                System.out.print("*");
            }

        }
    }
    
}
