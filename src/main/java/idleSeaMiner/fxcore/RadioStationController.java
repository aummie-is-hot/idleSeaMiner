
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
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
public class RadioStationController implements Initializable {
    
       @FXML
    private Label lblClickToStart;

    @FXML
    private Label lblScreen;

    @FXML
    private Rectangle rctPowerButton;

    @FXML
    private TextField txtField;


    @FXML
    void MouseEntered(MouseEvent event) {
        lblClickToStart.setVisible(true);
    }
       @FXML
    void Enter(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER){
            String input = txtField.getText();
             if (input.equals("Back")){
                lblScreen.setText("Commands\nRequest\nDeadline\nQuota\nBack");
                txtField.setText("");
            }
            if (input.equals("Request")){
                lblScreen.setText("Type Item Ensure it is the exact name of item");
                txtField.setText("");
                
            }
            if (input.equals("Quota")){
                lblScreen.setText("Quota is: "+MainApp.quota+"\nYou have: $"+MainApp.oreworth+" worth of ore");
                txtField.setText("");
                 
            }
        }
    }
    @FXML
    void MouseLeft(MouseEvent event) {
        lblClickToStart.setVisible(false);
    }

    @FXML
    void Start(MouseEvent event) {
        txtField.setEditable(true);
        txtField.setStyle("-fx-text-fill: #00FF00;"+"-fx-background-color: transparent;");
        lblScreen.setText("Commands\nRequest\nDeadline\nQuota\nBack");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    

    }    
}

