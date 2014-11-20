/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent>{

    private String userInfo;
    private final Button saveButton = new Button("Save");
    private final Button closeButton = new Button("Close");
    private TextArea users;
    private TextFieldsPartial partial;
        
    public ButtonPartial(TextArea users, TextFieldsPartial partial) {
        this.users = users;
        this.partial = partial;
        
        this.getChildren().add(saveButton);
        this.getChildren().add(closeButton);

        saveButton.setOnAction(this);
        closeButton.setOnAction(this);
        
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        
        //Inline implementation for EventHandler interface
        /*
        closeButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                
            }
        });*/
    }

    @Override
    public void handle(ActionEvent t) {
        if(t.getSource().equals(closeButton)){
            Platform.exit();     
        }
        else{
            System.out.println("Tallennus...");
        }
    }
    
    
    
}
