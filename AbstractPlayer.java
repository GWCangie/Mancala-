/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angeladon
 */
public class AbstractPlayer {
    private int currentplayer;
    public static int lastmove;
    int Boardslots[];
    
    public AbstractPlayer(){
     lastmove = 0;   
     Boardslots = new int[14];
     //player 1 is first
     currentplayer = 1;
    //initialize player1 row to contain 4 pebbles
    for(int i=1;i<Boardslots.length/2;i++){
     Boardslots[i]=4;
    }
    //initializes player 2 pebbles 
    for(int j =8 ;j<Boardslots.length;j++){
        Boardslots[j]=4;
        }
    
    }
    
    
    //FUNCTION TO RUN WHEN PLAYER WANTS A NEW GAME
    public void newGameset(){
    for(int i=1;i<Boardslots.length/2;i++){
     Boardslots[i]=4;
    }
    //initializes player 2 pebbles 
    for(int j =8 ;j<Boardslots.length;j++){
        Boardslots[j]=4;
        }
    Boardslots[0] = 0;
    Boardslots[7]=0;
      currentplayer = 1;
    }
    
     public void nextTurn(){
     if(currentplayer == 1)
         currentplayer = 2;
     else
         currentplayer= 1;
    
    
    }
     
     public int currentTurn(){
     
     return currentplayer;
     }
    
    
    public void move(int startindex){
       if(Boardslots[startindex]!=0){
        int j =startindex+1;
        if(j==14)
            j=0;
        int times;
        //captures the number of pevbbles in slot chosen before setting to 0
        times = Boardslots[startindex];
        //
        Boardslots[startindex]=0;
        boolean done = true;
        //will run a for looop to update slots
    for(int i = 0;i<times;i++ ){
        
        //if i+j == a mancala 
        if(j==0||j==7){
            if(j==7){
            if(currentTurn()==1 && j ==7){
                Boardslots[7]= Boardslots[7]+1;
                done=false;
            }
            //if the position is 7 but its not the players mancala. Gots to skip
            else 
            {
                //if the next position is out of bounds
           
            Boardslots[j+1] = Boardslots[j+1]+1;
            
                
            }
            }
            if(j==0){
            if(currentTurn()==2 && j==0){
                Boardslots[0]= Boardslots[0]+1;
                done=false;
            }
            else 
                Boardslots[j+1]= Boardslots[j+1]+1;
        }
        }
        else{
          Boardslots[j]=Boardslots[j]+1;
          done=true;
          System.out.println("updating slot");
          System.out.println(j);
        }
        j++;
        if(j==14)
            j=0;
    lastmove = j;
    }
    
    System.out.println("called move");
    if(done==true)
        nextTurn();
       }
    
    }
    
   
    public boolean wins (){
    boolean win = true;
    //if row 
    for(int i = 1;i<7;i++){
    if(Boardslots[i]!=0){
    win = false;
        }
    }
    //if win is equal to false, check second players row 
    //for possible wins
    if(win!=true){
    for(int j = 8;j<14;j++){
    if(Boardslots[j]!=0){
        win = false;
        }
      }
    }
    
    
    return win;
    }
    
    private void endGame(){
    
    
    }
}
