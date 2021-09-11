package PrevWork.Quiz1;

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
        

        // initialize 2 arrays
            // numbers hold the numbers
            // orders holds the positions
            int[] numbers   = new int[args.length-1];
            int[] orders    = new int[args.length-1];
            
            int NthMinNumber = 0;

             // iterate all numbers
             for(int i = 0 ; i < args.length -1; i++) {
                // Parse it to double
                numbers[i]  = Integer.parseInt(args[i+1]);
                orders[i]   = 0;
            }
    
            // initialize the order variable
                // first order is 1
            int order = 1;
    
            // iterate numbers time to order them
            // each time point the minimum and assign an order
            for(int i = 0 ; i < numbers.length ; i++) {
                // initialize min and index
                int nextMin = 9999999;
                int nextMinIndex = 0;
                // iterate all numbers again
                // aim is finding the next minimum
                for(int j = 0 ; j < numbers.length ; j++) {
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

            // get the number
            for (int i = 0 ; i < orders.length ; i ++){
                if (orders[i] == findMinIndex){
                    NthMinNumber = numbers[i]; // first number is ignored
                }
            }
            
            
            System.out.println(findMinIndex + "th minimum number is " + NthMinNumber);
    }   
    
}
