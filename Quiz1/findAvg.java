package Quiz1;


/*
 * Write a code that reports the average of integers in a given sequence. 
 * The numbers are given with the java call. 
 * Let the name of the program be findAvg so we should be able to     call it using the command 
 * java findAvg 3 5 8 -4 
 * and it should print on screen precisely the following: 
 * Average of 3 5 8 -2 is 3.5
 */

public class findAvg{

    public static void main(String[] args){

        // initialize a sum variable
        double sum = 0;

        // iterate all numbers
        for(int i = 0 ; i < args.length ; i++) {
            // Parse it to double
            // sum them
            sum += Double.parseDouble(args[i]);
        }

        // Calculate the average
        double average = sum / args.length;

        // Print Screen

            // First Part
        System.out.print("The average of ");

            // All inputs
        for (String x : args){
            System.out.print(x+ " ");
        }
            // Last Part
        System.out.println(" is " + average + ".");

    }

}