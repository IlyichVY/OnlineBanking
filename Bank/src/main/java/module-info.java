 module org.example.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.example.bank to javafx.fxml;
    exports org.example.bank;
    exports org.example.bank.Controllers;
    exports org.example.bank.Controllers.Admin;
    exports org.example.bank.Controllers.Client;
    exports org.example.bank.Models;
    exports org.example.bank.Views;
}