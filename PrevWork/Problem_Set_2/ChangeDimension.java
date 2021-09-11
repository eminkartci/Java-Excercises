package PrevWork.Problem_Set_2;

/*

Write a Java program to print an array after changing the rows and
columns of a given two-dimensional array.

Original Array:
10 20 30
40 50 60

After changing the rows and columns of the said array:
10 40 
20 50
30 60

*/

public class ChangeDimension {

    // Define original 2D array
    public static int[][] originalArray = {{10,20,30},
                                           {40,50,60}};

    public static void main(String[] args) {
        // print to the screen
        print_2D_array(originalArray);
        // take a transpose
            // then print new array
        print_2D_array(transpose_2D_arrat(originalArray));

    }

    public static void print_2D_array(int[][] array2D){
        // title
        System.out.println("\n---> 2D Array <---\n");

        // items
            // rows
        for(int[] line : array2D){
                // munbers
            for(int number : line){
                // print
                System.out.print(number+" ");
            }
            // nextline
            System.out.println();
        }
    }

    public static int[][] transpose_2D_arrat(int[][] array2D){
        // get the row and colum count
        int numOfRow = array2D.length;
        int numOfCol = array2D[0].length;
        // initialze result
        int[][] transposed = new int[numOfCol][numOfRow];


        // iterate rows and columns
        for(int i = 0 ; i < numOfRow ; i++){
            for (int j = 0 ; j < numOfCol ; j++){
                // assign values
                transposed[j][i] = array2D[i][j];
            }
        }
        // return the result
        return transposed;
    }
    
}
