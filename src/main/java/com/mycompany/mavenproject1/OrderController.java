/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author 2551365
 */
public class OrderController implements Initializable {
    
    @FXML
    private ToggleGroup drinkToggleGroup;
    
    @FXML
    private ListView<String> entreeListView;
    
    @FXML
    private Label totalPriceLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set the entrees in the list view
        ObservableList<String> entrees = FXCollections.observableArrayList(
            "Chicken Salad",
            "Turkey Sandwhich",
            "Vegetable Wrap",
            "Grilled Cheese"
        );
        
        entreeListView.setItems(entrees);
        // Detect when the user has chosen a new entree
        entreeListView.getSelectionModel().selectedItemProperty().addListener((o, ov, nv) -> {
            Order.setEntree(nv);
            System.out.println(Order.getEntree());
            updatePriceLabel();
        });
        
        // Detect when the user has chosen a new drink
        drinkToggleGroup.selectedToggleProperty().addListener((o, ov, nv) -> {
            Order.setDrink(((RadioButton) nv).getText());
            System.out.println(Order.getDrink());
            updatePriceLabel();
        });
    }    
    
    public void updatePriceLabel() {
        double totalPrice = 0;
        if (Order.getEntree() != null) {
            totalPrice += Order.items.get(Order.getEntree());
        }
        
        if (Order.getDrink() != null) {
            totalPrice += Order.items.get(Order.getDrink());
        }
        
        totalPriceLabel.setText("$" + totalPrice);
    }
}
