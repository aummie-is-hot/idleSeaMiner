
package idleSeaMiner.fxcore;
/*
By: <Your Name Here>
Date: 2025-12-13
Program Details: <Program Description Here>
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

public class FXMLController implements Initializable {
    
     @FXML
    private MediaView background;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnStart;



    @FXML
    private Label lblOut;
    Media media = new Media(getClass().getResource("/waterbackgroundmainmenu.mp4").toString());
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    @FXML
    void btnMouseEnter(MouseEvent event) {
        Button btn = (Button) event.getSource();
        btn.setStyle("-fx-background-color: white;"+"-fx-text-fill: black;");
    }
    // ths is for the button cool animation

    @FXML
    void btnMouseExit(MouseEvent event) {
        Button btn = (Button) event.getSource();
         btn.setStyle(
        "-fx-background-color: transparent;" +
        "-fx-border-color: white;" +
        "-fx-border-width: 3;" +
        "-fx-text-fill: white;"
    );


        
    }
// also for the button animation but to reset it after ypou leave the button
    @FXML
    void btnSettingsA(ActionEvent event) {

    }

    @FXML
    void btnStartA(ActionEvent event) {
        
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        background.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();

    }    
}

