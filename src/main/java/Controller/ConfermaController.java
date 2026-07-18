package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

import Util.AnimazioneUtil;

public class ConfermaController {

    @FXML
    private void tornaHome(ActionEvent event) {
        AnimazioneUtil.cambiaScena((Node) event.getSource(), "/fxml/Home.fxml");
    }
}