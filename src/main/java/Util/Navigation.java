package Util;

import javafx.scene.Parent;

public class Navigation {

    private static Parent previousRoot;

    public static void setPreviousRoot(Parent root) {
        previousRoot = root;
    }

    public static Parent getPreviousRoot() {
        return previousRoot;
    }
}