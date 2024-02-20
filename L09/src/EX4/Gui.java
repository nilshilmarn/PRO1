package EX4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

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
        pane.setPrefSize(800, 800); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {


//        /*
//        * Exercise 4.1
//        * */
//
//        int centerX = 100;
//        int centerY = 100;
//        int radius = 100;
//
//        while (radius >= 20)
//        {
//            Circle circle = new Circle(centerX, centerY, radius);
//            circle.setStroke(Color.BLACK);
//            circle.setFill(null);
//            pane.getChildren().add(circle);
//            radius -= 20;
//
//        }

        /*
         * Exercise 4.2
         * */

//        int centerX = 100;
//        int centerY = 100;
//        int radius = 80;
//
//        while (radius >= 10)
//        {
//            Circle circle = new Circle(centerX, centerY, radius);
//            circle.setStroke(Color.BLACK);
//            circle.setFill(null);
//            pane.getChildren().add(circle);
//            centerX -= 10;
//            radius -= 10;
//
//        }


        /*
         * Exercise 4.3
         * */

        int centerX = 100;
        int centerY = 100;
        int width = 20;
        int height = 40;

        while (width <= 90)
        {
            Ellipse circle = new Ellipse(centerX, centerY, width, height);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            width += 10;

        }




    }
}
