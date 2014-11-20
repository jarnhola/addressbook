/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import javafx.geometry.Insets;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class Addressbook extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //The root is the main layout
        HBox root = new HBox();
        VBox leftLayout = new VBox();
        
        TextArea users = new TextArea();
        users.setStyle("-fx-max-width:200;-fx-max-height:200;-fx-spacing:10");
        TextFieldsPartial partial = new TextFieldsPartial();
        leftLayout.getChildren().add(partial);
        leftLayout.getChildren().add(new ButtonPartial(users,partial));
        
        root.getChildren().add(leftLayout);
        root.getChildren().add(users);
        Scene scene = new Scene(root, 400, 400);
        /*
        //textFieldLayoutille tehty oma luokka TextFieldsPartial joka perii VBox-luokan (layoutin)
        root.getChildren().add(new TextFieldsPartial()); 
        //buttonLayoutille tehty oma luokka ButtonPartial joka perii HBox-luokan (layoutin)
        root.getChildren().add(new ButtonPartial());
        
        root.getChildren().add(users);
        
        Scene scene = new Scene(root, 300, 400);
        */
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
