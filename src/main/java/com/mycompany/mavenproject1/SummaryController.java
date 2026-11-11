/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 2551365
 */
public class SummaryController implements Initializable {
    
    @FXML
    private Button closeBtn;
    
    @FXML
    private Label totalLabel;
    
    @FXML
    private Label drinkLabel;

    @FXML
    private Label drinkPrice;

    @FXML
    private Label entreeLabel;

    @FXML
    private Label entreePrice;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @FXML
    void onCloseSummary(ActionEvent event) {
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
//        event.getSource().
    }
    
    
}
