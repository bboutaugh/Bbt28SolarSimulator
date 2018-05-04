/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Brad
 */
public class FXMLDocumentController extends ChangeScene implements Initializable, PropertyChangeListener
{
    
  

//Buttons
@FXML
Button goButton;
@FXML
Button stopButton;
@FXML
Button saveButton;

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
@FXML
Label xPositionDisplay;
@FXML
Label yPositionDisplay;

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
Menu menuOrbitalSpeed;
@FXML 
Menu menuAbout;

//Menu Items
@FXML
MenuItem goMenuItem;
@FXML
MenuItem stopMenuItem;
@FXML
MenuItem saveMenuItem;
@FXML
MenuItem loadMenuItem;
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


private Stage stage;


Orbit orbit;
Mercury mercury;
Venus venus;
Earth earth;
Mars mars;
Jupiter jupiter;
Saturn saturn;
Uranus uranus;
Neptune neptune;

double mercuryXCoordinate;
double mercuryYCoordinate;
double venusXCoordinate;
double venusYCoordinate;
double earthXCoordinate;
double earthYCoordinate;
double marsXCoordinate;
double marsYCoordinate;
double jupiterXCoordinate;
double jupiterYCoordinate;
double saturnXCoordinate;
double saturnYCoordinate;
double uranusXCoordinate;
double uranusYCoordinate;
double neptuneXCoordinate;
double neptuneYCoordinate;

    public FXMLDocumentController() {
        
    }

OrbitalPositions orbitalPositions;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    { 
        orbit = new Orbit();
        orbit.addPropertyChangeListener(this);
        orbit.setupOrbitTime();
        //orbit.updateOrbit(); 
        mercury = new Mercury(orbit);
        mercury.addPropertyChangeListener(this);
        venus = new Venus(orbit);
        venus.addPropertyChangeListener(this);
        earth = new Earth(orbit);
        earth.addPropertyChangeListener(this);
        mars = new Mars(orbit);
        mars.addPropertyChangeListener(this);
        jupiter = new Jupiter(orbit);
        jupiter.addPropertyChangeListener(this);
        saturn = new Saturn(orbit);
        saturn.addPropertyChangeListener(this);
        uranus = new Uranus(orbit);
        uranus.addPropertyChangeListener(this);
        neptune = new Neptune(orbit);
        neptune.addPropertyChangeListener(this);
        orbitalPositions = new OrbitalPositions();
        
        orbit.setMars(mars);
        orbit.setEarth(earth);
        orbit.setMercury(mercury);
        orbit.setVenus(venus);
        orbit.setJupiter(jupiter);
        orbit.setSaturn(saturn);
        orbit.setUranus(uranus);
        orbit.setNeptune(neptune);
    }
    
    private void start(Stage stage)
    {
        
        this.stage = stage;
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
     
     
       //Get Mars X and Y Coordinates
       if(evt.getPropertyName().equals("marsXCoord"))
       {
           marsXCoordinate = (Double)evt.getNewValue();
           marsCircle.setCenterX(marsXCoordinate);
       }
       if(evt.getPropertyName().equals("marsYCoord"))
       {
           marsYCoordinate = (Double)evt.getNewValue();
           marsCircle.setCenterY(marsYCoordinate);
       }
       
       //Get Mercury X and Y Coordinates
        if(evt.getPropertyName().equals("mercuryXCoord"))
       {
           mercuryXCoordinate = (Double)evt.getNewValue();
           mercuryCircle.setCenterX(mercuryXCoordinate);
           xPositionDisplay.setText(Double.toString(mercuryXCoordinate));
       }
       if(evt.getPropertyName().equals("mercuryYCoord"))
       {
           mercuryYCoordinate = (Double)evt.getNewValue();
           mercuryCircle.setCenterY(mercuryYCoordinate);
           yPositionDisplay.setText(Double.toString(mercuryYCoordinate));
       }
       
       //Get Venus X and Y Coordinates
        if(evt.getPropertyName().equals("venusXCoord"))
       {
           venusXCoordinate = (Double)evt.getNewValue();
           venusCircle.setCenterX(venusXCoordinate);
       }
       if(evt.getPropertyName().equals("venusYCoord"))
       {
           venusYCoordinate = (Double)evt.getNewValue();
           venusCircle.setCenterY(venusYCoordinate);
       }
       
       //Get Earth X and Y Coordinates
        if(evt.getPropertyName().equals("earthXCoord"))
       {
           earthXCoordinate = (Double)evt.getNewValue();
           earthCircle.setCenterX(earthXCoordinate);
       }
       if(evt.getPropertyName().equals("earthYCoord"))
       {
           earthYCoordinate = (Double)evt.getNewValue();
           earthCircle.setCenterY(earthYCoordinate);
       }
       
       //Get Jupiter X and Y Coordinates
        if(evt.getPropertyName().equals("jupiterXCoord"))
       {
           jupiterXCoordinate = (Double)evt.getNewValue();
           jupiterCircle.setCenterX(jupiterXCoordinate);
       }
       if(evt.getPropertyName().equals("jupiterYCoord"))
       {
           jupiterYCoordinate = (Double)evt.getNewValue();
           jupiterCircle.setCenterY(jupiterYCoordinate);
       }
       
       //Get Saturn X and Y Coordinates
        if(evt.getPropertyName().equals("saturnXCoord"))
       {
           saturnXCoordinate = (Double)evt.getNewValue();
           saturnCircle.setCenterX(saturnXCoordinate);
       }
       if(evt.getPropertyName().equals("saturnYCoord"))
       {
           saturnYCoordinate = (Double)evt.getNewValue();
           saturnCircle.setCenterY(saturnYCoordinate);
       }
       
       //Get Uranus X and Y Coordinates
        if(evt.getPropertyName().equals("uranusXCoord"))
       {
           uranusXCoordinate = (Double)evt.getNewValue();
           uranusCircle.setCenterX(uranusXCoordinate);
       }
       if(evt.getPropertyName().equals("uranusYCoord"))
       {
           uranusYCoordinate = (Double)evt.getNewValue();
           uranusCircle.setCenterY(uranusYCoordinate);
       }
       
       //Get Neptune X and Y Coordinates
        if(evt.getPropertyName().equals("neptuneXCoord"))
       {
           neptuneXCoordinate = (Double)evt.getNewValue();
           neptuneCircle.setCenterX(neptuneXCoordinate);
       }
       if(evt.getPropertyName().equals("neptuneYCoord"))
       {
           neptuneYCoordinate = (Double)evt.getNewValue();
           neptuneCircle.setCenterY(neptuneYCoordinate);
       }
       
    }//End Property Change Method


//Button Actions
 @FXML
 public void goAction(ActionEvent event)
 {
    
     orbit.orbitalTimeline.play();
   
  
 }

 @FXML
 public void stopAction(ActionEvent event)
 {
     orbit.orbitalTimeline.stop();
 }
 
 
@FXML
public void closeAction(Event event)
 {
        System.exit(0);
 }
   
@FXML
private void goToAbout(ActionEvent event) 
{
    ChangeScene.switchTo("About");     
}

@FXML
private void goToReferences(ActionEvent event) 
{
    ChangeScene.switchTo("References");     
}

 @FXML
 public void onClickMercuryAction(ActionEvent event)
 {
     mercury.getPlanetData();
     
         for(int i = 0;i<planetArray.length;i++)
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
         for(int i = 0;i<planetArray.length;i++)
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
     
         for(int i = 0;i<planetArray.length;i++)
     {
         earthArray[i] = planetArray[i];
     }
         
  orbitalPeriodValueDisplay.setText(earthArray[0]);
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
     
         for(int i = 0;i<planetArray.length;i++)
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
     
         for(int i = 0;i<planetArray.length;i++)
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
 
     for(int i = 0;i<planetArray.length;i++)
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
     
         for(int i = 0;i<planetArray.length;i++)
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
     
         for(int i = 0;i<planetArray.length;i++)
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
    orbit.setTimeInSeconds(orbit.getTimeInSeconds()*0.5);
}

@FXML 
public void onClickRegularSpeedAction()
{
    orbit.setTimeInSeconds(0.001);
}

@FXML
public void onClickDoubleSpeedAction()
{
    orbit.setTimeInSeconds(orbit.getTimeInSeconds()*2);
}

@FXML
public void onClickFiveTimeSpeedAction()
{
    orbit.setTimeInSeconds(orbit.getTimeInSeconds()*5);
}

//Save and Open Methods
  @FXML
    public void saveAction(ActionEvent event) 
    {
        orbitalPositions = saveCoordinates();
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            try 
            {
                FileOutputStream fileOut = new FileOutputStream(file.getPath());
                ObjectOutputStream out = new ObjectOutputStream(fileOut); 
                
                out.writeObject(orbitalPositions);//file class
                out.close(); 
                fileOut.close(); 
                
            } 
            catch (FileNotFoundException ex) {
                String message = "File not found exception occured while saving to " + file.getPath(); 
                
            } 
            catch (IOException ex) {
                String message = "IOException occured while saving to " + file.getPath();
                
            }
        }        
    }

    @FXML
    public void loadAction(ActionEvent event) 
    {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            FileInputStream fileIn; 
            try {
                fileIn = new FileInputStream(file.getPath());
                ObjectInputStream in = new ObjectInputStream(fileIn); 
                
                orbitalPositions = (OrbitalPositions) in.readObject();
                
                in.close(); 
                fileIn.close(); 
                updateCoordinates(orbitalPositions); 
                
            } 
            catch (FileNotFoundException ex) 
            {
                String message = "File not found exception occured while opening " + file.getPath();    
            } 
            catch (IOException ex)
            {
                String message = "IO exception occured while opening " + file.getPath(); 
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//End Load Action Method
    
    private OrbitalPositions saveCoordinates()
    {
        OrbitalPositions orbitalPositions = new OrbitalPositions();
        orbitalPositions.setMercuryXCoordinate(mercuryXCoordinate);
        orbitalPositions.setMercuryYCoordinate(mercuryYCoordinate);
        return orbitalPositions;
    }

   
    private void updateCoordinates(OrbitalPositions orbitalPositions)
    {
        mercuryXCoordinate = orbitalPositions.getMercuryXCoordinate();
        mercuryYCoordinate = orbitalPositions.getMercuryYCoordinate();
    }
}//End Controller Class
