package EX1;

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
        * Exercise 1
        * */

        // c) Change the code, so all the arrowheads have twice the size.
        // Use variables to make it easy to change the size (both horizontally and vertically) of all
        // arrowheads (you can assume that all arrowheads have the same size)

        int sizeX = 50;
        int sizeY = sizeX / 2 - sizeX / 10;

        // a) Make an application that draws two arrowheads at (100,75) and (100,125).

        int x = 100;
        int y = 75;

        Line line1 = new Line(x, y, x + sizeX, y - sizeY);
        Line line2 = new Line(x, y, x + sizeX, y + sizeY);
        pane.getChildren().addAll(line1, line2);

        x = 100;
        y = 125;

        line1 = new Line(x, y, x + sizeX, y - sizeY);
        line2 = new Line(x, y, x + sizeX, y + sizeY);
        pane.getChildren().addAll(line1, line2);

        // b) Add some code to make the application show a third arrowhead at (20,50).

        x = 20;
        y = 50;

        line1 = new Line(x, y, x + sizeX, y - sizeY);
        line2 = new Line(x, y, x + sizeX, y + sizeY);
        pane.getChildren().addAll(line1, line2);




    }
}
