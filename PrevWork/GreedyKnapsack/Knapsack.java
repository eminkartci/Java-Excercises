package PrevWork.GreedyKnapsack;

import java.io.*;

public class Knapsack {


	public static void main(String[] args) {

		// Read an store data
		ProblemData problemData = ReadData();

		// Create Solution object
		Solution solution1 = new Solution(problemData);

		// call method
		solution1.useAlgorithm();

		// Create random picker
		RandomPicker Deniz = new RandomPicker(problemData);

		Deniz.randomPick();
	}



	private static ProblemData ReadData() {

		// Create a problem data object
		ProblemData problemData=new ProblemData();

		// initialize
		int knapsackCapacity;
		Item[] items;

		try {

			// Create buffered reader
			BufferedReader bufferedReader=new BufferedReader(new FileReader("GreedyKnapsack/data.csv"));

			// Get first line
			String line=bufferedReader.readLine();

			// Split
			String[] names=line.split(",");

			// get item count
			int numberofItems=names.length-1;

			// initialize the array
			items=new Item[numberofItems];

			// Generate Items
			for(int i=0;i<numberofItems;i++)
			{

				items[i]=new Item(names[i+1]);
			}
			
			// read next line
			line=bufferedReader.readLine();

			// split again
			String[] values=line.split(",");

			// Set values
			for(int i=0;i<numberofItems;i++)
			{
				items[i].setValue(Integer.parseInt(values[i+1]));
			}
			
			// read next line
			line=bufferedReader.readLine();
			String[] weights=line.split(",");
			for(int i=0;i<numberofItems;i++)

			// set weigths
			{
				items[i].setWeight(Integer.parseInt(weights[i+1]));
			}
			
			// empty line
			line=bufferedReader.readLine();

			// capacity line
			line=bufferedReader.readLine();
			String[] capacityline=line.split(",");
			//use capacityline[1] as capacity
			knapsackCapacity=Integer.parseInt(capacityline[1]);


			// set problemData object's attributes
			problemData.item=items;
			problemData.knapsackCapacity=knapsackCapacity;
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return problemData;
		
	}
	
}
