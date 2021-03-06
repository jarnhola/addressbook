/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldsPartial extends VBox {

        private final Label nameLabel = new Label("Nimi");
        private final TextField nameField = new TextField();
        private final Label addressLabel = new Label("Osoite");
        private final TextField addressField = new TextField();
        private final Label phoneLabel = new Label("Puhelin");
        private final TextField phoneField = new TextField();
        //private final VBox textFieldLayout = new VBox();
        
    public TextFieldsPartial() {
        VBox.setMargin(this, new Insets(10,10,10,10));
        this.getChildren().add(nameLabel);
        this.getChildren().add(nameField);
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressField);
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneField);
        this.setStyle("-fx-spacing:10");
    }
    
    
}
