
/*
 * Clump is defined as a series of 2 or more adjacent elements of the same value. 
 * Write a method that returns the number of clumps in a given array.
*/

public class FindAdjacent {

    public static void main(String[] args) {
        // create a list
        int[] numbers = {98,99,99,99,99,99,100,100,100,534,43,11,11,11};
        System.out.println("Number of clumps: " + countClumps(numbers));

    }

    // Calculate adjacent clumps    
    public static int countClumps(int[] numbers) {
        // initialize count
        int count = 0;

        // iterate all items
        for (int i = 0; i < numbers.length - 1; i++) {
            
            // define and initialize new index
            int j = i+1;

            // check if next items are the same
            while (numbers[i] == numbers[j]) {
                
                if ( j == i +1){
                    // increase count
                    count++;
                }
                // go next item
                j++;

                // Bound error
                if ( j >= numbers.length){
                    break;
                }

                // If next item is different
                if (numbers[i] != numbers[j]){
                    // skip same ones
                    i = j;
                    break;
                }
            }
            
        }

        return count;

    }
    
    
}
