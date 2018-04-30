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
public class Mars implements Planet
{
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

    @Override
    public void getPlanetData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
/*
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
