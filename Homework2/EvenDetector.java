package Homework2;

/*

8. Write a method that returns the number of even integers in a given array.

*/

public class EvenDetector {

    public static void main(String[] args){

        // initialize numbers array
        int[] dinazor = {5,7,9,2,6,8};
        // call the method
        System.out.println(count_even_numbers(dinazor));
        
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
