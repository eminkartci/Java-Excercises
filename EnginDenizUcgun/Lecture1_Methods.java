
// src -> packages -> .java uzantili file / class -> method -> statement

package EnginDenizUcgun;

public class Lecture1_Methods {


    public static void main(String[] args) {

        // String Array: args => null
        // Integer Array: randomNumbers => [3,425,24,5523,234,66,9,21]

        int[] randomNumbers = {3,425,24,5523,234,66,9,21,42,11,1,0,34};
        calculateAverage(randomNumbers);
    }

    // 1 - define a method takes an integer array and calculates the average
    public static void calculateAverage(int[] numbers){

        // Integer Array: numbers => [3,425,24,5523,234,66,9,21];
        // int: sum => 452;
        // double: average => 2345.234

        int sum = 0; // Initialize 

        // Sum up all numbers
        for(int i = 0 ; i < numbers.length ; i++){

            // int: i = 2;

            sum += numbers[i];
        }

        // divide array's length
        double average = (double) sum / numbers.length;
        System.out.println("The Average: "+average);
    }
    
}
