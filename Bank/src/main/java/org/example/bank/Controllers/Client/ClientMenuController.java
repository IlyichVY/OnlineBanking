package org.example.bank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.example.bank.Models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_button;
    public Button transactions_button;
    public Button accounts_button;
    public Button profile_button;
    public Button logout_button;
    public Button report_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
       addListeners();
    }

    private void addListeners(){
        dashboard_button.setOnAction(event -> onDashboard());
        transactions_button.setOnAction(event -> onTransactions());
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }

    private void onTransactions(){
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }
}
