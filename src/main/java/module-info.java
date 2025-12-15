
module idleSeaMiner.fxcore {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    opens idleSeaMiner.fxcore to javafx.fxml;
    exports idleSeaMiner.fxcore;
}
