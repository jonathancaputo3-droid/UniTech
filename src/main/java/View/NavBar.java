package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class NavBar extends HBox {

    public NavBar() {
        setSpacing(10);
        setPadding(new Insets(15, 15, 15, 300));
        setAlignment(Pos.CENTER_LEFT);
        setStyle("-fx-background-color: white;");
        setPrefHeight(30);
        setMinHeight(30);
        setMaxHeight(30);

        Image logo;
        logo = new Image(getClass().getResource("/it/uid/unitech/Images/UniTechLogoo.png").toExternalForm());

        ImageView logoView = new ImageView(logo);
        logoView.setFitHeight(40);
        logoView.setFitWidth(40);
        logoView.setPreserveRatio(true);
        getChildren().add(logoView);
    }
}
