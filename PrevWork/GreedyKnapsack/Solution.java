package GreedyKnapsack;

import java.util.HashMap;

public class Solution {

	// Attributes
	private ProblemData problemData;
	
	// Constructor
	Solution(ProblemData problemData){
		this.problemData=problemData;
	}


	public void useAlgorithm() {
		// get capacity
		int capacity		= this.problemData.knapsackCapacity;
		int capacityUsed	= 0;
		
		// HASH MAPS
		HashMap<Item,Double> valuePerWeight		= new HashMap<Item,Double>();
		HashMap<Item,Boolean> included			= new HashMap<Item,Boolean>();
		HashMap<Item,Boolean> considered		= new HashMap<Item,Boolean>();
		HashMap<String,Integer> includedInfo	= new HashMap<String,Integer>();	

		// initialize 
		for(Item i:this.problemData.item){
			included.put(i, false);
		}

		for(Item i:this.problemData.item){
			considered.put(i, false);
		}
		
		// Set value per wight
		for(Item i:this.problemData.item)
		{
			valuePerWeight.put(i,(double)i.getValue()/i.getWeight());
		}
		
		// Consider all options
		do {

			// initialize
			double max_ratio=0;
			Item current_max = null;
			
			// check all items
			for(Item i:this.problemData.item){

				// control all non-considered options
				if(!considered.get(i) && valuePerWeight.get(i)>max_ratio)
				{
					// find max value per wight
					max_ratio=valuePerWeight.get(i);
					// get the item
					current_max=i;
				}
			}

			// this means I couldn't find any reasonable item
			if(max_ratio==0){
				break;
			}
			
			// Check current capacity
			if(current_max.getWeight()<=capacity-capacityUsed)
			{
				// considefed
				considered.put(current_max,true);
				// included
				included.put(current_max,true);
				// capacity decreased
				capacity-=current_max.getWeight();

				includedInfo.put(current_max.getID(),current_max.getValue());

			}else{
				considered.put(current_max,true);
			}
			
		} while(true);
		
		// print to the screen
		System.out.println("--- ITEMS ---\n"+includedInfo);
		findTotalValue(included);
	}
	
	public void findTotalValue(HashMap<Item,Boolean> includedItems){

		int totalValue 	= 0;
		int totalWeight = 0;

		for( Item i : includedItems.keySet() ){

			if(includedItems.get(i)){

				totalValue += i.getValue();
				totalWeight+= i.getWeight();
			}

		}

		System.out.println("Total Value: "+ totalValue);
		System.out.println("Total Weight: "+ totalWeight);

	}
}
