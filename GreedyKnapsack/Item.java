package GreedyKnapsack;


public class Item {

	// Attributes
	private String itemId;
	private int value;
	private int weight;
	
	// Constructor
	Item(String itemId){
		this.itemId=itemId;
	}

	// SETTER - GETTER
	public void setValue(int value) {
		this.value=value;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getValue() {
		return this.value;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getID(){
		return this.itemId;
	}

}
