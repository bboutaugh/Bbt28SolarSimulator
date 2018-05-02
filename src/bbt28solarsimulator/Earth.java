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
//x = a(cosE - e)
//y = bsinE 

//E = eccentric anamoly
//e = eccentricity
//a = semi-major axis along x-axis
//b = semi-major axis along y-axis
//
public class Earth extends AbstractModel implements Planet 
{
    public void Earth()
    {
    }
private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

double eccentricAnamoly;
double eccentricity;
double xAxis;
double yAxis;
double xCoordinate;
double yCoordinate;

String orbitalPeriod =  "365 Earth days";
String orbitalVelocity =  "107,218 km/h";
String mass = "5.97*10^24 kg";
String volume = "1.08*10^12 km^3";
String meanRadius =  "6,371 km";
String surfaceGravity = "9.81 m/s^2";
String escapeVelocity = "40,284 km/h";
String numberOfSatellites = "1";
String planetDescription = "Third planet from the sun. Aside from being the only "
        + "known body in the Solar System to currently support life, Earth is also"
        + " one of only two bodies,the other being the moon Titan, to support stable "
        + "bodies of surface liquid. All of this made possible with the assistance"
        + " of a strong magnetosphere and nitrogen-oxygen atmosphere shielding "
        + "the planet.";
        
    
    public void getPlanetData()
    {
      
      //  controller.setPlanetData();
        pcs.firePropertyChange("planetDescription", null, planetDescription); 
        
    }
    
     public void addPropertyChangeListener(PropertyChangeListener listener) 
     {
        pcs.addPropertyChangeListener(listener);
    }
    
}

/*
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