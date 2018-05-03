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
/*
x = acos((2pi(t - t_0)/T)
y = asin((2pi(t - t_0)/T)
*/    
    private double secondsElapsed = 0.0;
    private double timeInSeconds = 0.001;
    private boolean orbitIsRunning = false;
    public Timeline orbitalTimeline;
    public KeyFrame orbitalKeyFrame;
    private double planetXPosition = 0.0;
    private double planetYPosition = 0.0;
 
    Mercury mercury;
    Venus venus;
    Earth earth;
    Mars mars;
    Jupiter jupiter;
    Saturn saturn;
    Uranus uranus;
    Neptune neptune;
    
    public void setMars(Mars mars) {
        this.mars = mars;
    }
  
           
    
    public void startOrbit()//Creates the Planet and sets its initial position
    {
        
    }
        
public void setPlanetYPosition(double planetYPosition)
{
   this.planetYPosition = planetYPosition;
}
public void setPlanetXPosition(double planetXPosition)
{
   this.planetXPosition = planetXPosition;
}
    public void updateOrbit()//Enacts Planet motion around orbit
    {
    secondsElapsed += timeInSeconds;    
    mars.getPlanetXCoord(secondsElapsed, planetXPosition);
    mars.getPlanetYCoord(secondsElapsed, planetYPosition);

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
