/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Brad
 */
public class TextOutput extends AbstractModel
{
    String text = "";
    String oldValue;
    
        public void setText()
    {
        oldValue = text;
        try (Scanner scanner = new Scanner(new File("CS3330_FinalProject_Citations.txt"))) {

        while (scanner.hasNext())
            firePropertyChange("newText",oldValue,text);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
    
}
