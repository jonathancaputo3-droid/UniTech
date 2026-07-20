package Controller;

import Util.NavigationManager;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import org.kordamp.ikonli.javafx.FontIcon;

import Util.AnimazioneUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.ImageView;

public class GenericProductController
{
    //iPhone Product

    @FXML
    private ImageView logoIconiPhoneProduct;

    @FXML
    private FontIcon loginIconiPhoneProduct;

    @FXML
    private SplitMenuButton iPhoneHomeiPhoneProduct;

    @FXML
    private SplitMenuButton iPadHomeiPhoneProduct;

    @FXML
    private SplitMenuButton MacHomeiPhoneProduct;

    @FXML
    private SplitMenuButton MacBookHomeiPhoneProduct;

    @FXML
    private SplitMenuButton WatchHomeiPhoneProduct;

    @FXML
    private SplitMenuButton AirPodsHomeiPhoneProduct;

    @FXML
    private MenuItem iPhone17ProHomeiPhoneProduct;

    @FXML
    private MenuItem iPhone17HomeiPhoneProduct;

    @FXML
    private MenuItem iPhoneAirHomeiPhoneProduct;

    @FXML
    private MenuItem iPadProHomeiPhoneProduct;

    @FXML
    private MenuItem iPadAirHomeiPhoneProduct;

    @FXML
    private MenuItem iPadBaseHomeiPhoneProduct;

    @FXML
    private MenuItem MacBookProHomeiPhoneProduct;

    @FXML
    private MenuItem MacBookAirHomeiPhoneProduct;

    @FXML
    private MenuItem MacBookNeoHomeiPhoneProduct;

    @FXML
    private MenuItem MacStudioHomeiPhoneProduct;

    @FXML
    private MenuItem MacMiniHomeiPhoneProduct;

    @FXML
    private MenuItem iMacHomeiPhoneProduct;

    @FXML
    private MenuItem WatchUltra3HomeiPhoneProduct;

    @FXML
    private MenuItem WatchSeries11HomeiPhoneProduct;

    @FXML
    private MenuItem WatchSE3HomeiPhoneProduct;

    @FXML
    private MenuItem AirPodsMax2HomeiPhoneProduct;

    @FXML
    private MenuItem AirPodsPro3HomeiPhoneProduct;

    @FXML
    private MenuItem AirPods4HomeiPhoneProduct;

    @FXML
    private Button discoveriPhone17Product;
    @FXML
    private Button discoveriPhone17ProProduct;
    @FXML
    private Button discoveriPhoneAirProduct;

    //iPad Product
    @FXML
    private ImageView logoIconiPadProduct;
    @FXML
    private FontIcon loginIconiPadProduct;
    @FXML
    private SplitMenuButton iPhoneHomeiPadProduct;
    @FXML  
    private SplitMenuButton iPadHomeiPadProduct;
    @FXML
    private SplitMenuButton MacHomeiPadProduct;
    @FXML
    private SplitMenuButton MacBookHomeiPadProduct;
    @FXML
    private SplitMenuButton WatchHomeiPadProduct;
    @FXML
    private SplitMenuButton AirPodsHomeiPadProduct;
    @FXML
    private MenuItem iPhone17ProHomeiPadProduct;
    @FXML
    private MenuItem iPhone17HomeiPadProduct;
    @FXML
    private MenuItem iPhoneAirHomeiPadProduct;
    @FXML
    private MenuItem iPadProHomeiPadProduct;
    @FXML
    private MenuItem iPadAirHomeiPadProduct;
    @FXML
    private MenuItem iPadBaseHomeiPadProduct;
    @FXML
    private MenuItem MacBookProHomeiPadProduct;
    @FXML
    private MenuItem MacBookAirHomeiPadProduct;
    @FXML
    private MenuItem MacBookNeoHomeiPadProduct;
    @FXML
    private MenuItem MacStudioHomeiPadProduct;
    @FXML
    private MenuItem MacMiniHomeiPadProduct;
    @FXML
    private MenuItem iMacHomeiPadProduct;
    @FXML
    private MenuItem WatchUltra3HomeiPadProduct;
    @FXML
    private MenuItem WatchSeries11HomeiPadProduct;
    @FXML
    private MenuItem WatchSE3HomeiPadProduct;
    @FXML   
    private MenuItem AirPodsMax2HomeiPadProduct;
    @FXML
    private MenuItem AirPodsPro3HomeiPadProduct;
    @FXML
    private MenuItem AirPods4HomeiPadProduct;

    @FXML
    private Button discoveriPadProProduct;
    @FXML
    private Button discoveriPadAirProduct;
    @FXML
    private Button discoveriPadBaseProduct;

    //Mac Product
    @FXML
    private ImageView logoiconMacProduct;
    @FXML
    private FontIcon loginIconMacProduct;
    @FXML
    private SplitMenuButton iPhoneHomeMacProduct;
    @FXML
    private SplitMenuButton iPadHomeMacProduct;
    @FXML
    private SplitMenuButton MacHomeMacProduct;
    @FXML
    private SplitMenuButton MacBookHomeMacProduct;
    @FXML
    private SplitMenuButton WatchHomeMacProduct;
    @FXML
    private SplitMenuButton AirPodsHomeMacProduct;
    @FXML
    private MenuItem iPhone17ProHomeMacProduct;
    @FXML
    private MenuItem iPhone17HomeMacProduct;
    @FXML
    private MenuItem iPhoneAirHomeMacProduct;
    @FXML
    private MenuItem iPadProHomeMacProduct;
    @FXML
    private MenuItem iPadAirHomeMacProduct;
    @FXML
    private MenuItem iPadBaseHomeMacProduct;
    @FXML
    private MenuItem MacBookProHomeMacProduct;
    @FXML
    private MenuItem MacBookAirHomeMacProduct;
    @FXML
    private MenuItem MacBookNeoHomeMacProduct;
    @FXML
    private MenuItem MacStudioHomeMacProduct;
    @FXML
    private MenuItem MacMiniHomeMacProduct;
    @FXML
    private MenuItem iMacHomeMacProduct;
    @FXML
    private MenuItem WatchUltra3HomeMacProduct;
    @FXML
    private MenuItem WatchSeries11HomeMacProduct;
    @FXML
    private MenuItem WatchSE3HomeMacProduct;
    @FXML
    private MenuItem AirPodsMax2HomeMacProduct;
    @FXML
    private MenuItem AirPodsPro3HomeMacProduct;
    @FXML
    private MenuItem AirPods4HomeMacProduct;
    
    @FXML
    private Button discoveriMacProduct;
    @FXML
    private Button discoverMacStudioProduct;
    @FXML
    private Button discoverMacMiniProduct;

    //MacBook Product
    @FXML
    private SplitMenuButton iPhoneHomeMacBookProduct;
    @FXML
    private SplitMenuButton iPadHomeMacBookProduct;
    @FXML
    private SplitMenuButton MacHomeMacBookProduct;
    @FXML
    private SplitMenuButton MacBookHomeMacBookProduct;
    @FXML
    private SplitMenuButton WatchHomeMacBookProduct;
    @FXML
    private SplitMenuButton AirPodsHomeMacBookProduct;
    @FXML
    private FontIcon loginIconMacBookProduct;
    @FXML
    private ImageView logoIconMacBookProduct;
    @FXML
    private MenuItem iPhone17ProHomeMacBookProduct;
    @FXML
    private MenuItem iPhone17HomeMacBookProduct;
    @FXML
    private MenuItem iPhoneAirHomeMacBookProduct;
    @FXML
    private MenuItem iPadProHomeMacBookProduct;
    @FXML
    private MenuItem iPadAirHomeMacBookProduct;
    @FXML
    private MenuItem iPadBaseHomeMacBookProduct;
    @FXML
    private MenuItem MacBookProHomeMacBookProduct;
    @FXML
    private MenuItem MacBookAirHomeMacBookProduct;
    @FXML
    private MenuItem MacBookNeoHomeMacBookProduct;
    @FXML
    private MenuItem MacStudioHomeMacBookProduct;
    @FXML
    private MenuItem MacMiniHomeMacBookProduct;
    @FXML
    private MenuItem iMacHomeMacBookProduct;
    @FXML
    private MenuItem WatchUltra3HomeMacBookProduct;
    @FXML
    private MenuItem WatchSeries11HomeMacBookProduct;
    @FXML
    private MenuItem WatchSE3HomeMacBookProduct;    
    @FXML
    private MenuItem AirPodsMax2HomeMacBookProduct;
    @FXML
    private MenuItem AirPodsPro3HomeMacBookProduct;
    @FXML
    private MenuItem AirPods4HomeMacBookProduct;
    
    @FXML
    private Button discoverMacBookProProduct;
    @FXML
    private Button discoverMacBookAirProduct;
    @FXML
    private Button discoverMacBookNeoProduct;

    //Watch Product
    @FXML
    private ImageView logoiconWatchProduct;
    @FXML
    private FontIcon loginIconWatchProduct;
    @FXML
    private SplitMenuButton iPhoneHomeWatchProduct;
    @FXML
    private SplitMenuButton iPadHomeWatchProduct;
    @FXML
    private SplitMenuButton MacHomeWatchProduct;
    @FXML
    private SplitMenuButton MacBookHomeWatchProduct;
    @FXML
    private SplitMenuButton WatchHomeWatchProduct;
    @FXML
    private SplitMenuButton AirPodsHomeWatchProduct;
    @FXML
    private MenuItem iPhone17ProHomeWatchProduct;
    @FXML
    private MenuItem iPhone17HomeWatchProduct;
    @FXML
    private MenuItem iPhoneAirHomeWatchProduct;
    @FXML
    private MenuItem iPadProHomeWatchProduct;
    @FXML
    private MenuItem iPadAirHomeWatchProduct;
    @FXML
    private MenuItem iPadBaseHomeWatchProduct;
    @FXML
    private MenuItem MacBookProHomeWatchProduct;
    @FXML
    private MenuItem MacBookAirHomeWatchProduct;
    @FXML
    private MenuItem MacBookNeoHomeWatchProduct;
    @FXML
    private MenuItem MacStudioHomeWatchProduct;
    @FXML
    private MenuItem MacMiniHomeWatchProduct;
    @FXML
    private MenuItem iMacHomeWatchProduct;
    @FXML
    private MenuItem WatchUltra3HomeWatchProduct;
    @FXML
    private MenuItem WatchSeries11HomeWatchProduct;
    @FXML
    private MenuItem WatchSE3HomeWatchProduct;
    @FXML
    private MenuItem AirPodsMax2HomeWatchProduct;
    @FXML
    private MenuItem AirPodsPro3HomeWatchProduct;
    @FXML
    private MenuItem AirPods4HomeWatchProduct;

    @FXML
    private Button discoverWatchUltra3Product;
    @FXML
    private Button discoverWatchSeries11Product;
    @FXML
    private Button discoverWatchSE3Product;

    //AirPods Product
    @FXML
    private ImageView logoiconAirPodsProduct;
    @FXML
    private FontIcon loginIconAirPodsProduct;
    @FXML
    private SplitMenuButton iPhoneHomeAirPodsProduct;
    @FXML
    private SplitMenuButton iPadHomeAirPodsProduct;
    @FXML
    private SplitMenuButton MacHomeAirPodsProduct;
    @FXML
    private SplitMenuButton MacBookHomeAirPodsProduct;
    @FXML
    private SplitMenuButton WatchHomeAirPodsProduct;
    @FXML
    private SplitMenuButton AirPodsHomeAirPodsProduct;
    @FXML
    private MenuItem iPhone17ProHomeAirPodsProduct;
    @FXML
    private MenuItem iPhone17HomeAirPodsProduct;
    @FXML
    private MenuItem iPhoneAirHomeAirPodsProduct;
    @FXML
    private MenuItem iPadProHomeAirPodsProduct;
    @FXML
    private MenuItem iPadAirHomeAirPodsProduct;
    @FXML
    private MenuItem iPadBaseHomeAirPodsProduct;
    @FXML
    private MenuItem MacBookProHomeAirPodsProduct;
    @FXML
    private MenuItem MacBookAirHomeAirPodsProduct;
    @FXML
    private MenuItem MacBookNeoHomeAirPodsProduct;
    @FXML
    private MenuItem MacStudioHomeAirPodsProduct;
    @FXML
    private MenuItem MacMiniHomeAirPodsProduct;
    @FXML
    private MenuItem iMacHomeAirPodsProduct;
    @FXML
    private MenuItem WatchUltra3HomeAirPodsProduct;
    @FXML
    private MenuItem WatchSeries11HomeAirPodsProduct;
    @FXML
    private MenuItem WatchSE3HomeAirPodsProduct;
    @FXML
    private MenuItem AirPodsMax2HomeAirPodsProduct;
    @FXML
    private MenuItem AirPodsPro3HomeAirPodsProduct;
    @FXML
    private MenuItem AirPods4HomeAirPodsProduct;

    @FXML
    private Button discoverAirPodsMax2Product;
    @FXML
    private Button discoverAirPodsPro3Product;
    @FXML
    private Button discoverAirPods4Product;

    @FXML
    private void apriCarrello(MouseEvent event) {
        NavigationManager.apriCarrello((Node) event.getSource());
    }

    @FXML
    private void initialize() {
        // Navigazione iPhone Product
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeiPhoneProduct, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeiPhoneProduct, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeiPhoneProduct, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeiPhoneProduct, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeiPhoneProduct, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeiPhoneProduct, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconiPhoneProduct, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconiPhoneProduct, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconiPhoneProduct);
        AnimazioneUtil.aggiungiAnimazione(loginIconiPhoneProduct);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeiPhoneProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeiPhoneProduct, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeiPhoneProduct, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeiPhoneProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeiPhoneProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeiPhoneProduct, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiPhoneProduct, "/fxml/MacBook Pro 14PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiPhoneProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiPhoneProduct, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeiPhoneProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeiPhoneProduct, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeiPhoneProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeiPhoneProduct, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeiPhoneProduct, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeiPhoneProduct, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeiPhoneProduct, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeiPhoneProduct, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeiPhoneProduct, "/fxml/AirPods 4 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiPhoneProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiPhoneProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiPhoneProduct, "/fxml/MacBook Neo PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(discoveriPhone17Product, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoveriPhone17ProProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoveriPhoneAirProduct, "/fxml/iPhone Air PageProduct.fxml");

        // Navigazione iPad Product
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeiPadProduct, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeiPadProduct, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeiPadProduct, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeiPadProduct, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeiPadProduct, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeiPadProduct, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconiPadProduct, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconiPadProduct, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconiPadProduct);
        AnimazioneUtil.aggiungiAnimazione(loginIconiPadProduct);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeiPadProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeiPadProduct, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeiPadProduct, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeiPadProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeiPadProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeiPadProduct, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiPadProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiPadProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiPadProduct, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeiPadProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeiPadProduct, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeiPadProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeiPadProduct, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeiPadProduct, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeiPadProduct, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeiPadProduct, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeiPadProduct, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeiPadProduct, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(discoveriPadProProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoveriPadAirProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoveriPadBaseProduct, "/fxml/iPad PageProduct.fxml");

        // Navigazione Mac Product
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacProduct, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacProduct, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacProduct, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacProduct, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacProduct, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacProduct, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoiconMacProduct, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconMacProduct, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoiconMacProduct);
        AnimazioneUtil.aggiungiAnimazione(loginIconMacProduct);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacProduct, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacProduct, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacProduct, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacProduct, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacProduct, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacProduct, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacProduct, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacProduct, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacProduct, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacProduct, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacProduct, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(discoveriMacProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverMacStudioProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverMacMiniProduct, "/fxml/MacMini PageProduct.fxml");

        // Navigazione MacBook Product
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacBookProduct, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacBookProduct, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacBookProduct, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacBookProduct, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacBookProduct, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacBookProduct, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconMacBookProduct, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconMacBookProduct, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconMacBookProduct);
        AnimazioneUtil.aggiungiAnimazione(loginIconMacBookProduct);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacBookProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacBookProduct, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacBookProduct, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacBookProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacBookProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacBookProduct, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacBookProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacBookProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacBookProduct, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacBookProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacBookProduct, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacBookProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacBookProduct, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacBookProduct, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacBookProduct, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacBookProduct, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacBookProduct, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacBookProduct, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(discoverMacBookProProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverMacBookAirProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverMacBookNeoProduct, "/fxml/MacBook Neo PageProduct.fxml");


        // Navigazione Watch Product
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeWatchProduct, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeWatchProduct, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeWatchProduct, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeWatchProduct, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeWatchProduct, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeWatchProduct, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoiconWatchProduct, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconWatchProduct, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoiconWatchProduct);
        AnimazioneUtil.aggiungiAnimazione(loginIconWatchProduct);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeWatchProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeWatchProduct, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeWatchProduct, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeWatchProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeWatchProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeWatchProduct, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeWatchProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeWatchProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeWatchProduct, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeWatchProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeWatchProduct, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeWatchProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeWatchProduct, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeWatchProduct, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeWatchProduct, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeWatchProduct, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeWatchProduct, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeWatchProduct, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(discoverWatchUltra3Product, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverWatchSeries11Product, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverWatchSE3Product, "/fxml/Apple Watch SE 3 PageProduct.fxml");

        // Navigazione AirPods Product
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeAirPodsProduct, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeAirPodsProduct, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeAirPodsProduct, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeAirPodsProduct, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeAirPodsProduct, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeAirPodsProduct, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoiconAirPodsProduct, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconAirPodsProduct, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoiconAirPodsProduct);
        AnimazioneUtil.aggiungiAnimazione(loginIconAirPodsProduct);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeAirPodsProduct, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeAirPodsProduct, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeAirPodsProduct, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeAirPodsProduct, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeAirPodsProduct, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeAirPodsProduct, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeAirPodsProduct, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeAirPodsProduct, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeAirPodsProduct, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeAirPodsProduct, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeAirPodsProduct, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeAirPodsProduct, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeAirPodsProduct, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeAirPodsProduct, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeAirPodsProduct, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeAirPodsProduct, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeAirPodsProduct, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeAirPodsProduct, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(discoverAirPodsMax2Product, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverAirPodsPro3Product, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScena(discoverAirPods4Product, "/fxml/AirPods 4 PageProduct.fxml");
    }


}
