
// src -> packages -> .java uzantili file / class -> method -> statement

package EnginDenizUcgun;

public class Lecture1 {

    // 1 - define a method takes an integer array and calculates the average
    public static void calculateAverage(int[] numbers){

        // numbers = [1,47,34,33,5467];
        int sum = 0;

        // Sum up all numbers
        for(int i = 0 ; i < numbers.length ; i++){
            sum += numbers[i];
        }

        // divide array's length
        double average = (double) sum / (double) numbers.length;
        System.out.println("The Average: "+average);
    }
    
}
