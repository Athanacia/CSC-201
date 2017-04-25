package Unit_5_Test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.io.File;

/**
 * Created by Gabriel on 4/25/2017.
 */
public class buttons_3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("3 Buttons");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        GridPane grid2 = new GridPane();
        grid2.setAlignment(Pos.CENTER);
        grid2.setHgap(5.5);
        grid2.setVgap(5.5);
        grid2.setPadding(new Insets(25, 25, 25, 25));

        Media music = new Media("http://66.90.93.122/ost/touhou-bunkachou-shoot-the-bullet/wrfhfhvmlx/-01-tengu-no-techou-mysterious-note.mp3");

        Button PlayBtn = new Button("Play");
        Button LoopBtn = new Button("Loop");
        Button StopBtn = new Button("Stop");

        MediaPlayer mediaPlayer = new MediaPlayer(music);

        PlayBtn.setOnAction(e-> {
            mediaPlayer.play();
        });

        StopBtn.setOnAction(e-> {
            mediaPlayer.stop();
        });

        LoopBtn.setOnAction(e-> {
                mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        });

        grid.add(PlayBtn, 0, 0);
        grid.add(LoopBtn, 1, 0);
        grid.add(StopBtn, 2, 0);

        primaryStage.setScene(new Scene(grid, 200, 50));
        primaryStage.setScene(new Scene(grid2, 500, 500));
        primaryStage.show();

    }


}