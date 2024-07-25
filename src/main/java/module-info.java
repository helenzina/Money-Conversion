module com.example.moneyconversion {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.json;
    requires json.simple;
    requires org.controlsfx.controls;

    opens com.example.moneyconversion to javafx.fxml;
    exports com.example.moneyconversion;
}