package EX11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {


        /*
         * Exercise 11
         * */


        int centerX = 50;
        int centerY = 100;
        int radius = 40;


        while (centerX <= 150) {

            Circle circle = new Circle(centerX, centerY, radius);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);

            pane.getChildren().add(circle);

            drawCrosses(pane, centerX, centerY);

            centerX += 25; // Move circles from 50 -> 150
        }
    }


    private void drawCrosses(Pane pane, int x, int y)
    {

        int centerX = x;
        int centerY = y;
        int sizeW = 5;

        Line lineHorizontal = new Line(centerX - sizeW, centerY, centerX + sizeW, centerY);
        Line lineVertical = new Line(centerX, centerY - sizeW, centerX, centerY + sizeW);

        pane.getChildren().addAll(lineHorizontal, lineVertical);

    }

}
