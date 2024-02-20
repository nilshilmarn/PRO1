package EX6;

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
        pane.setPrefSize(800, 800); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {


        /*
         * Exercise 6
         * */

        int startPointX = 0;
        int endPointX = 230;

        int startPointY = 180;
        int endPointY = 180;


        for (int i = 0; i < 11; i++)
        {
            int size = 5;
            int x = 10 + i * 20;

            if ( i % 5 == 0)
            {
                size = 10;

                String[] numbers = {"0","5","10"};

                Text text = new Text(x, startPointY + 20, numbers[i / 5]);
                text.setFill(Color.BLACK);
                pane.getChildren().add(text);
            }

            Line line = new Line(x, startPointY + size, x, endPointY - size);
            pane.getChildren().add(line);
        }








        Line line = new Line(startPointX, startPointY, endPointX, endPointY);
        pane.getChildren().add(line);

        Line line1 = new Line(endPointX, endPointY, endPointX - 4, endPointY - 4);
        Line line2 = new Line(endPointX, endPointY, endPointX - 4, endPointY + 4);
        pane.getChildren().addAll(line1, line2);




    }
}
