/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

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
public class Orbit {
    
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
    
    
    public void startOrbit()//Creates the Planet and sets its initial position
    {
        
    }
            
    public void updateOrbit()//Enacts Planet motion around orbit
    {
        secondsElapsed += timeInSeconds;
        System.out.println("count");
        
    }
    public void endOrbit()
    {
        
    }
    
    public void setupAnalogTime()
{
       orbitalKeyFrame = new KeyFrame(Duration.millis(timeInSeconds * 1000), (ActionEvent event) -> {
            updateOrbit();
        });
        orbitalTimeline = new Timeline(orbitalKeyFrame);
        orbitalTimeline.setCycleCount(Animation.INDEFINITE);  
}
}
