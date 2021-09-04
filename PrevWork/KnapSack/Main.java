package PrevWork.KnapSack;

public class Main {

    public static void main(String[] args){

        // define initial values
        int[] weights   = {5,4,6,3};
        int[] values    = {10,40,30,50};

        // create object
        KnapSack problem1 = new KnapSack(weights,values);
        
        // get max value 
        System.out.println(problem1.findMaxValue(3,10));
        
    }
}
