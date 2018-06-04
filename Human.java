/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angeladon
 */
public class Human extends AbstractPlayer {
    private int identifier;
    private int score;
    public Human(int x){
    super();
    identifier = x;
    //set slots based on player id
    
    
    
    }
    public int getID(){
     return identifier;
    }
    public int getScore(){
    return score;
    }
    public void move(){
    
    
    }
    public boolean valid(){
    boolean isMoveValid = false;
    //did the player choose his row and not the other players row
    // is there a pebble in the circle he chose
    //can they go for another turn
    
    return isMoveValid;
    
    }
}
