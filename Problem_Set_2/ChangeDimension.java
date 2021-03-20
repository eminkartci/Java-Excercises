package Problem_Set_2;

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

    public static int[][] originalArray = {{10,20,30},
                                           {40,50,60}};
    public static void main(String[] args) {

        print_2D_arrat(originalArray);

    }

    public static void print_2D_arrat(int[][] array2D){

        System.out.println("\n---> 2D Array <---\n");
        for(int[] line : array2D){
            for(int number : line){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
    
}
