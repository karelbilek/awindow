/*
 * KravinaApp.java
 */

package awindow;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class AWindowApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    protected void startup() {
        show(new AWindowView(this));
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of KravinaApp
     */
    public static AWindowApp getApplication() {
        return (AWindowApp) Application.getInstance(AWindowApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(AWindowApp.class, args);
    }
}
