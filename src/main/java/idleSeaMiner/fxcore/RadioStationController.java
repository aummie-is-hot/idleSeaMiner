
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
    private Button btnBack;
    boolean requestedScreen = false;
    @FXML
    void MouseEntered(MouseEvent event) {
        lblClickToStart.setVisible(true);
    }
    boolean dronescreen = false;
       @FXML
    void Enter(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER){
            String input = txtField.getText();
             if (input.equals("Back")){
                lblScreen.setText("Money: "+ MainApp.money+"\nCommands:\nRequest\nDeadline\nQuota\nBack");
                txtField.setText("");
                requestedScreen = false;
            }
            if (input.equals("Request")){
                lblScreen.setText("Type Item Ensure it is the exact name of item type HELP for list of items requestable");
                txtField.setText("");
                requestedScreen = true;
                
            }
            if (requestedScreen){
                if (input.equals("HELP")){
                    lblScreen.setText("Money\nScientists\nDrones");
                    txtField.setText("");
                }
                if (input.equals("Drones")){
                     lblScreen.setText("Money "+MainApp.money+"\nSimple Drone  - $20\n Advanced Drone  - $100");
                     

                     // advanced drones required to add tech to it like sonar blasts and dynamite
                     
                }
                if(input.equals("Simple Drone")){
                    lblScreen.setText("Input Number Of Drones");
                    txtField.setText("");
                    dronescreen = true;
                    
                   
                }
                if (dronescreen){
                    int num = Integer.parseInt(txtField.getText());
                       if (MainApp.money>num*20) {
                        
                        MainApp.money= MainApp.money-num*20;
                        MainApp.drones = MainApp.drones +num;
                        lblScreen.setText("Money "+MainApp.money+"\nSimple Drone - $20\n Advanced Drone - $100");
                        dronescreen = false;
                    }  
                }
            }
            // add items to request and check if requested screen is on and they typed a item to request
            if (input.equals("Quota")){
                lblScreen.setText("Quota is: "+MainApp.quota+"\nYou have: $"+MainApp.oreworth+" worth of ore");
                txtField.setText("");
                 
            }
            if (input.equals("Deadline")){
                lblScreen.setText("The Deadline is "+MainApp.deadline+" days away");
                txtField.setText("");
                 
            }
            else{
                txtField.setText("");
                //txtField.setPromptText("INVAILD COMMAND");
               
            }
        }
    }
    @FXML
    void MouseLeft(MouseEvent event) {
        lblClickToStart.setVisible(false);
    }
    @FXML
    void btnBackA(ActionEvent event) {
        try {
            MainApp.setRoot("Game", "IDLE SEA MINER");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    @FXML
    void Start(MouseEvent event) {
        txtField.setEditable(true);
        txtField.setStyle("-fx-text-fill: #00FF00;"+"-fx-background-color: transparent;");
        lblScreen.setText("Money: "+MainApp.money+"\nCommands:\nRequest\nDeadline\nQuota\nBack");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    

    }    
}

