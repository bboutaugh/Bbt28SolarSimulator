/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Brad
 */
public class ReferencesController extends ChangeScene implements Initializable 
{

    /**
     * Initializes the controller class.
     */
    @FXML
    AnchorPane referencesAnchorPane;
    @FXML
    ScrollPane referencesScrollPane;
    @FXML
    Button backButton;
    @FXML
    TextArea textArea;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goBack(ActionEvent event) {
        ChangeScene.switchTo("FXMLDocument"); 
    }
}
