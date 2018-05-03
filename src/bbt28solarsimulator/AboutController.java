/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Brad
 */
public class AboutController extends ChangeScene implements Initializable 
{

    /**
     * Initializes the controller class.
     */
    @FXML
    AnchorPane aboutAnchorPane;
    
    @FXML
    ScrollPane aboutPane;
    
    @FXML
    Button backButton;
    
    @FXML
    Label aboutLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
       
    @FXML
    private void goBack(ActionEvent event) {
        ChangeScene.switchTo("FXMLDocument"); 
    }
}
