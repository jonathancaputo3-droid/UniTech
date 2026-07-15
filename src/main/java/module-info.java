module it.uid.unitech {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;
    requires org.controlsfx.controls;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires spring.security.crypto;
    requires javafx.graphics;

    opens it.uid.unitech to javafx.fxml;
    opens Controller to javafx.fxml;

    exports it.uid.unitech;
}