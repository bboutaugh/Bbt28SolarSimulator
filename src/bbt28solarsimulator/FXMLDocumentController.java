/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 *
 * @author Brad
 */
public class FXMLDocumentController implements Initializable {

//Buttons
@FXML
Button goButton;
@FXML
Button stopButton;
@FXML
Button resetButton;

//Containers
@FXML 
AnchorPane rootPane;
@FXML
GridPane gridPane;
@FXML
HBox buttonsHBox;
@FXML
VBox infoVBox;
@FXML
StackPane sunStackPane;
@FXML
StackPane mercuryStackPane;
@FXML
StackPane venusStackPane;
@FXML
StackPane earthPane;
@FXML
StackPane marsStackPane;
@FXML
StackPane jupiterStackPane;
@FXML
StackPane saturnStackPane;
@FXML
StackPane uranusStackPane;
@FXML
StackPane neptuneStackPane;

//Other UI Elements
MediaView mediaView;

//Display UI Elements
@FXML
Label orbitalPeriodValueDisplay;
@FXML
Label orbitalSpeedValueDisplay;
@FXML
Label massValueDisplay;
@FXML
Label volumeValueDisplay;
@FXML
Label meanRadiusValueDisplay;
@FXML
Label surfaceGravityValueDisplay;
@FXML
Label escapeVelocityValueDisplay;
@FXML
Label satelliteNumberValueDisplay;
@FXML
TextArea planetDescriptionDisplay;

//Menu Bar UI Elements
@FXML
MenuBar menuBar;
@FXML
Menu menuFile;
@FXML
Menu menuPlanets;
@FXML
Menu menuView;
@FXML
Menu menuOrbitalSpeed;
@FXML 
Menu menuAbout;
//Menu Items
@FXML
MenuItem goMenuItem;
@FXML
MenuItem stopMenuItem;
@FXML
MenuItem resetMenuItem;
@FXML
MenuItem closeMenuItem;
@FXML
MenuItem mercuryMenuItem;
@FXML
MenuItem venusMenuItem;
@FXML
MenuItem earthMenuItem;
@FXML
MenuItem marsMenuItem;
@FXML
MenuItem jupiterMenuItem;
@FXML
MenuItem saturnMenuItem;
@FXML
MenuItem uranusMenuItem;
@FXML
MenuItem neptuneMenuItem;
@FXML
MenuItem topDownViewMenuItem;
@FXML
MenuItem isometricViewMenuItem;
@FXML
MenuItem applicationInfoMenuItem;
@FXML
MenuItem referencesMenuItem;
@FXML
MenuItem halfSpeedMenuItem;
@FXML
MenuItem regularSpeedMenuItem;
@FXML
MenuItem doubleSpeedMenuItem;
@FXML
MenuItem fiveTimesSpeedMenuItem;

private Media media;
private MediaPlayer mediaPlayer;


//Button Actions
 @FXML
 private void goAction(ActionEvent event)
 {
     if(mediaPlayer != null)
     {
         mediaPlayer.play();
     }
 }
 
 @FXML
 private void stopAction(ActionEvent event)
 {
     if(mediaPlayer != null)
     {
         mediaPlayer.pause();
     }
 }
 
 @FXML
 private void resetAction(ActionEvent event)
 {
     if(mediaPlayer != null)
     {
         mediaPlayer.stop();
     }
 }
 
@FXML
private void closeAction(Event event)
 {
        System.exit(0);
 }
  
private void endOfMediaAction() 
{
        mediaPlayer.stop();
        mediaPlayer.seek(Duration.ZERO);
        
}
    
@FXML
private void updateAction(double timestamp, double duration, float[] magnitudes, float[] phases) 
   {
        Duration ct = mediaPlayer.getCurrentTime();
        double ms = ct.toMillis();
   }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
