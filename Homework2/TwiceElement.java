package Homework2;

/*

10. Given an array of integers,
write a method that returns true if the array repeats a number 
"exactly" twice somewhere, and returns false otherwise. 

*/

public class TwiceElement {



    // This method returns elements of they repeats exactly twice
        // Input -> Integer Array
    public static boolean return_twice_elements(int[] numbers){
        // initialize a number
        int count = 0;
        // initialize 
        // iterate all numbers
        for (int i = 0 ; i < numbers.length ; i++){
            
            // check if they repeat
            for (int j = 0 ; j < numbers.length ; j++){

                // reset the count
                count = 0;

                // check all numbers
                if(numbers[i] == numbers[j]){
                    // increase the count
                    count ++;
                }

            }

            // If this numbers iterates exactly twice
            if(count == 2){
                return true;
            }

        }
        
        // otherwise
        return false;

    }
    
}


