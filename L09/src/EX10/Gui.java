package EX10;

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
         * Exercise 10
         * */

        drawRing(pane, 50, 50);
        drawRing(pane, 150, 50);
        drawRing(pane, 50, 150);
        drawRing(pane, 150, 150);


    }

    private void drawRing(Pane pane, int x, int y)
    {

        int centerX = x;
        int centerY = y;

        Color ring = Color.BLACK;

        Circle outerRing = new Circle(x,y, 25);
        Circle innerRing = new Circle(x,y,20);
        Ellipse ruby = new Ellipse(x, y - 25, 10, 5);

        innerRing.setFill(Color.WHITE);
        outerRing.setFill(Color.GOLD);
        ruby.setFill(Color.RED);

        innerRing.setStroke(ring);
        outerRing.setStroke(ring);


        pane.getChildren().addAll(outerRing, innerRing, ruby); // Layers

    }



}
