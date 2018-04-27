/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.beans.PropertyChangeSupport;
import javafx.scene.shape.Circle;

/**
 *
 * @author Brad
 */
public class Sun {
    private PropertyChangeSupport changeSupport;
    Circle sun = new Circle();
    
    public void addSun()
    {
        
       // sunStackPane.setStyle("-fx-background-color: BLACK");
        changeSupport.firePropertyChange("sun", null, sun);
        
        
    }
}
