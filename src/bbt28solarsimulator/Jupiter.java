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
public class Jupiter extends AbstractModel implements Planet
{
        
String orbitalPeriod = "4,380 Earth days";
String orbitalVelocity = "47,002 km/h";
String mass = "1.9*10^27 kg";
String volume = "1.43*10^15 km^3";
String meanRadius = "69,911 km";
String surfaceGravity =  "24.79 m/s^2" ;
String escapeVelocity = "216,720 km/h";
String numberOfSatellites = "53";
String planetDescription = "Fifth planet from the sun. As the largest planet within the"
+ "Solar System, Jupiter has served as a hypothetical bouncer regulating the movement"
+ "of large bodies through the system while also reducing the number of harmful "
+ "asteroids/meteorites coming with a potential path to Earth. Its largest hurricane, known as the "
+ "\"Great Red Spot\" is the largest in the system with capacity to fit two Earths.";
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
Orbital Period: 4,380 Earth days
Mean Orbital Velocity: 47,002 km/h
Mass: 1.9*10^27 kg
Volume: 1.43*10^15 km^3
Equatorial Radius: 69,911 km
Surface Gravity: 24.79 m/s^2
Escape Velocity: 216,720 km/h
Number of Satellites: 53
Planet Description: Fifth planet from the sun. As the largest planet within the 
Solar System, Jupiter has served as a hypothetical bouncer regulating the movement 
of large bodies through the system while also reducing the number of harmful 
asteroids/meteorites coming with a potential path to Earth. Its largest hurricane, known as the 
"Great Red Spot" is the largest in the system with capacity to fit two Earths.
*/