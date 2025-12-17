
package idleSeaMiner.fxcore;
/*
By: <Aum Markandey>
Date: 2025-12-13
Program Details: Idle Sea Mining game similar to cookie clicker where your a base manager for an underwater mineing facillty
*/
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class GameController implements Initializable {
    
    @FXML
    private Label lblOreBay;

    @FXML
    private Label lblRadioStation;

    @FXML
    private Label lblResearchBay;

    @FXML
    private Polygon polyRadio;

    @FXML
    private Polygon polyResearch;

    @FXML
    private Rectangle rctOreBay;
    // add tutorial
    // make it so when you buy drones it and you type how many drones you want if its greated than the amount they can buy it auto sets the amount to the number they can buy
    @FXML
    void polyRadioClicked(MouseEvent event) {
         try {
            MainApp.setRoot("RadioStation");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    void polyRadioEntered(MouseEvent event) {
        lblRadioStation.setVisible(true);
    }

    @FXML
    void polyRadioExit(MouseEvent event) {
        lblRadioStation.setVisible(false);
    }

    @FXML
    void polyResearchClicked(MouseEvent event) {
        try {
            MainApp.setRoot("ResearchBay");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    void polyResearchEntered(MouseEvent event) {
        lblResearchBay.setVisible(true);
    }

    @FXML
    void polyResearchExit(MouseEvent event) {
         lblResearchBay.setVisible(false);
    }

    @FXML
    void rctOreBayClicked(MouseEvent event) {
         try {
            MainApp.setRoot("OreBay");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    void rctOreBayEnter(MouseEvent event) {
         lblOreBay.setVisible(true);
    }

    @FXML
    void rctOreBayLeave(MouseEvent event) {
        lblOreBay.setVisible(false);
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    

    }    
}

