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
public class Mercury extends AbstractModel implements Planet
{
    Orbit orbit;
    Mercury(Orbit orbit)
    {
        this.orbit = orbit;
    }
    double d_XOldValue;
    double d_YOldValue;
double xCoordinate;
double yCoordinate;

double semiMajorAxis;
double orbitalDuration;

 String orbitalPeriod = "88 Earth Days";
String orbitalVelocity = "170,503 km/h"; 
String mass = "3.3*10^23 kg";
String volume = "6.08*10^10 km^3";
String meanRadius = "2,439.7 km";
String surfaceGravity = "3.7 m/s^2";
String escapeVelocity = "15,300 km/h";
String numberOfSatellites = "0";
String planetDescription = "First planet from the sun. It is the smallest planet in the" 
+ "Solar System after Pluto was demoted to planetoid status. While its surface is "
+ "expectedly hot during the day (800 degrees Fahrenheit) its surface drops to -290 "
+ "degrees Fahrenheit at night.";

    @Override
    public void getPlanetData() 
    {String oldValue = ""; 
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
        semiMajorAxis = 25.0;
        orbitalDuration = 88.0;
        xCoord = semiMajorAxis*(Math.cos((time*30)/orbitalDuration));
        firePropertyChange("mercuryXCoord",d_XOldValue,xCoord);
        orbit.setPlanetXPosition(xCoord);
    }
    @Override
        public void getPlanetYCoord(double time, double yCoord) 
    {
        d_YOldValue = yCoord;
        semiMajorAxis = 25.0;
        orbitalDuration = 88.0;
        yCoord = semiMajorAxis*(Math.sin((time*30)/orbitalDuration));
        firePropertyChange("mercuryYCoord",d_YOldValue,yCoord);
        orbit.setPlanetYPosition(yCoord);
    }
    
}
/*
  semiMajorAxis = 58.0;
        orbitalDuration = 88.0;
Orbital Period: 88 Earth days
Mean Orbital Velocity: 170,503 km/h
Mass: 3.3*10^23 kg
Volume: 6.08*10^10 km^3
Equatorial Radius: 2,439.7 km
Surface Gravity: 3.7 m/s^2
Escape Velocity: 15,300 km/h
Number of Satellites: 0
Planet Description: First planet from the sun. It is the smallest planet in the 
Solar System after Pluto was demoted to planetoid status. While its surface is 
expectedly hot during the day (800 degrees Fahrenheit) its surface drops to -290 
degrees Fahrenheit at night.
*/