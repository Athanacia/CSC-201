package Unit_5_Test;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by Gabriel on 4/25/2017.
 */
public class AnimationWithAudio extends Application {

    MediaPlayer player = new MediaPlayer(new Media("http://66.90.93.122/ost/touhou-bunkachou-shoot-the-bullet/wrfhfhvmlx/-01-tengu-no-techou-mysterious-note.mp3"));

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Animation with music");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Label
        grid.add(new Label("Enter Information for animation"), 0, 2);
        grid.add(new Label("Animation Speed in Milliseconds"), 0, 3);
        grid.add(new Label("Image File prefix"), 0, 4);
        grid.add(new Label("Number of images"), 0, 5);
        grid.add(new Label("Audio File URL"), 0, 6);

        //TextFields
        TextField milliSeconds = new TextField("500");
        milliSeconds.setPrefWidth(400);
        TextField prefix = new TextField("A");
        TextField NumberofImages = new TextField("1");
        TextField AudioURL = new TextField("http://66.90.93.122/ost/touhou-bunkachou-shoot-the-bullet/wrfhfhvmlx/-01-tengu-no-techou-mysterious-note.mp3");

        grid.add(milliSeconds, 1, 3);
        grid.add(prefix, 1, 4);
        grid.add(NumberofImages, 1, 5);
        grid.add(AudioURL, 1, 6);

        //Button
        Button StartAnimation = new Button("Start Animation");
        grid.add(StartAnimation, 0, 0, 2, 1);
        GridPane.setHalignment(StartAnimation, HPos.RIGHT);

        //Image
        Image image = new Image("Unit_5_Test/Images/A1.png", 50, 50, false, false);
        ImageView imageView = new ImageView(image);
        grid.add(imageView, 0, 1, 2, 1);
        GridPane.setHalignment(imageView, HPos.CENTER);

        //Animation path
        Line Linepath = new Line(0, 0, 50, 0);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setPath(Linepath);
        pathTransition.setNode(imageView);
        pathTransition.setDuration(Duration.millis(500));
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);

        StartAnimation.setOnAction(e -> {
            pathTransition.stop();
            player.stop();
            player.dispose();
            String PREFIX = prefix.getText();
            String NUMBEROFIMAGES = NumberofImages.getText();
            imageView.setImage(new Image("Unit_5_Test/Images/" + PREFIX + NUMBEROFIMAGES + ".png", 50, 50, false, false));
            pathTransition.setDuration(Duration.millis(Double.parseDouble(milliSeconds.getText())));
            pathTransition.play();
            player = new MediaPlayer(new Media(AudioURL.getText()));
            player.play();

        });

        primaryStage.setScene(new Scene(grid, 800, 300));
        primaryStage.show();

    }
    void setMediaControl (MediaPlayer mediaPlayer, String URL) {
        MediaPlayer music = new MediaPlayer(new Media(URL));
    }
}
