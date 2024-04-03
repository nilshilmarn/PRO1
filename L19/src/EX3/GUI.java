package EX3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setTitle("Exercise 1");
        stage.setScene(scene);
        stage.show();


        personWindow = new PeronInputWindow("Person Information", stage);

    }

    private PeronInputWindow personWindow;

    private void initContent(GridPane pane)
    {
        /*
         * Layout
         * */

        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        /*
         * Labels
         * */

        Label lblPersons = new Label("Persons:");


        /*
         * Textareas
         * */

        TextArea txaPerson = new TextArea();

        // Settings

        txaPerson.setEditable(false);
        txaPerson.setPrefWidth(200);


        /*
         * Buttons
         * */

        Button btnPerson = new Button();
        btnPerson.setText("Add person");

        // Actions

        StringBuilder sbPerson = new StringBuilder();

        btnPerson.setOnAction(event ->
        {
            personWindow.showAndWait();


            if (personWindow.getActualPerson() != null)
            {
                Person person = personWindow.getActualPerson();

                txaPerson.setText(sbPerson.append(person.toString()).toString());
            }
        });


        /*
         * Placements
         * */

        pane.add(lblPersons, 0, 0);
        pane.add(txaPerson, 0, 1);
        pane.add(btnPerson, 0, 2);

    }
}
