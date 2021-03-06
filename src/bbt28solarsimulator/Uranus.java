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
public class Uranus extends AbstractModel implements Planet
{
    Orbit orbit;
    Uranus(Orbit orbit)
    {
        this.orbit = orbit;
    }
    
private double d_YOldValue;
private double d_XOldValue;
private double xCoordinate;
private double yCoordinate;

private double semiMajorAxis;
private double orbitalDuration;

private String orbitalPeriod =  "30,660 Earth days (84 Earth years)";
private String orbitalVelocity = "24,477 km/";
private String mass = "8.68*10^25 kg";
private String volume = "6.83*10^13 km^3";
private String meanRadius = "25,362 km";
private String surfaceGravity = "8.87 m/s^2";
private String escapeVelocity = "76,968 km/h";
private String numberOfSatellites = "27";
private String planetDescription = "Seventh planet from the sun. As the name Uranus has been the "
+"subject of jokes, the planet's composition of methane and ammonia actually would produce what "
+"is potentially the most foul odor in the system. It also stands unique as being "
+"the only planet to rotate on its side within the Solar System.";

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
        semiMajorAxis = 200;
        orbitalDuration = 30660.0;
        xCoord = semiMajorAxis*(Math.cos((time*50)/orbitalDuration));
        firePropertyChange("uranusXCoord",d_XOldValue,xCoord);
        orbit.setPlanetXPosition(xCoord);
    }
    @Override
        public void getPlanetYCoord(double time, double yCoord) 
    {
        d_YOldValue = yCoord;
        semiMajorAxis = 200;
        orbitalDuration = 30660.0;
        yCoord = semiMajorAxis*(Math.sin((time*50)/orbitalDuration));
        firePropertyChange("uranusYCoord",d_YOldValue,yCoord);
        orbit.setPlanetYPosition(yCoord);
    }
    
}

/*
  semiMajorAxis = 2875;
        orbitalDuration = 30660.0;
Orbital Period: 30,660 Earth days (84 Earth years)
Mean Orbital Velocity: 24,477 km/h
Mass: 8.68*10^25 kg
Volume: 6.83*10^13
Equatorial Radius: 25,362 km
Surface Gravity: 8.87 m/s^2
Escape Velocity: 76,968 km/h
Number of Satellites: 27
Planet Description: Seventh planet from the sun. As the name Uranus has been the
subject of jokes, the planet's composition of methane and ammonia actually would produce what
is potentially the most foul odor in the system. It also stands unique as being 
the only planet to rotate on its side within the Solar System.
*/