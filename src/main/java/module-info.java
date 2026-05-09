module it.uid.unitech {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.uid.unitech to javafx.fxml;
    opens Controller to javafx.fxml;

    exports it.uid.unitech;
}