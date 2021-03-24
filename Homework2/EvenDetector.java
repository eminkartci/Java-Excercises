package Homework2;

/*

8. Write a method that returns the number of even integers in a given array.

*/

public class EvenDetector {

    public static void main(String[] args){

        
    }

    // 1 Parameter 
        // Int Array
    public static int[] detect_even_integers(int[] numbers){

        int[] evenNumbers = new int[numbers.length];
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
    
}
