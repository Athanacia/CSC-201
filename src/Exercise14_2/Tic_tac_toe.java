package Exercise14_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;


/**
 * Created by Gabriel on 4/16/2017.
 */
public class Tic_tac_toe extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tic-tac-toe");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Image O = new Image("/Exercise14_2/Images/X.png");
        Image X = new Image("/Exercise14_2/Images/O.png");
        Image Blank = new Image("/Exercise14_2/Images/Blank.png");
        int count = 0;
        int column = 0;
        int row = 0;
         do {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            switch (randomNum) {
                case 1: grid.add(new ImageView(O), column, row);
                break;
                case 2: grid.add(new ImageView(X), column, row);
                break;
                case 3: grid.add(new ImageView(Blank), column, row);
                break;
            }
            column++;
            if (column == 3) {
                row++;
                column = 0;
            }
            count++;
        } while(count < 9);

        primaryStage.setScene(new Scene(grid, 250, 250));
        primaryStage.show();


    }
}