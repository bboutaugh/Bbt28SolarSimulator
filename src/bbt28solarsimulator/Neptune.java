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
public class Neptune implements Planet
{
String orbitalPeriod = "60,225 Earth days (165 Earth Years)";
String orbitalVelocity = "19,566 km/h";
String mass = "1.02*10^26 kg";
String volume = "6.25*10^13 km^3";
String meanRadius = "24,622 km";
String surfaceGravity = "11.15 m/s^2";
String escapeVelocity = "84,816 km/h";
String numberOfSatellites = "13";
String planetDescription = "Eighth and farthest planet from the sun. Like Uranus, Neptune"
+"is an ice giant with a small rocky core and hot outer ice liquid layers. It also"
+"has the strongest winds of any planet within the Solar System at speeds as high as "
+ "2000 km/hr.";

    @Override
    public void getPlanetData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
/*
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