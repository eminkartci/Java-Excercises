package PrevWork.BasketballPlayers;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Suppose we have the following code with an object named efes, that holds the jersey numbers and names of players:
 * HashMap<Integer, String> efes = new HashMap<Integer, String>();
efes.put(15, "Ufuk");
efes.put(7, "Petar");
efes.put(9, "Conrad");
efes.put(8, "Volkan");
efes.put(11, "Murat");
Write a Player class with only public variable members and a HashSort method that 
takes the HashMap and returns a sorted array of Player objects in 
ascending jersey number.
 I should be able to do
 Player[] efes_sorted=HashSort(efes);
 After this line, 
 Player.length should be 5. 
 For example:
 Player[0].number should be 7 and Player[0].name should be "Petar", 
 Player[2].number should be 9 and Player[2].name should be "Conrad" etc.
 */

public class PlayersAdditional {

    
    public static void main(String[] args){

        HashMap<Integer, String> efes = new HashMap<Integer, String>();
        efes.put(15, "Ufuk");
        efes.put(7, "Petar");
        efes.put(9, "Conrad");
        efes.put(8, "Volkan");
        efes.put(11, "Murat");

        Player1[] players = Player1.hashSort(efes);
 
        for(Player1 p : players){
            System.out.println("Number: "+ p.number + " - Name:  " + p.name );
        }
    }

    
    


}

class Player1{

    public String name;
    public int number;

    public Player1(String name,int number){
        this.name = name;
        this.number = number;
    }

    public static Player1[] hashSort(HashMap<Integer, String> efes) {
        
        Player1[] players = new Player1[efes.size()];
        int index = 0;
        for(int n : efes.keySet()){
            Player1 currentPlayer = new Player1(efes.get(n),n);
            players[index] = currentPlayer;
            index++;
        }

        return players;
  
     }

}

