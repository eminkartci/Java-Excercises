package Quiz1;

import java.util.Arrays;

public class findNthMinimum {

    // Find the nth minimum number of given array.

    public static void main(String[] args) {
        // get the index input
        int findMinIndex = Integer.parseInt(args[0]); 

        // check if the index is valid
        if (findMinIndex > args.length -1){
            // inform the user
            System.out.println("The given number array is not large enough !! Please try again...");
            return;
        }
    
        // numbers hold the numbers
        int[] numbers   = new int[args.length-1];
        for(int i = 0 ; i < args.length -1; i++) {
            // Parse it to double
            numbers[i]  = Integer.parseInt(args[i+1]);
        }
    
        Arrays.sort(numbers);

        int NthMinNumber = numbers[findMinIndex-1];

        System.out.println(findMinIndex + "th minimum number is " + NthMinNumber);
    }   
    
}
