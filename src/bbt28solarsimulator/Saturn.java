/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

/**
 *
 * @author Brad
 */
public class Saturn extends AbstractModel implements Planet 
{
String orbitalPeriod = "10,585 Earth days";
String orbitalVelocity = "34,701 km/h";
String mass = "5.68*10^26 kg";
String volume = "8.27*10^14 km^3";
String  meanRadius = "58,232 km";
String surfaceGravity = "10.4 m/s^2";
String escapeVelocity = "129,924 km/h";
String numberOfSatellites = "62";
String planetDescription = "Sixth planet from the sun. Other than being massive in size,"
+ "Saturn has a complex ring system that has what is possibly the most diverse array"
+ "of orbiting bodies of the Solar System and perhaps beyond. ";

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
    
}

/*
Orbital Period: 10,585 Earth days
Mean Orbital Velocity: 34,701 km/h
Mass: 5.68*10^26 kg
Volume: 8.27*10^14
Equatorial Radius: 58,232 km
Surface Gravity: 10.4 m/s^2
Escape Velocity: 129,924 km/h
Number of Satellites: 62
Planet Description: Sixth planet from the sun. Other than being massive in size,
Saturn has a complex ring system that has what is possibly the most diverse array
of orbiting bodies of the Solar System and perhaps beyond. 
*/