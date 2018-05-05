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
public class Neptune extends AbstractModel implements Planet
{
    Orbit orbit;
    Neptune(Orbit orbit)
    {
        this.orbit = orbit;
    }
private double d_XOldValue;
private double d_YOldValue;
private double xCoordinate;
private double yCoordinate;

private double semiMajorAxis;
private double orbitalDuration;



private String orbitalPeriod = "60,225 Earth days (165 Earth Years)";
private String orbitalVelocity = "19,566 km/h";
private String mass = "1.02*10^26 kg";
private String volume = "6.25*10^13 km^3";
private String meanRadius = "24,622 km";
private String surfaceGravity = "11.15 m/s^2";
private String escapeVelocity = "84,816 km/h";
private String numberOfSatellites = "13";
private String planetDescription = "Eighth and farthest planet from the sun. Like Uranus, Neptune "
+"is an ice giant with a small rocky core and hot outer ice liquid layers. It also "
+"has the strongest winds of any planet within the Solar System at speeds up to "
+ "2000 km/hr.";

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
        semiMajorAxis = 230;
        orbitalDuration = 60225.0;
        xCoord = semiMajorAxis*(Math.cos((time*50)/orbitalDuration));
        firePropertyChange("neptuneXCoord",d_XOldValue,xCoord);
        orbit.setPlanetXPosition(xCoord);
    }
    @Override
        public void getPlanetYCoord(double time, double yCoord) 
    {
        d_YOldValue = yCoord;
        semiMajorAxis = 230;
        orbitalDuration = 60225.0;
        yCoord = semiMajorAxis*(Math.sin((time*50)/orbitalDuration));
        firePropertyChange("neptuneYCoord",d_YOldValue,yCoord);
        orbit.setPlanetYPosition(yCoord);
    }
    
}
/*
 semiMajorAxis = 4500.0;
        orbitalDuration = 60225.0;
Orbital Period: 60,225 Earth days (165 Earth Years)
Mean Orbital Velocity: 19,566 km/h
Mass: 1.02*10^26 kg
Volume: 6.25*10^13 km^3
Equatorial Radius: 24,622 km
Surface Gravity: 11.15 m/s^2
Escape Velocity: 84,816 km/h
Number of Satellites: 13
Planet Description: Eighth and farthest planet from the sun. Like Uranus, Neptune
is an ice giant with a small rocky core and hot outer ice liquid layers. It also
has the strongest winds of any planet within the Solar System at speeds as high as 
2000 km/hr.
*/