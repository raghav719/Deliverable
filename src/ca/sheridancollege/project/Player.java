/**
 * 
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 *Modified by: Group SkyHawks
 */
package ca.sheridancollege.project;

/**
 * Player class stores player name and provide it to other classes.
 * 
 * @author skyhawks Sheridan 2019
 */

public class Player {
    
    //field variable
    private String playerName;
    private String playerID;
    
    public void setName(String newPlayerName){
        playerName=newPlayerName;
    }    
    
    public String getName(){
        return playerName;
    }

    
}//end class 
