/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author angeladon
 */
public class FinalController implements Initializable {

    /**
     * Initializes the controller class.
     */
       
    @FXML
    private void handleSingleButtonAction(ActionEvent event)throws IOException{
        System.out.println("single player");
        Parent board_screen_parent = FXMLLoader.load(getClass().getResource("Board1.fxml"));
        Scene board_screen_scene = new Scene(board_screen_parent);
        Stage board_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        board_screen_stage.setScene(board_screen_scene);
        board_screen_stage.show();
        
    
    }
    

    
    @FXML
    private void handleHelpButtonAction(ActionEvent event) throws IOException{
    System.out.println("Help");
    System.out.println("single player");
        Parent board_screen_parent = FXMLLoader.load(getClass().getResource("helppage.fxml"));
        Scene board_screen_scene = new Scene(board_screen_parent);
        Stage board_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        board_screen_stage.setScene(board_screen_scene);
        board_screen_stage.show();
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
}
