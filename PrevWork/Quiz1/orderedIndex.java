package PrevWork.Quiz1;

/*
 * Write a code that reports the ordered index of integers in a given sequence.
 *  That is if the numbers are ordered in increasing order, what is their place in the sequence. 
 *  If the numbers are 3 8 4 -2, smallest to largest is -2 3 4 8. 
 *  In this ordered list, -2 is located first (#1), 3 is second (#2), 4 is third (#3), and 8 is fourth (#4). 
 *  Therefore, the indices of 3 8 4 -2 becomes 2 4 3 1. 
 *  The numbers are given with the java call. Let the name of the program be orderedIndex so we should be able to call it using the command 
 *  java orderedIndex 3 5 8 -4 
 *  and it should print on screen the following: 
 *  Ordered indices of 3 8 4 -2 is 2 4 3 1 
 *  If there are more than one integers with the same value, you can order them in any way, it doesn't matter.
 *  So ordered indices of 3 8 4 4 is 1 4 2 3 or 1 4 3 2. Both are correct.
 *  Hint: You can hold an indices array, initially all zeros. Find the minimum of numbers whose indices are still zero. 
 *  Label the corresponding entry in indices array as 1. 
 *  Again find the minimum of numbers whose indices are still zero.
 *  Label the corresponding entry in indices array as 2 now etc.
 */


public class orderedIndex {

    public static void main(String[] args){

        // initialize 2 arrays
            // numbers hold the numbers
            // orders holds the positions
        int[] numbers   = new int[args.length];
        int[] orders    = new int[args.length];

         // iterate all numbers
         for(int i = 0 ; i < args.length ; i++) {
            // Parse it to double
            numbers[i]  = Integer.parseInt(args[i]);
            orders[i]   = 0;
        }

        // initialize the order variable
            // first order is 1
        int order = 1;

        // iterate numbers time to order them
        // each time point the minimum and assign an order
        for(int i = 0 ; i < args.length ; i++) {
            // initialize min and index
            int nextMin = 9999999;
            int nextMinIndex = 0;
            // iterate all numbers again
            // aim is finding the next minimum
            for(int j = 0 ; j < args.length ; j++) {
                // the next min number shouldn't be assigned a value
                if(orders[j] == 0){
                    // if the current number is less or equal to the min
                    if (numbers[j] <= nextMin){
                        // assign min
                        nextMin = numbers[j];
                        // hold its position
                        nextMinIndex = j;
                    }
                }
            }

            // After finding the min value and its position assign it
            orders[nextMinIndex] = order;
            // Increase the order
            order++;
        }

        // Print to the screen
        System.out.print("Ordered indices ");
        // inputs
        for (String x : args){
            System.out.print(x+ " ");
        }
        //last part
        System.out.print(" is ");
        for(int i : orders){
            System.out.print(i+" ");
        }
        System.out.println(" .");
    }
    
}
