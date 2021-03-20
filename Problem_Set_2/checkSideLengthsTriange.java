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

        check_inputs(args);
        double[] numbers = convertDouble(args);
        print_double_array(numbers);
    }

    public static void check_inputs(String[] input){
        if(input.length != 3){
            System.out.println("Your input is not valid !! ");
        }
    }

    public static double[] convertDouble(String[] input){

        double currentNumber = 0;
        double[] output = new double[input.length];

        for(int i = 0 ; i < input.length ; i++){

            try{
                currentNumber = Double.parseDouble(input[i]);
                output[i] = currentNumber;
            }catch(Exception e){
                System.out.println("There is a problem in inputs!!");
            }

        }

        return output;

    }

    public static void print_double_array(double[] arr){

        System.out.println("\n---- Double Array ----\n");
        for(double x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

    }
    
    
}

