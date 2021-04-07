package KnapSack;

public class Main {

    public static void main(String[] args){
        // define initial values
        int[] weights   = {1,2,4,2,5};
        int[] values    = {5,3,5,3,2};

        // create object
        KnapSack problem1 = new KnapSack(weights,values);
        
        // get max value 
        System.out.println(problem1.findMaxValue(4,10));
    }
}
