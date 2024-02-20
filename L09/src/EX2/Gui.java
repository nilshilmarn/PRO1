package EX2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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
        pane.setPrefSize(800, 800); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {


        /*
        * Exercise 2
        * */

        // Create an application like the one above, but this time with 9 lines and with a shared start point at
        // (100,100):

        int startPointX = 100;
        int startPointY = 100;

        int endPointX = 0;
        int endPointY = 0;

        while (endPointX <= 180)
        {
            Line line = new Line(startPointX, startPointY,endPointX, endPointY);
            pane.getChildren().add(line);
            endPointX += 20;
        }





    }
}
