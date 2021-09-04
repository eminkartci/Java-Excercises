package PrevWork.BasketballPlayers;

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
public class Players {
    public static void main(String[] args) {
        HashMap<Integer, String> efes = new HashMap<Integer, String>();
        efes.put(15, "Ufuk");
        efes.put(7, "Petar");
        efes.put(9, "Conrad");
        efes.put(8, "Volkan");
        efes.put(11, "Murat");
    }

    public void HashSort(HashMap<Integer, String> efes){

    }
}