package PrevWork.Homework2;

/*

HW2 - Q3 Given an array of integers,
write a method that returns true if the array repeats a number 
"exactly" twice somewhere, and returns false otherwise. 

*/

public class TwiceElement {


    public static void main(String[] args){

        // initialize numbers array
        int[] dinazor = {5,7,9,2,6,8,5,5,8,7};
        // call the method
        if(return_twice_elements(dinazor)){
            System.out.println("This array has a number that repeates twice !");
        }else{
            System.out.println("This array has not a number that repeates twice !");
        }
        
    }

    // This method returns elements of they repeats exactly twice
        // Input -> Integer Array
    public static boolean return_twice_elements(int[] numbers){
        // initialize a number
        int count = 0;
        // initialize 
        // iterate all numbers
        for (int i = 0 ; i < numbers.length ; i++){
            
            // reset the count
            count = 0;

            // check if they repeat
            for (int j = 0 ; j < numbers.length ; j++){

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


