package EX12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
         * Exercise 12
         * */
        int x = 20;
        int y = 180;
        int h = 81;

        drawTriangle(pane, x, y, h);
        drawInnerTriangles(pane, x, y, h);
        drawInnerTriangles(pane, x,y, h / 3);
        drawInnerTriangles(pane, x + h - h /3, y - h + h / 3 , h / 3);
        drawInnerTriangles(pane, x + h + h / 3, y, h / 3);
    }

    private void drawTriangle(Pane pane, int x, int y, int h)
    {
        Line a = new Line(x,y, x + 2 * h, y);
        Line b = new Line(x,y, x + h, y - h);
        Line c = new Line(x + h,y - h, x + 2 * h, y);

        pane.getChildren().addAll(a,b,c);
    }

    private void drawInnerTriangles(Pane pane, int x, int y, int h)
    {

        Line a = new Line(x + h / 3, y - h / 3, x + 2 * h / 3, y);
        Line b = new Line(x + 2 * h / 3, y - h + h / 3, x + h + h / 3, y - h + h / 3);
        Line c = new Line(x + h + h / 3, y, x + 2 * h - h / 3, y - h / 3);

        pane.getChildren().addAll(a,b,c);
    }


}
