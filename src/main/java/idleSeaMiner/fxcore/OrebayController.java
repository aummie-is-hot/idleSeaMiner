
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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
public class OrebayController implements Initializable {
    
      @FXML
    private Button btnBack;

    @FXML
    private Button btnConvert;

    @FXML
    private Button btnDump;

    @FXML
    private Button btnProcess;

    @FXML
    private Label lblCopper;

    @FXML
    private Label lblDiamond;

    @FXML
    private Label lblEmerld;

    @FXML
    private Label lblGold;

    @FXML
    private Label lblIron;

    @FXML
    private Label lblQuartz;

    @FXML
    private Label lblRuby;

    @FXML
    private ListView<String> lstV;
    int oreselected = 0;
    double copper = MainApp.copper;
    double iron = MainApp.iron;
    double quartz = MainApp.quartz;
    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(50), ae -> labelsetter()));

    void labelsetter(){
            lblCopper.setText("Copper: "+copper);
    lblQuartz.setText("Quartz: "+quartz);
    lblIron.setText("Iron: "+iron);
    }
    @FXML
    void BtnConvertA(ActionEvent event) {
//
    }

    @FXML
    void BtnDumpA(ActionEvent event) {
        // dumping the ore according to the oreselected value
        // add a slider to select the amount to dump
        if(btnDump.isVisible()){
            if(oreselected == 1 ){
                iron = iron-10;
            }
            if(oreselected == 2 ){
                copper = copper-10;
            }
            if(oreselected == 3 ){
                quartz = quartz-10;
            }
        }
    }

    @FXML
    void Clicked(MouseEvent event) {
        
        btnProcess.setVisible(true);
        btnDump.setVisible(true);
        btnConvert.setVisible(true);
        Label source= (Label) event.getSource();
       // giving each one its own number coresponding to the ore when clicked
        if (source == lblIron){
             oreselected=1;
        }
         if (source == lblCopper){
             oreselected=2;
        }
         if (source == lblQuartz){
             oreselected=3;
        }
       
    }

    @FXML
    void MouseEntered(MouseEvent event) {
        Label source= (Label) event.getSource();
        source.getStyleClass().add("Hover");
    }

    @FXML
    void MouseLeft(MouseEvent event) {
        Label source= (Label) event.getSource();
        source.getStyleClass().remove("Hover");
    }

    @FXML
    void btnBackA(ActionEvent event) {
        try {
            MainApp.setRoot("Game");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    void btnProcessA(ActionEvent event) {

    }
   @FXML
    void test(MouseEvent event) {
lblCopper.setText(lstV.getSelectionModel().getSelectedItem());
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        timeline.setCycleCount(Timeline.INDEFINITE);
timeline.play();
lstV.getItems().add("Iron Ore");
lstV.getItems().add("Copper Ore");
lstV.getItems().add("Rare Crystal");

    }    
}

