/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author Brad
 */
public class FXMLDocumentController extends ChangeScene implements Initializable, PropertyChangeListener
{
    
    String orbitVelocity = "Not the value you are looking for";

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
Pane solarPane;

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

String mercuryArray[] = new String[9];
String venusArray[] = new String[9];
String earthArray[] = new String[9];
String marsArray[] = new String [9];
String jupiterArray[] = new String[9];
String saturnArray[] = new String[9];
String uranusArray[] = new String[9];
String neptuneArray[] = new String[9];
String planetArray[] = new String[9];


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

//Shapes
@FXML
Circle sunCircle;
@FXML
Circle mercuryCircle;
@FXML
Circle venusCircle;
@FXML
Circle earthCircle;
@FXML
Circle marsCircle;
@FXML
Circle jupiterCircle;
@FXML
Circle saturnCircle;
@FXML
Circle uranusCircle;
@FXML
Circle neptuneCircle;

private Media media;
private MediaPlayer mediaPlayer;

Orbit orbit;
Mercury mercury;
Venus venus;
Earth earth;
Mars mars;
Jupiter jupiter;
Saturn saturn;
Uranus uranus;
Neptune neptune;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    { 
        orbit = new Orbit();
        orbit.addPropertyChangeListener(this);
        orbit.setupOrbitTime();
        orbit.updateOrbit(); 
        mercury = new Mercury();
        mercury.addPropertyChangeListener(this);
        venus = new Venus();
        venus.addPropertyChangeListener(this);
        earth = new Earth();
        earth.addPropertyChangeListener(this);
        mars = new Mars();
        mars.addPropertyChangeListener(this);
        jupiter = new Jupiter();
        jupiter.addPropertyChangeListener(this);
        saturn = new Saturn();
        saturn.addPropertyChangeListener(this);
        uranus = new Uranus();
        uranus.addPropertyChangeListener(this);
        neptune = new Neptune();
        neptune.addPropertyChangeListener(this);
         
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
       
            
        if(evt.getPropertyName().equals("orbitalPeriod"))
        {
        planetArray[0]= (String)evt.getNewValue();  
        }
        if(evt.getPropertyName().equals("orbitalVelocity"))
        {
        planetArray[1]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("mass"))
        {
        planetArray[2]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("volume"))
        {
        planetArray[3]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("meanRadius"))
        {
        planetArray[4]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("surfaceGravity"))
        {
        planetArray[5]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("escapeVelocity"))
        {
        planetArray[6]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("numberOfSatellites"))
        {
        planetArray[7]  = (String)evt.getNewValue();
        }
        if(evt.getPropertyName().equals("planetDescription"))
        {
        planetArray[8]  = (String)evt.getNewValue();
        }
        
    }
    
    /*for(int i = 0;i<planetArray.length-1;i++)
    {
        mercuryArray[i] = planetArray[i];
        venusArray[i] = planetArray[i];
        earthArray[i] = planetArray[i];
        marsArray[i] = planetArray[i];
        jupiterArray[i] = planetArray[i];
        saturnArray[i] = planetArray[i];
        uranusArray[i] = planetArray[i];
        neptuneArray[i] = planetArray[i];
    }*/

//Button Actions
 @FXML
 public void goAction(ActionEvent event)
 {
    /* if(mediaPlayer != null)
     {
         mediaPlayer.play();
     }
     orbit.orbitalTimeline.play();*/
   //orbitalSpeedValueDisplay.setText((String)evt.getNewValue());
    orbitalSpeedValueDisplay.setText(orbitVelocity);
     
   //set label text to new global \variable
 }
 //use to change a global variable


 
 @FXML
 public void stopAction(ActionEvent event)
 {
     if(mediaPlayer != null)
     {
         mediaPlayer.pause();
     }
     orbit.orbitalTimeline.stop();
 }
 
 @FXML
 public void resetAction(ActionEvent event)
 {
     if(mediaPlayer != null)
     {
         mediaPlayer.stop();
     }
 }
 
@FXML
public void closeAction(Event event)
 {
        System.exit(0);
 }
  
public void endOfMediaAction() 
{
        mediaPlayer.stop();
        mediaPlayer.seek(Duration.ZERO);
        
}

   
@FXML
private void goToAbout(ActionEvent event) 
{
        ChangeScene.switchTo("AboutController"); 
}
    
@FXML
public void updateAction() 
   {
       
   }

@FXML
public void onClickMercuryAction(ActionEvent event)
{
    mercury.getPlanetData();
    
        for(int i = 0;i<planetArray.length-1;i++)
    {
        mercuryArray[i] = planetArray[i];
    }
        
orbitalPeriodValueDisplay.setText(mercuryArray[0]);
orbitalSpeedValueDisplay.setText(mercuryArray[1]);
massValueDisplay.setText(mercuryArray[2]);
volumeValueDisplay.setText(mercuryArray[3]);
meanRadiusValueDisplay.setText(mercuryArray[4]);
surfaceGravityValueDisplay.setText(mercuryArray[5]);
escapeVelocityValueDisplay.setText(mercuryArray[6]);
satelliteNumberValueDisplay.setText(mercuryArray[7]);
planetDescriptionDisplay.setText(mercuryArray[8]);

}

@FXML
public void onClickVenusAction()
{
    venus.getPlanetData();
        for(int i = 0;i<planetArray.length-1;i++)
    {
        venusArray[i] = planetArray[i];
    }
   orbitalPeriodValueDisplay.setText(venusArray[0]);
orbitalSpeedValueDisplay.setText(venusArray[1]);
massValueDisplay.setText(venusArray[2]);
volumeValueDisplay.setText(venusArray[3]);
meanRadiusValueDisplay.setText(venusArray[4]);
surfaceGravityValueDisplay.setText(venusArray[5]);
escapeVelocityValueDisplay.setText(venusArray[6]);
satelliteNumberValueDisplay.setText(venusArray[7]);
planetDescriptionDisplay.setText(venusArray[8]); 
}

@FXML
public void onClickEarthAction()
{
    earth.getPlanetData();
    
        for(int i = 0;i<planetArray.length-1;i++)
    {
        earthArray[i] = planetArray[i];
    }
        
    orbitalPeriodValueDisplay.setText(earthArray[0]);
orbitalSpeedValueDisplay.setText(earthArray[1]);
massValueDisplay.setText(earthArray[2]);
volumeValueDisplay.setText(earthArray[3]);
meanRadiusValueDisplay.setText(earthArray[4]);
surfaceGravityValueDisplay.setText(earthArray[5]);
escapeVelocityValueDisplay.setText(earthArray[6]);
satelliteNumberValueDisplay.setText(earthArray[7]);
planetDescriptionDisplay.setText(earthArray[8]); 
}                                                                     

@FXML
public void onClickMarsAction()
{
    mars.getPlanetData();
    
        for(int i = 0;i<planetArray.length-1;i++)
    {
        marsArray[i] = planetArray[i];
    }
        
orbitalPeriodValueDisplay.setText(marsArray[0]);
orbitalSpeedValueDisplay.setText(marsArray[1]);
massValueDisplay.setText(marsArray[2]);
volumeValueDisplay.setText(marsArray[3]);
meanRadiusValueDisplay.setText(marsArray[4]);
surfaceGravityValueDisplay.setText(marsArray[5]);
escapeVelocityValueDisplay.setText(marsArray[6]);
satelliteNumberValueDisplay.setText(marsArray[7]);
planetDescriptionDisplay.setText(marsArray[8]);   
}

@FXML
public void onClickJupiterAction()
{
    jupiter.getPlanetData();
    
        for(int i = 0;i<planetArray.length-1;i++)
    {
        jupiterArray[i] = planetArray[i];
    }
        
orbitalPeriodValueDisplay.setText(jupiterArray[0]);
orbitalSpeedValueDisplay.setText(jupiterArray[1]);
massValueDisplay.setText(jupiterArray[2]);
volumeValueDisplay.setText(jupiterArray[3]);
meanRadiusValueDisplay.setText(jupiterArray[4]);
surfaceGravityValueDisplay.setText(jupiterArray[5]);
escapeVelocityValueDisplay.setText(jupiterArray[6]);
satelliteNumberValueDisplay.setText(jupiterArray[7]);
planetDescriptionDisplay.setText(jupiterArray[8]);      
}

@FXML
public void onClickSaturnAction()
{
saturn.getPlanetData();

    for(int i = 0;i<planetArray.length-1;i++)
    {
        saturnArray[i] = planetArray[i];
    }
    
orbitalPeriodValueDisplay.setText(saturnArray[0]);
orbitalSpeedValueDisplay.setText(saturnArray[1]);
massValueDisplay.setText(saturnArray[2]);
volumeValueDisplay.setText(saturnArray[3]);
meanRadiusValueDisplay.setText(saturnArray[4]);
surfaceGravityValueDisplay.setText(saturnArray[5]);
escapeVelocityValueDisplay.setText(saturnArray[6]);
satelliteNumberValueDisplay.setText(saturnArray[7]);
planetDescriptionDisplay.setText(saturnArray[8]);      
}

@FXML
public void onClickUranusAction()
{
    uranus.getPlanetData();
    
        for(int i = 0;i<planetArray.length-1;i++)
    {
        uranusArray[i] = planetArray[i];
    }
        
orbitalPeriodValueDisplay.setText(uranusArray[0]);
orbitalSpeedValueDisplay.setText(uranusArray[1]);
massValueDisplay.setText(uranusArray[2]);
volumeValueDisplay.setText(uranusArray[3]);
meanRadiusValueDisplay.setText(uranusArray[4]);
surfaceGravityValueDisplay.setText(uranusArray[5]);
escapeVelocityValueDisplay.setText(uranusArray[6]);
satelliteNumberValueDisplay.setText(uranusArray[7]);
planetDescriptionDisplay.setText(uranusArray[8]); 
}

@FXML
public void onClickNeptuneAction()
{
    neptune.getPlanetData();
    
        for(int i = 0;i<planetArray.length-1;i++)
    {
        neptuneArray[i] = planetArray[i];
    }
        
orbitalPeriodValueDisplay.setText(neptuneArray[0]);
orbitalSpeedValueDisplay.setText(neptuneArray[1]);
massValueDisplay.setText(neptuneArray[2]);
volumeValueDisplay.setText(neptuneArray[3]);
meanRadiusValueDisplay.setText(neptuneArray[4]);
surfaceGravityValueDisplay.setText(neptuneArray[5]);
escapeVelocityValueDisplay.setText(neptuneArray[6]);
satelliteNumberValueDisplay.setText(neptuneArray[7]);
planetDescriptionDisplay.setText(neptuneArray[8]); 
}

@FXML
public void onClickHalfSpeedAction()
{
    
}

@FXML 
public void onClickRegularSpeedAction()
{
    
}

@FXML
public void onClickDoubleSpeedAction()
{
    
}

@FXML
public void onClickFiveTimeSpeedAction()
{
    
}
    

   
    
}
