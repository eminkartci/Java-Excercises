package Quiz2;

public class DetectTriple {

    static int[] numbers = {1,54,6,23,55,12,54,54,54,54};

    public static void main(String[] args){

        System.out.println(detectTriple(numbers));

    }

    public static int detectTriple(int[] arr){

        // initialize a count
        int count = 0;

        // iterate all numbers
        for (int i = 0 ; i < arr.length-2 ; i ++){

            // get adjacent 3 numbers
            int n1 = arr[i];
            int n2 = arr[i+1];
            int n3 = arr[i+2];

            // if all numbers are the same
            if(n1 == n2 && n2 == n3 && n1 == n3){
                // increase the count
                count++;
            }
            

        }

        return count;

    }
    
}
