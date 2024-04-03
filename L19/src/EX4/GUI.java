package EX4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
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

        Label lblNames = new Label("Names:");
        Label lblName = new Label("Name:");

        /*
         * Listview
         * */

        ListView<String> listViewNames = new ListView<>();

        // Settings

        listViewNames.setPrefHeight(200);

        /*
         * ArrayList
         * */

        ArrayList<String> listNames = new ArrayList<>();

        /*
         * Textfields
         * */

        TextField txfName = new TextField();

        /*
         * Checkboxes
         * */

//        CheckBox cbSenior = new CheckBox();
//        cbSenior.setText("Senior");


        /*
         * Textareas
         * */

//        TextArea txaPerson = new TextArea();

        // Settings

//        txaPerson.setEditable(false);
//        txaPerson.setPrefWidth(200);

        /*
         * Dialogs
         * */

//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("Add person");


        /*
         * Buttons
         * */

        Button btnPerson = new Button();
        btnPerson.setText("Add");

        // Actions

        StringBuilder sbPerson = new StringBuilder();

        btnPerson.setOnAction(event ->
        {

            listNames.add(txfName.getText().trim());

            listViewNames.getItems().setAll(listNames);

        });


        /*
         * Placements
         * */

        pane.add(lblNames, 0, 0);
        pane.setValignment(lblNames, VPos.TOP);
        pane.add(listViewNames, 1, 0);
        pane.add(lblName, 0, 1);
        pane.add(txfName, 1, 1);
        pane.add(btnPerson, 2, 1);

    }
}
