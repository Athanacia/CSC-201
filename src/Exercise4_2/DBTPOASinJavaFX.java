package Exercise4_2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DBTPOASinJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Tittle name
        primaryStage.setTitle("Calculator for distance on a Sphere");

        //Initializing gridpane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Adding object to the grid
        Button btn = new Button();
        grid.add(btn, 0, 4);

        Label EnterX = new Label("Enter X");
        GridPane.setHalignment(EnterX, HPos.CENTER);
        grid.add(EnterX, 1, 0);
        Label EnterY = new Label("Enter Y");
        GridPane.setHalignment(EnterY, HPos.CENTER);
        grid.add(EnterY, 2, 0);
        Label point1 = new Label("Enter point 1: ");
        grid.add(point1, 0, 1);
        Label point2 = new Label("Enter point 2: ");
        grid.add(point2, 0, 2);
        Label radiusText = new Label("Enter radius: ");
        grid.add(radiusText, 0, 3);
        Label result = new Label();
        grid.add(result, 1, 4);

        NumberTextField numberpointx1 = new NumberTextField();
        grid.add(numberpointx1, 1, 1);
        NumberTextField numberpointy1 = new NumberTextField();
        grid.add(numberpointy1, 2, 1);
        NumberTextField numberpointx2 = new NumberTextField();
        grid.add(numberpointx2, 1, 2);
        NumberTextField numberpointy2 = new NumberTextField();
        grid.add(numberpointy2, 2, 2);
        NumberTextField numberRadius = new NumberTextField();
        grid.add(numberRadius, 1, 3);

        //Initializing the button
        btn.setText("Add");
        btn.setOnAction(e-> {
                double x1 = Double.parseDouble(numberpointx1.getText());
                x1 = Math.toRadians(x1);
                double y1 = Double.parseDouble(numberpointy1.getText());
                y1 = Math.toRadians(y1);
                double x2 = Double.parseDouble(numberpointx2.getText());
                x2 = Math.toRadians(x2);
                double y2 = Double.parseDouble(numberpointy2.getText());
                y2 = Math.toRadians(y2);
                double radius = Double.parseDouble(numberRadius.getText());
                result.setText("The result is: " + Distance2Points(x1, y1, x2, y2, radius) + " km");
            });

        primaryStage.setScene(new Scene(grid, 500, 275));
        primaryStage.show();
    }

    //Method that has the formula for the distance
    private static double Distance2Points(double x1, double y1, double x2, double y2, double radius) {
        double total;
        total = radius * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        return total;
    }

    //Method to lock text field only for numbers
    public class NumberTextField extends TextField {
        @Override
        public void replaceText(int start, int end, String text) {
            if (validate(text)) {
                super.replaceText(start, end, text);
            }
        }
        @Override
        public void replaceSelection(String text) {
            if (validate(text)) {
                super.replaceSelection(text);
            }
        }
        private boolean validate(String text) {
            return text.matches("[0-9.0]*[-]?");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}