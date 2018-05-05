/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.util.ArrayList;
import java.util.HashMap;



/**
 *
 * @author Brad
 */
public class OrbitalPositions implements java.io.Serializable
{
    
    private double mercuryXCoordinate;
    private double mercuryYCoordinate;
    private double venusXCoordinate;
    private double venusYCoordinate;
    private double earthXCoordinate;
    private double earthYCoordinate;
    private double marsXCoordinate;
    private double marsYCoordinate;
    private double jupiterXCoordinate;
    private double jupiterYCoordinate;
    private double saturnXCoordinate;
    private double saturnYCoordinate;
    private double uranusXCoordinate;
    private double uranusYCoordinate;
    private double neptuneXCoordinate;
    private double neptuneYCoordinate;
    
    private ArrayList<Double> al = new ArrayList<>();
   
    OrbitalPositions(ArrayList<Double> al)
    {
       this.al = al; 
       al.add(mercuryXCoordinate);
       al.add(mercuryYCoordinate);
       al.add(venusXCoordinate);
       al.add(venusYCoordinate);
       al.add(earthXCoordinate);
       al.add(earthYCoordinate);      
       al.add(marsXCoordinate);
       al.add(marsYCoordinate);
       al.add(jupiterXCoordinate);
       al.add(jupiterYCoordinate);
       al.add(saturnXCoordinate);
       al.add(saturnYCoordinate);
       al.add(uranusXCoordinate);
       al.add(uranusYCoordinate);
       al.add(neptuneXCoordinate);
       al.add(neptuneYCoordinate);
    }


    public double getEarthXCoordinate() {
        return earthXCoordinate;
    }

    public void setEarthXCoordinate(double earthXCoordinate) {
        this.earthXCoordinate = earthXCoordinate;
    }

    public double getEarthYCoordinate() {
        return earthYCoordinate;
    }

    public void setEarthYCoordinate(double earthYCoordinate) {
        this.earthYCoordinate = earthYCoordinate;
    }

    }
    
    
            

