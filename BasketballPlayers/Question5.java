package BasketballPlayers;

import java.util.HashMap;

/* Create a Player class with member variables name and jersey number. 
 * Create two players of your choice and place them in a Hashmap<Player, Integer> where the integer value 
 * can represent the total points scored, thus you can make up some values. 
 * Next, create a new Player object (say player3) that is identical to one of the earlier created 
 * players (same name and jersey number). Now try to use player3 as a key and access the corresponding
 * integer value (total points scored) for this player. Can you? If yes, explain how. If not, explain why not.
 */

public class Question5 {

    public static HashMap<Player,Integer> playerScore = new HashMap<Player,Integer>();



    public static void main(String[] args){

        Player p1 = new Player("Emin",1);
        Player p2 = new Player("Deniz",10);
    
        playerScore.put(p1,150);
        playerScore.put(p2,4);
    
        Player p3 = p1;

        System.out.println(playerScore.get(p3));

    }

    
    
}

private class Player{ 
    
    String name;
    int jerseyno;

    //Constructor
    Player(String name,int jerseyno) {
        this.name=name;
        this.jerseyno=jerseyno;
            
    }
}
