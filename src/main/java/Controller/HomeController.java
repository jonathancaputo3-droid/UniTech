package Controller;

import Util.AnimazioneUtil;
import javafx.fxml.FXML;
import org.kordamp.ikonli.javafx.FontIcon;

public class HomeController {

    @FXML
    private FontIcon loginIcon;

    public void initialize() {

        AnimazioneUtil.aggiungiAnimazioneScale(loginIcon);

        loginIcon.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(loginIcon, "/Fxml/ProfileOption.fxml");
        });
    }
}
