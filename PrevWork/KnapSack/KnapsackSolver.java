package KnapSack;

import java.util.ArrayList;

public class KnapsackSolver {

    static ArrayList<Item> items = new ArrayList<Item>();

    public static void main(String[] args) {
        
        generateItems();

        double totalValue = solveKnapsack(items.size() - 1, 20);

        System.out.println("Total Max Value: " + totalValue);

    }

    public static double solveKnapsack(int itemIndex, double remainedCapacity){

        if(itemIndex < 0 || remainedCapacity <= 0 ){
            return 0;
        }else{

            // If item is heaiver than my capacity
            if(items.get(itemIndex).weight > remainedCapacity){
                System.out.println("Item "+itemIndex + " alınamayacak kadar ağır!");
                // sonraki iteme gec
                return solveKnapsack(itemIndex - 1, remainedCapacity);
            // otherwise
            }else{ 

                double takeIt   = items.get(itemIndex).value + solveKnapsack(itemIndex - 1, remainedCapacity - items.get(itemIndex).weight);
                double leaveIt  =  solveKnapsack(itemIndex - 1, remainedCapacity);

                if (takeIt > leaveIt){
                    System.out.println("Item "+ itemIndex + " aliniyor.");
                }else{
                    System.out.println("Item "+ itemIndex + " alinmiyor.");   
                }
                return Math.max(takeIt,leaveIt);
                
            }


        }

    }
    


    public static void generateItems(){

        Item item1 = new Item(7,15);
        Item item2 = new Item(4,13);
        Item item3 = new Item(9,11);
        Item item4 = new Item(6,10);
        Item item5 = new Item(3,1);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

    }
    
}

class Item {

    // attribute
    double weight;
    double value;

    // Constructor
    public Item(int w,int v){
        this.weight = w;
        this.value = v;
    }

}
