package Controller;

import Util.AnimazioneUtil;
import Util.NavigationManager;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.kordamp.ikonli.javafx.FontIcon;

public class HomeController {

    @FXML
    private ImageView logoicon;

    @FXML
    private FontIcon loginIcon;

    @FXML
    private SplitMenuButton iPhoneHome;

    @FXML
    private SplitMenuButton iPadHome;

    @FXML
    private SplitMenuButton MacHome;

    @FXML
    private SplitMenuButton MacBookHome;

    @FXML
    private SplitMenuButton WatchHome;

    @FXML
    private SplitMenuButton AirPodsHome;

    @FXML
    private MenuItem iPhone17ProHome;

    @FXML
    private MenuItem iPhone17Home;

    @FXML
    private MenuItem iPhoneAirHome;

    @FXML
    private MenuItem iPadProHome;

    @FXML
    private MenuItem iPadAirHome;

    @FXML
    private MenuItem iPadBaseHome;

    @FXML
    private MenuItem MacBookProHome;

    @FXML
    private MenuItem MacBookAirHome;

    @FXML
    private MenuItem MacBookNeoHome;

    @FXML
    private MenuItem MacStudioHome;

    @FXML
    private MenuItem MacMiniHome;

    @FXML
    private MenuItem iMacHome;

    @FXML
    private MenuItem WatchUltra3Home;

    @FXML
    private MenuItem WatchSeries11Home;

    @FXML
    private MenuItem WatchSE3Home;

    @FXML
    private MenuItem AirPodsMax2Home;

    @FXML
    private MenuItem AirPodsPro3Home;

    @FXML
    private MenuItem AirPods4Home;

    @FXML
    private Button DiscoveriPhone17Home;
    
    @FXML
    private Button DiscoveriPadAirHome;


    @FXML
    private Button DiscoverAirPods4Home;

    @FXML
    private Button DiscoverAppleWatchSeries11Home;

    @FXML
    private Button DiscoverMacBookAirHome;

    @FXML
    private Button DiscoveriMacHome;

    @FXML
    private void apriCarrello(MouseEvent event) {
        NavigationManager.apriCarrello((Node) event.getSource());
    }

    public void initialize() {

        AnimazioneUtil.verificaCambiaScena(iPhoneHome, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHome, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHome, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHome, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHome, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHome, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHome, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17Home, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHome, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHome, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHome, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHome, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHome, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHome, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHome, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHome, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHome, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHome, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3Home, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11Home, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3Home, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2Home, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3Home, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4Home, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(DiscoveriPhone17Home, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(DiscoveriPadAirHome, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(DiscoverAirPods4Home, "/fxml/AirPods 4 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(DiscoverAppleWatchSeries11Home, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(DiscoverMacBookAirHome, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(DiscoveriMacHome, "/fxml/iMac PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIcon, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoicon, "/fxml/Home.fxml");
    }
}