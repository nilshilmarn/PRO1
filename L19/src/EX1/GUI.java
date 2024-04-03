package EX1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

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
    }


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

        Label lblName = new Label("Name:");
        Label lblTitle = new Label("Title:");
        Label lblPersons = new Label("Persons:");

        /*
         * Textfields
         * */

        TextField txfName = new TextField();
        TextField txfTitle = new TextField();

        /*
         * Checkboxes
         * */

        CheckBox cbSenior = new CheckBox();
        cbSenior.setText("Senior");


        /*
         * Textareas
         * */

        TextArea txaPerson = new TextArea();

        // Settings

        txaPerson.setEditable(false);
        txaPerson.setPrefWidth(200);

        /*
         * Dialogs
         * */

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Add person");


        /*
         * Buttons
         * */

        Button btnPerson = new Button();
        btnPerson.setText("Add person");

        // Actions

        StringBuilder sbPerson = new StringBuilder();

        btnPerson.setOnAction(event ->
        {
            if (txfName.getText().isEmpty())
            {
                alert.setHeaderText("Please enter a name");
                alert.setContentText("Type the name of the person");
                alert.show();
            } else if (txfTitle.getText().isEmpty())
            {
                alert.setHeaderText("Please enter a title");
                alert.setContentText("Type the title of the person");
                alert.show();
            } else
            {
                txaPerson.setText(sbPerson.append(new Person(txfName.getText(), txfTitle.getText(), cbSenior.isSelected()).toString()).toString());
            }
        });


        /*
         * Placements
         * */

        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);
        pane.add(lblTitle, 0, 1);
        pane.add(txfTitle, 1, 1);
        pane.add(cbSenior, 1, 2);
        pane.add(btnPerson, 3, 2);
        pane.add(txaPerson, 1, 3);

    }
}
