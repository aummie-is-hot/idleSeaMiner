
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
public class ResearchBayController implements Initializable {
    
  @FXML
    private Circle ResearchPoint1;

    @FXML
    private Circle ResearchPoint111;

    @FXML
    private Circle ResearchPoint1111;

    @FXML
    private Circle ResearchPoint11111;

    @FXML
    private Circle ResearchPoint111111;

    @FXML
    private Circle ResearchPoint111112;

    @FXML
    private Circle ResearchPoint1111121;

    @FXML
    private Circle ResearchPoint1111122;

    @FXML
    private Circle ResearchPoint1111123;

    @FXML
    private Circle ResearchPoint1111124;

    @FXML
    private Circle ResearchPoint111113;

    @FXML
    private Circle ResearchPoint2;

    @FXML
    private Circle ResearchPoint3;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnSendDrones;

    @FXML
    private Label lblDrones;

    @FXML
    private Label lblMissionProgress;

    @FXML
    private Label lblResearchProgress;

    @FXML
    private Label lblResearchSpeed;

    @FXML
    private Label lblScientists;
    
    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(350), ae -> labelsetter()));
    void labelsetter(){



        
  
        lblResearchProgress.setText("Research Progress: "+MainApp.researchprogress);
    lblResearchSpeed.setText("Research Speed: "+MainApp.researchspeed);
    lblScientists.setText("Scientists: "+MainApp.scientists);
    lblDrones.setText("Drones: "+MainApp.drones);
   
    if (MainApp.missionprogress>100){
         lblMissionProgress.setText("Mission Progress: COMPLETE");
         btnBack.setDisable(false);
    }
    else{
         lblMissionProgress.setText("Mission Progress: "+String.format("%.2f", MainApp.missionprogress) );
    }
    }
    @FXML
    void BranchExit(MouseEvent event) {

    }


    @FXML
    void BranchHover1(MouseEvent event) {
        // add hover effect and sound effect when hovering over
        
    }

    @FXML
    void BranchHover2(MouseEvent event) {

    }

    @FXML
    void BranchHover3(MouseEvent event) {

    }

    @FXML
    void ResearchClicked(MouseEvent event) {

    }

    @FXML
    void ResearchClicked1(MouseEvent event) {

    }

    @FXML
    void ResearchClicked2(MouseEvent event) {

    }

    @FXML
    void ResearchClicked3(MouseEvent event) {

    }

    @FXML
    void btnBackA(ActionEvent event) {
        try {
            if (MainApp.missionprogress>0){
                
            }
            else{
                btnBack.setDisable(false);
            MainApp.setRoot("Game","IDLE SEA MINER");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
     @FXML
    void btnSendDronesA(ActionEvent event) {
        MainApp.mission = true;
        MainApp.missioncount += 1;
        btnSendDrones.setDisable(true);
       
    }
   
    // add scientist count more scientists = faster research and things unlocked like you need a certain amount to research an item. ADD a tree. Put the research tree in a computer screen
    // also add a hire scientist button or do it in the termial radio station request personel
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeline.setCycleCount(Timeline.INDEFINITE);
timeline.play();
    
    }    
}

