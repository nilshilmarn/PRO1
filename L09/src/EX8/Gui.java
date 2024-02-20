package EX8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
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
         * Exercise 8
         * */

        for (int i = 0; i <= 10; i++)
        {

            int startPointX = 16 + i * 16;
            int endPointX = startPointX;

            int startPointY = 160 - 2 * i * 8;
            int endPointY = 80 - i * 8 ;

            Line line = new Line(startPointX, startPointY,endPointX, endPointY);

            pane.getChildren().add(line);

        }

    }
}
