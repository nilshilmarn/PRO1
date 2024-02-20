package EX5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
         * Exercise 5
         * */

        int startPointX = 20;
        int startPointY = 10;

        String str = "Datamatiker";

        int i = 0;

        while (i <= 11)
        {
            String subString = str.substring(0,i);
            Text text = new Text(startPointX, startPointY, subString);
            text.setFill(Color.BLACK);
            pane.getChildren().add(text);
            startPointY += 15;
            i++;
        }


    }
}
