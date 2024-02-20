package EX9;

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
        pane.setPrefSize(200, 200); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {


        /*
         * Exercise 9
         * */

        int startPointX = 5;
        int startPointY = 100;

        int endPointX = 190;
        int endPointY = 100;

        int x = endPointX - startPointX; // 185

        int top = x / 5;
        int bottom = x / 2;

        while (endPointX >= startPointX)
        {
            Line line = new Line(endPointX, endPointY, endPointX, endPointY - top);
            Line line2 = new Line(endPointX, endPointY, endPointX, endPointY + bottom);

            endPointX *= 0.75;
            top *= 0.75;
            bottom *= 0.75;

            pane.getChildren().addAll(line, line2);
        }



    }
}
