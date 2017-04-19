package Exercise15_1.Images;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Gabriel on 4/17/2017.
 */
public class Exercise15_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random 4 Cards");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button button = new Button("Refresh");
        grid.add(button, 1, 1, 2, 1);
        GridPane.setHalignment(button, HPos.CENTER);

        ArrayList<Image> FiftyTwoCards = new ArrayList<Image>();

        for(int i = 1; i < 53; i++) {
            FiftyTwoCards.add(new Image("/Exercise15_1/Images/0 (" + i + ").png", 200, 300, false, false));
        }

        Collections.shuffle(FiftyTwoCards);

        ImageView Card1 = new ImageView(FiftyTwoCards.get(0));
        ImageView Card2 = new ImageView(FiftyTwoCards.get(1));
        ImageView Card3 = new ImageView(FiftyTwoCards.get(2));
        ImageView Card4 = new ImageView(FiftyTwoCards.get(3));

        grid.add(Card1, 0, 0);
        grid.add(Card2, 1, 0);
        grid.add(Card3, 2, 0);
        grid.add(Card4, 3, 0);

        button.setOnAction(e-> {
            Collections.shuffle(FiftyTwoCards);
            Card1.setImage(FiftyTwoCards.get(0));
            Card2.setImage(FiftyTwoCards.get(1));
            Card3.setImage(FiftyTwoCards.get(2));
            Card4.setImage(FiftyTwoCards.get(3));
        });
        primaryStage.setScene(new Scene(grid, 900, 340));
        primaryStage.show();
    }
    public static void main(String[] args) {launch(args);}
}
