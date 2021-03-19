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

        double sum = 0;

        for(int i = 0 ; i < args.length ; i++) {

            sum += Double.parseDouble(args[i]);

        }

        double average = sum / args.length;

        System.out.print("The average of ");
        for (String x : args){
            System.out.print(x+ " ");
        }
        System.out.println(" is " + average + ".");

    }

}