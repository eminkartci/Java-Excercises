package Homework2;

/*

8. Write a method that returns the number of even integers in a given array.

*/

public class EvenDetector {

    public static void main(String[] args){

        // initialize numbers array
        int[] dinazor = {5,7,9,2,6,8};
        // call the method
        print_array(detect_even_integers(dinazor));
        
    }

    // get an array
    public static void print_array(int[] arr){
        // iterate all items
        for ( int x : arr ){
            // print one by one
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    // 1 Parameter 
        // Int Array
    public static int[] detect_even_integers(int[] numbers){

        int[] evenNumbers = new int[count_even_numbers(numbers)];
        int index = 0;
        // iterate all nubber
        for(int number : numbers){
            // check if the number is even
            if(number % 2 == 0){
                // put the number in the result array
                evenNumbers[index] = number;
                // increase the index
                index++;
            }
        }
        // return even numbers
        return evenNumbers;

    }

    public static int count_even_numbers(int[] numbers){
        
        int evenCount = 0;
        // iterate all nubber
        for(int number : numbers){
            // check if the number is even
            if(number % 2 == 0){
                // increase the count
                evenCount++;
            }
        }
        // return even numbers
        return evenCount;
    }
    
}
