package Extra_Questions;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String [] args) {
        // initialize an array
        int [] array= {1,2,3,4};

        // Print reversed array
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    
    public static int [] reverseArray(int [] array) {
        
        // define a new array
        // has the same length
        int [] reverse=new int[array.length];

        // iterate all items
        for(int i=0;i<array.length;i++) {
            // increasing reverse
            // decreasing array
            reverse[i]=array[array.length-i-1];

        }

        // return the inverted array
        return reverse;
    }
    
}