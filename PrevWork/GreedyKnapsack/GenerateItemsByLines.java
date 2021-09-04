package PrevWork.GreedyKnapsack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GenerateItemsByLines {


    public static ArrayList<Item> items = new ArrayList<Item>();
    public static void main(String[] args){

        try{
            // Create buffered reader
			BufferedReader bufferedReader=new BufferedReader(new FileReader("data.csv"));
            String[] content1 = bufferedReader.readLine().split(",") ;
            Item item1 = new Item(content1[0]);
            item1.setValue(Integer.parseInt(content1[1]));
            item1.setWeight(Integer.parseInt(content1[1]));

            
            
        }catch( Exception e){
            System.out.println("There is an error !!");
        }

    }
    
}
