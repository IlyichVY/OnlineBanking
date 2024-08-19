package org.example.bank.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.bank.Models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label payee_address_label;
    public TextField payee_address_field;
    public Label password_label;
    public TextField password_field;
    public Button login_button;
    public Label error_label;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
       login_button.setOnAction(event -> onLogin());
    }

    private void onLogin(){
        Stage stage = (Stage) error_label.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
