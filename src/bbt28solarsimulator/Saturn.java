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
    Orbit orbit;
    Saturn(Orbit orbit)
    {
        this.orbit = orbit;
    }
private double d_XOldValue;
private double d_YOldValue;
private double xCoordinate;
private double yCoordinate;

private double semiMajorAxis;
private double orbitalDuration;

private String orbitalPeriod = "10,585 Earth days";
private String orbitalVelocity = "34,701 km/h";
private String mass = "5.68*10^26 kg";
private String volume = "8.27*10^14 km^3";
private String  meanRadius = "58,232 km";
private String surfaceGravity = "10.4 m/s^2";
private String escapeVelocity = "129,924 km/h";
private String numberOfSatellites = "62";
private String planetDescription = "Sixth planet from the sun. Other than being massive in size, "
+ "Saturn has a complex ring system that has what is possibly one of the most diverse arrays "
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

    @Override
    public void getPlanetXCoord(double time,double xCoord) 
    {
        
        d_XOldValue = xCoord;
        semiMajorAxis = 170;
        orbitalDuration = 10585;
        xCoord = semiMajorAxis*(Math.cos((time*50)/orbitalDuration));
        firePropertyChange("saturnXCoord",d_XOldValue,xCoord);
        orbit.setPlanetXPosition(xCoord);
    }
    @Override
        public void getPlanetYCoord(double time, double yCoord) 
    {
        d_YOldValue = yCoord;
        semiMajorAxis = 170;
        orbitalDuration = 10585;
        yCoord = semiMajorAxis*(Math.sin((time*50)/orbitalDuration));
        firePropertyChange("saturnYCoord",d_YOldValue,yCoord);
        orbit.setPlanetYPosition(yCoord);
    }
}

/*
  semiMajorAxis = 1433.5;
        orbitalDuration = 10585.0;
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