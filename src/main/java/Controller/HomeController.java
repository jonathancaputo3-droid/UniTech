package Controller;

import Util.AnimazioneUtil;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import org.kordamp.ikonli.javafx.FontIcon;

public class HomeController {

    @FXML
    private FontIcon loginIcon;
    @FXML
    private MenuItem iPhone17;

    public void initialize() {

        AnimazioneUtil.aggiungiAnimazione(loginIcon);

        AnimazioneUtil.verificaCambiaScena(loginIcon, "/Fxml/ProfileOption.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17,"/Fxml/iPhone 17 PageProduct.fxml");

    }
}
