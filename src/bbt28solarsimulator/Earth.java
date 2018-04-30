/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Brad
 */
public class Earth implements Planet 
{
    
private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
FXMLDocumentController controller = new FXMLDocumentController();



    @Override
    public void getPlanetData()
    {
        

      
/*  
      
        //Bbt28mvcstopwatchController.handleUpdate(rotation);
        //firePropertyChange("analog", null, rotation); 
        
}

public void propertyChange(PropertyChangeEvent event)
{
if(event.getPropertyName().equals("identifier")
{
handImage.setRotate((double)event.getNewValue());
//viewObject.method((CastType)event.getNewValue());
}
else if (event.getPropertyName().equals("identifer2"))
{
textStatus.setText((String)event.getNewValue());
}
}

*/
    }
    
     public void addPropertyChangeListener(PropertyChangeListener listener) 
     {
        pcs.addPropertyChangeListener(listener);
    }
    
}

/*
Orbital Period: 365 Earth days
Mean Orbital Velocity: 107,218 km/h
Mass: 5.97*10^24 kg
Volume: 1.08*10^12 km^3
Equatorial Radius: 6,371 km
Surface Gravity: 9.81 m/s^2
Escape Velocity: 40,284 km/h
Number of Satellites: 1
Planet Description: Third planet from the sun. Aside from being the only known 
body in the Solar System currently supporting life, Earth is also one of only two bodies
(the other being the moon Titan) to support stable bodies of surface liquid. All of this
made possible with the assistance of a strong nitrogen-oxygen atmosphere shielding the planet.
*/