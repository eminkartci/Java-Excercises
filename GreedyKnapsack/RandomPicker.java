package GreedyKnapsack;

import java.util.ArrayList;
import java.util.Random;

public class RandomPicker {

    public static Random random     = new Random();
    private ProblemData pd          = new ProblemData();
    private int remainedCapacity    ;

    public ArrayList<Item> items    = new ArrayList<Item>();

    public RandomPicker(ProblemData pd){
        this.pd = pd;
        remainedCapacity = pd.knapsackCapacity;
    }

    public Item getRandomItem(){

        int itemCount = this.pd.item.length;

        int randomIndex = random.nextInt(itemCount);

        return this.pd.item[randomIndex];

    }

    public void getItem(Item item){

        if( remainedCapacity >= item.getWeight()){

            items.add(item);

            remainedCapacity -= item.getWeight();

        }else{
            
            System.out.println( item.getID() + " Item is too heavy !!");

        }

    }

    public void randomPick(){
 
        for(int i = 0 ; i < random.nextInt(10)+20 ; i++){

            getItem(getRandomItem());

        }

        informUser();
    }

    public void informUser(){

        int totalValue  = 0;
        int totalWeight = 0;
        int itemCount   = 0;

        for(Item i : items){
            totalValue += i.getValue();
            totalWeight += i.getWeight();
            itemCount++;
        }

        System.out.println("Item Count  : " + itemCount);
        System.out.println("Total Value : " + totalValue);
        System.out.println("Total Weight: " + totalWeight);

        System.out.println(items);

    }
    
    
}
