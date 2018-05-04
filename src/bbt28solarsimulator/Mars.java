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
public class Mars extends AbstractModel implements Planet
{
    Orbit orbit;

    
    
     Mars(Orbit orbit)
    {
       this.orbit = orbit;
    }

double semiMajorAxis;
double orbitalDuration;

String orbitalPeriod = "687 Earth days";
String orbitalVelocity = "86,677 km/h";
String mass = "6.41*10^23 kg";
String volume = "1.63*10^11 km^3";
String meanRadius = "3389.5 km";
String surfaceGravity = "3.71 m/s^2";
String escapeVelocity = "18,108 km/h";
String numberOfSatellites = "2";
String planetDescription = "Fourth planet from the sun. The planet's red hue comes from"
+"large deposits of oxidized iron on its surface. Ongoing research suggests that"
+"the planet may have had oceans in its ancient history.";

double d_XOldValue = 0;
double d_YOldValue = 0;

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
        semiMajorAxis = 85.0;
        orbitalDuration = 687.0;
        xCoord = semiMajorAxis*(Math.cos((time*30)/orbitalDuration));
        firePropertyChange("marsXCoord",d_XOldValue,xCoord);
        orbit.setPlanetXPosition(xCoord);
    }
    
    @Override
        public void getPlanetYCoord(double time, double yCoord) 
    {
        d_YOldValue = yCoord;
        semiMajorAxis = 85.0;
        orbitalDuration = 687.0;
        yCoord = semiMajorAxis*(Math.sin((time*30)/orbitalDuration));
        firePropertyChange("marsYCoord",d_YOldValue,yCoord);
        orbit.setPlanetYPosition(yCoord);
    }
}
/*
  semiMajorAxis = 228.0;
        orbitalDuration = 687.0;
Orbital Period: 687 Earth days
Mean Orbital Velocity: 86,677 km/h
Mass: 6.41*10^23 kg
Volume: 1.63*10^11
Equatorial Radius: 3389.5 km
Surface Gravity: 3.71 m/s^2
Escape Velocity: 18,108 km/h
Number of Satellites: 2
Planet Description: Fourth planet from the sun. The planet's red hue comes from 
large deposits of oxidized iron on its surface. Ongoing research suggests that 
the planet may have had oceans in its ancient history.
*/
