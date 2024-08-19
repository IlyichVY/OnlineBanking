package org.example.bank;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.bank.Models.Model;


public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
