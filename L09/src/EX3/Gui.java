package EX3;

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
        * Exercise 3,1
        * */

        // Create an application like the one above, but this time with 9 lines and with a shared start point at
        // (100,100):

//        int startPointX = 20;
//        int startPointY = 200;
//
//        int endPointX = 20;
//        int endPointY = 20;
//
//        while (endPointX <= 180)
//        {
//            Line line = new Line(startPointX, startPointY,endPointX, endPointY);
//            pane.getChildren().add(line);
//            endPointX += 40;
//            startPointX += 40;
//        }

        /*
         * Exercise 3.2
         * */

//        int startPointX = 20;
//        int startPointY = 20;
//
//        int endPointX = 180;
//        int endPointY = 20;
//
//        while (endPointY <= 180)
//        {
//            Line line = new Line(startPointX, startPointY,endPointX, endPointY);
//            pane.getChildren().add(line);
//            startPointY += 40;
//            endPointY += 40;
//        }


        /*
         * Exercise 3.3
         * */

        int startPointX = 20;
        int startPointY = 180;

        int endPointX = 180;
        int endPointY = 180;

        while (endPointY >= 20)
        {
            Line line = new Line(startPointX, startPointY,endPointX, endPointY);
            pane.getChildren().add(line);
            endPointY -= 40;
            startPointY -= 40;
            startPointX += 17;
            endPointX -= 17;
        }





    }
}
