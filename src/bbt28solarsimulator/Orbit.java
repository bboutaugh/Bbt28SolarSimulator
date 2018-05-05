/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
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

    public double getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(double timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }
    private double timeInSeconds = 0.001;
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
    
    public void setMercury(Mercury mercury)
    {
        this.mercury = mercury;
    }
    public void setVenus(Venus venus)
    {
        this.venus = venus;
    }
    public void setEarth(Earth earth)
    {
        this.earth = earth;
    }
    public void setMars(Mars mars) {
        this.mars = mars;
    }
    public void setJupiter(Jupiter jupiter)
    {
        this.jupiter = jupiter;
    }
    public void setSaturn(Saturn saturn)
    {
        this.saturn = saturn;
    }
    public void setUranus(Uranus uranus)
    {
        this.uranus = uranus;
    }
    public void setNeptune(Neptune neptune)
    {
        this.neptune = neptune;
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
    mercury.getPlanetXCoord(secondsElapsed, planetXPosition);
    mercury.getPlanetYCoord(secondsElapsed, planetYPosition);
    venus.getPlanetXCoord(secondsElapsed, planetXPosition);
    venus.getPlanetYCoord(secondsElapsed, planetYPosition);
    earth.getPlanetXCoord(secondsElapsed, planetXPosition);
    earth.getPlanetYCoord(secondsElapsed, planetYPosition);
    mars.getPlanetXCoord(secondsElapsed, planetXPosition);
    mars.getPlanetYCoord(secondsElapsed, planetYPosition);
    jupiter.getPlanetXCoord(secondsElapsed, planetXPosition);
    jupiter.getPlanetYCoord(secondsElapsed, planetYPosition);
    saturn.getPlanetXCoord(secondsElapsed, planetXPosition);
    saturn.getPlanetYCoord(secondsElapsed, planetYPosition);
    uranus.getPlanetXCoord(secondsElapsed, planetXPosition);
    uranus.getPlanetYCoord(secondsElapsed, planetYPosition);
    neptune.getPlanetXCoord(secondsElapsed, planetXPosition);
    neptune.getPlanetYCoord(secondsElapsed, planetYPosition);

    }
    
   public void setupOrbitTime()
{
       orbitalKeyFrame = new KeyFrame(Duration.millis(timeInSeconds * 1000), (ActionEvent event) -> {
            updateOrbit();
            
        });
        orbitalTimeline = new Timeline(orbitalKeyFrame);
        orbitalTimeline.setCycleCount(Animation.INDEFINITE);  
}
    
}
