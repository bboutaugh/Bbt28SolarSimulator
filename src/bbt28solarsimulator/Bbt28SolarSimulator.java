/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbt28solarsimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Brad
 */
public class Bbt28SolarSimulator extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
       HBox root = new HBox();
     
       Scene scene = new Scene(root);
         ChangeScene.scene = scene;
        ChangeScene.switchTo("FXMLDocument");
       stage.setScene(scene);
       stage.show();
       stage.setTitle("Solar System Simulation");
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
