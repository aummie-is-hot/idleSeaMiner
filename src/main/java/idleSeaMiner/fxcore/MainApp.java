
package idleSeaMiner.fxcore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import java.io.IOException;


import java.util.concurrent.ThreadLocalRandom;
public class MainApp extends Application {
    private static Stage stage;
    MediaPlayer player;
    static double iron = 0;
    static double quartz = 0;
    static double copper = 0;
    static double quota = 200;
    static double money = 150;
    static double oreworth = 0;
    static double deadline=5;
    static double researchspeed = 0.5;
    static double researchprogress = 0;
    static double scientists = 1;
    static int drones = 2;
    static double missionprogress = 0;
    static boolean mission = false;
    static int missioncount = 0;
     static double totalmoney;
    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(350), ae -> mission()));
    Timeline missioncheckertTimeline = new Timeline(new KeyFrame(Duration.millis(350), ae -> missionchecker()));
    void mission(){
Double rand = ThreadLocalRandom.current().nextDouble(0.1,5+1);
missionprogress = missionprogress+rand;
    }
     void missionchecker(){
        if(missioncount==3){
            deadline-=1;
        }
        totalmoney = money+copper+iron+quartz;
        if (totalmoney>=quota){
            deadline=5;
            
        }

         if (mission == true){
            timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

               
        }
        if(missionprogress >=100){
            mission = false;
            timeline.stop();
            missionprogress=0;
           
        // add random drones breaking or repair needed also add time so the days go down Make the timer in the game.fxml
        // random multipliers
            iron += ThreadLocalRandom.current().nextDouble(0,(drones*1.5)+5);
            quartz+= ThreadLocalRandom.current().nextDouble(0,(drones*1.2)+3);
            copper+=ThreadLocalRandom.current().nextDouble(0,(drones*1.6)+6);
        }
    }
    @Override
    public void start(@SuppressWarnings("exports") Stage s) throws IOException {
        stage=s;
        setRoot("MainMenu","Idle Sea Miner");
         player = new MediaPlayer((new Media(getClass().getResource("/backgroundmusic.mp3").toString())));
        player.setCycleCount(200000);
        player.setVolume(0.1);
        player.play();
        missioncheckertTimeline.setCycleCount(Timeline.INDEFINITE);
        missioncheckertTimeline.play();
        
    }

    static void setRoot(String fxml) throws IOException {
        setRoot(fxml,stage.getTitle());
    }

    static void setRoot(String fxml, String title) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
