/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Brad
 */

//E = eccentric anamoly
//e = eccentricity
//a = semi-major axis along x-axis
//b = semi-major axis along y-axis
//
public class Earth extends AbstractModel implements Planet 
{
    Orbit orbit;
    Earth(Orbit orbit)
    {
        this.orbit = orbit;
    }
    
private double xCoordinate;
private double yCoordinate;

private double semiMajorAxis;
private double orbitalDuration;

private double d_YOldValue = 0;
private double d_XOldValue = 0;

private String orbitalPeriod =  "365 Earth days";
private String orbitalVelocity =  "107,218 km/h";
private String mass = "5.97*10^24 kg";
private String volume = "1.08*10^12 km^3";
private String meanRadius =  "6,371 km";
private String  surfaceGravity = "9.81 m/s^2";
private String escapeVelocity = "40,284 km/h";
private String numberOfSatellites = "1";
private String planetDescription = "Third planet from the sun. Aside from being the only "
        + "known body in the Solar System to currently support life, Earth is also"
        + " one of only two bodies,the other being the moon Titan, to support stable "
        + "bodies of surface liquid. All of this made possible with the assistance"
        + " of a strong magnetosphere and nitrogen-oxygen atmosphere shielding "
        + "the planet.";
        
    
    @Override
    public void getPlanetData()
    {
      
       String oldValue = ""; 
       firePropertyChange("orbitalPeriod",oldValue,orbitalPeriod);
       firePropertyChange("orbitalVelocity",oldValue,orbitalVelocity);
       firePropertyChange("mass",oldValue,mass);
       firePropertyChange("volume",oldValue,volume);
       firePropertyChange("meanRadius",oldValue,meanRadius);
       firePropertyChange("surfaceGravity",oldValue,surfaceGravity);
       firePropertyChange("escapeVelocity",oldValue,escapeVelocity);
       firePropertyChange("numberOfSatellites",oldValue,numberOfSatellites);
       firePropertyChange("planetDescription",oldValue,planetDescription);
        
    }

    @Override
    public void getPlanetXCoord(double time,double xCoord) 
    {
        
        d_XOldValue = xCoord;
        semiMajorAxis = 75;
        orbitalDuration = 365.0;
        xCoord = semiMajorAxis*(Math.cos((time*50)/orbitalDuration));
        firePropertyChange("earthXCoord",d_XOldValue,xCoord);
        orbit.setPlanetXPosition(xCoord);
    }
    @Override
        public void getPlanetYCoord(double time, double yCoord) 
    {
        d_YOldValue = yCoord;
        semiMajorAxis = 75;
        orbitalDuration = 365.0;
        yCoord = semiMajorAxis*(Math.sin((time*50)/orbitalDuration));
        firePropertyChange("earthYCoord",d_YOldValue,yCoord);
        orbit.setPlanetYPosition(yCoord);
    }
   
}

/*
       semiMajorAxis = 149.6;
        orbitalDuration = 365.0;
Orbital Period: 365 Earth days
Mean Orbital Velocity: 107,218 km/h
Mass: 5.97*10^24 kg
Volume: 1.08*10^12 km^3
Equatorial Radius: 6,371 km
Surface Gravity: 9.81 m/s^2
Escape Velocity: 40,284 km/h
Number of Satellites: 1
Planet Description: Third planet from the sun. Aside from being the only known 
body in the Solar System currently supporting life, Earth is also one of only two bodies
(the other being the moon Titan) to support stable bodies of surface liquid. All of this
made possible with the assistance of a strong nitrogen-oxygen atmosphere shielding the planet.
*/