/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author Brad
 */
public class Orbit extends AbstractModel 
{

    
//x = a(cosE - e)
//y = bsinE 

//E = eccentric anamoly
//e = eccentricity
//a = semi-major axis along x-axis
//b = semi-major axis along y-axis
//
    
    private double secondsElapsed = 0.0;
    private double timeInSeconds = 0.001;
    private boolean orbitIsRunning = false;
    public Timeline orbitalTimeline;
    public KeyFrame orbitalKeyFrame;
    private double planetXPosition;
    private double planetYPosition;
    private String value;
    
    
    public void startOrbit()//Creates the Planet and sets its initial position
    {
        
    }
            
    public void updateOrbit()//Enacts Planet motion around orbit
    {
       String oldValue = value;
       value = "1000";
       firePropertyChange("orbitVelocity",oldValue,value);
        secondsElapsed += timeInSeconds;
        System.out.println("count");
        
        
    }
    public void endOrbit()
    {
        
    }
    
    public void setupOrbitTime()
{
       orbitalKeyFrame = new KeyFrame(Duration.millis(timeInSeconds * 1000), (ActionEvent event) -> {
            updateOrbit();
        });
        orbitalTimeline = new Timeline(orbitalKeyFrame);
        orbitalTimeline.setCycleCount(Animation.INDEFINITE);  
}
    
    public boolean isOrbitRunning()
    {
        return orbitIsRunning;
    }
    
    public void setOrbitRunning(boolean orbitIsRunning)
    {
        this.orbitIsRunning = orbitIsRunning;
    }
    
}
