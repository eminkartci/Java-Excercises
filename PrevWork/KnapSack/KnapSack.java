package PrevWork.KnapSack;

public class KnapSack {

    private int[] weights,values;
    private int maxCapacity;


    public KnapSack(int[] weights,int[] values){
        this.weights = weights;
        this.values = values;
    }

    public int findMaxValue(int itemIndex,int remainedCapacity){

        // define initial values
        // int[] weights   = {5 ,4 ,6 ,3};
        // int[] values    = {10,40,30,50};

        // check if it is out of my constraints
            // index less than 0
            // remained capacity less than 0
        if(itemIndex < 0 || remainedCapacity <= 0 ){
            return 0;
        }// current item exceeds my capacity
        else if (this.weights[itemIndex] > remainedCapacity){
            // go to the next item
            return findMaxValue(itemIndex -1, remainedCapacity);
        // The item is available
        }else{
            // option 1 is don't choosing the current item
            int option1 = findMaxValue(itemIndex -1, remainedCapacity);

            // option 2 is selecting item
            int option2 = findMaxValue(itemIndex -1, remainedCapacity - this.weights[itemIndex]) + this.values[itemIndex];

            // return the maximum
            return Math.max(option1,option2);
        }
    }
    
}
