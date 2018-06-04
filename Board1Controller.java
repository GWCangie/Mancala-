/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


import javafx.scene.shape.*;
import javafx.stage.Stage;

import javafx.util.Duration;
/**
 * FXML Controller class
 *
 * @author angeladon
 */

public class Board1Controller extends AbstractPlayer implements Initializable {

    
    @FXML private Ellipse Mancala1; 
    @FXML private Circle slot1; 
    @FXML private Circle slot2;
    @FXML private Circle slot3;
    @FXML private Circle slot4;
    @FXML private Circle slot5;
    @FXML private Circle slot6;
    @FXML private Circle slot7;
    @FXML private Circle slot8;
    @FXML private Circle slot9;
    @FXML private Circle slot10;
    @FXML private Circle slot11;
    @FXML private Circle slot12;
    @FXML private Circle marble1;
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label label6;
    @FXML private Label label7;
    @FXML private Label label8;
    @FXML private Label label9;
    @FXML private Label label10;
    @FXML private Label label11;
    @FXML private Label label12;
    @FXML private Label mancala1;
    @FXML private Label mancala2;
    @FXML private Label currentplayerlabel;
    @FXML private Pane boardpane;
    @FXML private Label over;
    @FXML private Label turn;
    @FXML private Pane slotspane;
   
    int y= 0;
     Human player1 = new Human(1);
     Human player2 = new Human(2);
     AbstractPlayer b = new AbstractPlayer();
    
    @FXML
    private void handleMainMenuButtonAction(ActionEvent event) throws IOException{
    System.out.println("Final");
    
        Parent board_screen_parent = FXMLLoader.load(getClass().getResource("Final.fxml"));
        Scene board_screen_scene = new Scene(board_screen_parent);
        Stage board_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        board_screen_stage.setScene(board_screen_scene);
        board_screen_stage.show();
    }
    
    
     @FXML
    private void handleExitButtonAction(ActionEvent event) throws IOException{
    System.exit(0);
    }
    //set the currentplayer label when mouse enters board game pane
    
    @FXML
    private void setCurrentPlayerLabel(){
      if(b.currentTurn()==1)
          currentplayerlabel.setText("Player 1");
      else 
          currentplayerlabel.setText("Player 2");
   }
    
    //on hover action for player 1 row
    @FXML
    private void slot1hover(){
    if(b.currentTurn()==1)
       slot1.setOpacity(.30);
     
       
    }
    @FXML
    private void slot2hover(){
    if(b.currentTurn()==1)
       slot2.setOpacity(.30);
    }
    @FXML
    private void slot3hover(){
    if(b.currentTurn()==1)
       slot3.setOpacity(.30);
       
        
    }
    @FXML
    private void slot4hover(){
    if(b.currentTurn()==1)
       slot4.setOpacity(.30);
    }
    @FXML
    private void slot5hover(){
    if(b.currentTurn()==1)
       slot5.setOpacity(.30);
    }
    @FXML
    private void slot6hover(){
    if(b.currentTurn()==1)
       slot6.setOpacity(.30);
    }
    
    //ONCLICK FUNCTIONS FOR PLAYER 1
    @FXML
    private void slot1Click(){
    //if(b.currentTurn()==1)
       b.move(1);
       updateLabels();
      gameOver();
       
     }
    @FXML
    private void slot2Click(){
    if(b.currentTurn()==1)
       //CALL MOVE FUNCTION
       b.move(2);
       updateLabels();
       gameOver();
       
    }
    @FXML
    private void slot3Click(){
    if(b.currentTurn()==1)
       //CALLL MOVE FUNCTION
        b.move(3);
       updateLabels();
       gameOver();
    }
    @FXML
    private void slot4Click(){
    if(b.currentTurn()==1)
       //CALLL MOVE FUNCTION
        b.move(4);
       updateLabels();
       gameOver();
    }
    @FXML
    private void slot5Click(){
    if(b.currentTurn()==1)
       //CALLL MOVE FUNCTION
        b.move(5);
       updateLabels();
       gameOver();
    }
    @FXML
    private void slot6Click(){
    if(b.currentTurn()==1)
      //CALLL MOVE FUNCTION
        b.move(6);
       updateLabels();
       gameOver();
    
    }
    
    //ONMOUSE CLICK FOR PLAYER 2
    
    @FXML
    private void slot7Click(){
    if(b.currentTurn()==2)
      //CALLL MOVE FUNCTION
        b.move(8);
       updateLabels();
       gameOver();
    }
    
    @FXML
    private void slot8Click(){
    if(b.currentTurn()==2)
      //CALLL MOVE FUNCTION
        b.move(9);
       updateLabels();
      gameOver();
    }
    //when PLAYER CLICKS NEW GAME
    @FXML 
    private void newgameHandleButtonAction(){
    b.newGameset();
    updateLabels();
    mancala1.setOpacity(1);
   mancala2.setOpacity(1);
   slotspane.setOpacity(1);
   over.setOpacity(0);
   setCurrentPlayerLabel();
   turn.setText("Turn");
   
    }
    @FXML
    private void slot9Click(){
    if(b.currentTurn()==2)
      //CALLL MOVE FUNCTION
        b.move(10);
       updateLabels();
       gameOver();
    }
    
    @FXML
    private void slot10Click(){
    if(b.currentTurn()==2)
      //CALLL MOVE FUNCTION
        b.move(11);
       updateLabels();
       gameOver();
    }
    
    @FXML
    private void slot11Click(){
    if(b.currentTurn()==2)
      //CALLL MOVE FUNCTION
        b.move(12);
       updateLabels();
      gameOver();
    }
    
    @FXML
    private void slot12Click(){
    if(b.currentTurn()==2)
      //CALLL MOVE FUNCTION
        b.move(13);
       updateLabels();
       gameOver();
    }
    
   
    //reverts opacity for player 1 shapes after mouse exits
    @FXML
    private void slotrevert(){
    slot1.setOpacity(1);
    }
    @FXML
    private void slot2revert(){
    slot2.setOpacity(1);
    }@FXML
    private void slot3revert(){
    slot3.setOpacity(1);
    }@FXML
    private void slot4revert(){
    slot4.setOpacity(1);
    }
    @FXML
    private void slot5revert(){
    slot5.setOpacity(1);
    }
    @FXML
    private void slot6revert(){
    slot6.setOpacity(1);
    }
    
    
    //hover functions for player 2
    
    @FXML 
    private void slot7hover(){
    if(b.currentTurn()==2){
    slot7.setOpacity(.30);
    }
    //label1.setText("Hello");
  }
    
   @FXML
    private void slot8hover(){
    if(b.currentTurn()==2)
       slot8.setOpacity(.30);
    } 
    
   @FXML
    private void slot9hover(){
    if(b.currentTurn()==2)
       slot9.setOpacity(.30);
    }
      
   @FXML
    private void slot10hover(){
    if(b.currentTurn()==2)
       slot10.setOpacity(.30);
    }
    @FXML
    private void slot11hover(){
    if(b.currentTurn()==2)
       slot11.setOpacity(.30);
    }
    
    @FXML
    private void slot12hover(){
    if(b.currentTurn()==2)
       slot12.setOpacity(.30);
    }
    
    //revert opacity for player 2 row
    
    @FXML
    private void slot7revert(){
    slot7.setOpacity(1);
    }
    @FXML
    private void slot8revert(){
    slot8.setOpacity(1);
    }@FXML
    private void slot9revert(){
    slot9.setOpacity(1);
    }@FXML
    private void slot10revert(){
    slot10.setOpacity(1);
    }
    @FXML
    private void slot11revert(){
    slot11.setOpacity(1);
    }
    @FXML
    private void slot12revert(){
    slot12.setOpacity(1);
    
    }
    
   
      
   
    
   private void updateLabels(){
       
   mancala1.setText(String.valueOf(b.Boardslots[0]));
   label1.setText(String.valueOf(b.Boardslots[1]));
   label2.setText(String.valueOf(b.Boardslots[2]));
   label3.setText(String.valueOf(b.Boardslots[3]));
   label4.setText(String.valueOf(b.Boardslots[4]));
   label5.setText(String.valueOf(b.Boardslots[5]));
   label6.setText(String.valueOf(b.Boardslots[6]));
   mancala2.setText(String.valueOf(b.Boardslots[7]));
   label7.setText(String.valueOf(b.Boardslots[8]));
   label8.setText(String.valueOf(b.Boardslots[9]));
   label9.setText(String.valueOf(b.Boardslots[10]));
   label10.setText(String.valueOf(b.Boardslots[11]));
   label11.setText(String.valueOf(b.Boardslots[12]));
   label12.setText(String.valueOf(b.Boardslots[13]));
   setCurrentPlayerLabel();
   
   
   }
   
   private void gameOver(){
   boolean wins = b.wins();
   if(wins==true){
   mancala1.setOpacity(0.50);
   mancala2.setOpacity(.50);
   slotspane.setOpacity(.50);
   over.setOpacity(1);
   //who won the game 
   int winner = 0;
   turn.setText("Winner = ");
   if(Boardslots[0]>Boardslots[7])
       currentplayerlabel.setText("Player 2");
   else
       currentplayerlabel.setText("Player1");
       
   
       
   }
   }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
  
   
   
  
  
        
        
    }   
    
    
}
