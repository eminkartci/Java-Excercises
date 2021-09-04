package Problem_Set_2;

/*
Question 2 

Write a Java program to check if three given side lengths (integers) can
make a triangle or not.
Expected Output: 

Input side1: 5 
Input side2: 6 
Input side3: 8

Is the said sides form a triangle: true

*/


public class checkSideLengthsTriange {

    public static void main(String[] args){
        // check whether the inputs are valid
        if (check_inputs(args)){
            // Convert String inputs into Double Array
                // If there is a negative number return null
            double[] numbers = convertDouble(args);
            // if numbers are not null
            if (numbers!= null) {
                // Print if the inputs
                print_double_array(numbers); // OPTIONAL
                // Check the sides
                check_triangle_conditions(numbers);
            }
        }
    }

    public static void check_triangle_conditions(double[] sides){
        // Check all sides one by one
        for(int i = 0 ; i < sides.length ; i++){
            // initialize sum and dif
                // sum -> sum of 2 other edges
                // dif -> difference if 2 other edges (always positive)
            double sum = 0;
            double dif = 0;

            // For First edge - First iteration
            if( i == 0 ){
                // get sum and dif
                sum = sides[1] + sides[2];
                dif = Math.abs(sides[1] - sides[2]);
            // For Second edge - Second iteration
            }else if( i == 1 ){
                sum = sides[0] + sides[2];
                dif = Math.abs(sides[0] - sides[2]);
            // For Third edge - Third iteration
            }else if( i == 2 ){
                sum = sides[1] + sides[0];
                dif = Math.abs(sides[1] - sides[0]);
            }

            // if any edge:
                // less then dif
                // greater than sum
            if (sides[i] < dif || sides[i] > sum){
                // inform the user
                System.out.println("These sides connot be a triangle!!");
                // finish the method
                return;
            }

        }
        // If all edges are ok
        // inform the user
        System.out.println("These sides can form a triangle!");


    }
   
    public static boolean check_inputs(String[] input){
        // Check input size
        if(input.length != 3){
            // Warn user
            System.out.println("Your input is not valid because of the number of inputs!! ");
            return false;
        }
        // Otherwise return true
        return true;
    }

    public static double[] convertDouble(String[] input){
        // Initialize current Number and result array
        double currentNumber = 0;
        double[] output = new double[input.length];

        // Iterate all items
        for(int i = 0 ; i < input.length ; i++){
            // In case wrong input
            try{
                // Convert into double
                currentNumber = Double.parseDouble(input[i]);
                // if the number is negative
                if (currentNumber < 0){
                    // warn - Finish
                    System.out.println("Your input is not valid because of a negative number !! ");
                    return null;
                }
                // add to the array
                output[i] = currentNumber;
            // Any problem
            }catch(Exception e){
                // Warn the user
                System.out.println("There is a problem in inputs!!");
            }

        }
        // return the result
        return output;

    }

    public static void print_double_array(double[] arr){
        // title
        System.out.println("\n---- Double Array ----\n");
        // items
        for(double x : arr){
            System.out.print(x+" ");
        }
        // next line
        System.out.println();

    }
    
    
}

