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

//x = a(cosE - e)
//y = bsinE 

//E = eccentric anamoly
//e = eccentricity
//a = semi-major axis along x-axis
//b = semi-major axis along y-axis
//T = orbitalPeriod
//


/*
x = acos((2pi(t - t_0)/T)
y = asin((2pi(t - t_0)/T)
*/
public interface Planet 
{

    public void getPlanetData();
    public void getPlanetXCoord(double time,double xCoord);
    public void getPlanetYCoord(double time,double yCoord);
}
