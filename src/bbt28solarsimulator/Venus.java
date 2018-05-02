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
public class Venus extends AbstractModel implements Planet
{
double eccentricity = 0.006772;
double eccentricAnamoly;
double semiMajorAxis = 108.00;
    
String orbitalPeriod = "225 Earth days";
String orbitalVelocity = "126,074 km/h";
String mass = "4.87 *10^24 kg";
String volume = "9.28*10^11 km^3";
String meanRadius = "6,051.8 km";
String surfaceGravity = "8.87 m/s^2";
String escapeVelocity = "37,296 km/h";
String numberOfSatellites = "0";
String planetDescription = "Second planet from the sun. Its proximity to the sun coupled"
+"with a runaway greenhouse effect, Venus' surface temperature is a raging 900 degrees Fahrenheit."
+"While keeping the surface hot, its atmoshpere also travels at an incredible speed"
+"sending clouds around the planet in just 5 Earth days. ";

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
Orbital Period: 225 Earth days
Mean Orbital Velocity: 126,074 km/h
Mass: 4.87 *10^24 kg
Volume: 9.28*10^11 km^3
Equatorial Radius: 6,051.8 km
Surface Gravity: 8.87 m/s^2
Escape Velocity: 37,296 km/h
Number of Satellites: 0
Planet Description: Second planet from the sun. Its proximity to the sun coupled 
with a runaway greenhouse effect, Venus' surface temperature is a raging 900 degrees Fahrenheit.
While keeping the surface hot, its atmoshpere also travels at an incredible speed
sending clouds around the planet in just 5 Earth days. 

*/