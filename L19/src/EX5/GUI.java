package EX5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

        ArrayList<String> listNamesBoys = new ArrayList<>();
        ArrayList<String> listNamesGirls = new ArrayList<>();


        /*
         * Textfields
         * */

        TextField txfName = new TextField();

        /*
         * Checkboxes
         * */


        // Settings




        /*
         * Radio buttons
         * */

        // Toggle Group
        ToggleGroup groupGenders = new ToggleGroup();

        // Horizontal Box
        HBox box = new HBox();

        // Options
        String[] genders = {"Boy", "Girl"};

        for (int i = 0; i < genders.length; i++)
        {
            RadioButton rb = new RadioButton();

            box.getChildren().add(rb);
            rb.setText(genders[i]);
            // make the radio button remember its own color
            rb.setUserData(genders[i]);
            // ensure that only one radio button is in selected state
            rb.setToggleGroup(groupGenders);

        }

        // Default radio button

        RadioButton rbBoy = (RadioButton) groupGenders.getToggles().get(0);
        rbBoy.setSelected(true);


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


        /*
         * Actions
         * */


        btnPerson.setOnAction(event ->
        {
            RadioButton selectedRadioButton = (RadioButton) groupGenders.getSelectedToggle();
            String gender = selectedRadioButton.getUserData().toString();
            String name = txfName.getText().trim();

            System.out.println(gender);
            // Boy
            if (gender.equals("Boy"))
            {
                listNamesBoys.add(name);
                listViewNames.getItems().setAll(listNamesBoys);
            } else if (gender.equals("Girl"))
            {
                listNamesGirls.add(name);
                listViewNames.getItems().setAll(listNamesGirls);
            }
        });

        groupGenders.selectedToggleProperty().addListener((observable, oldValue, newValue) ->
        {
            RadioButton selectedRadioButton = (RadioButton) newValue;
            String gender = selectedRadioButton.getUserData().toString();

            if (gender.equals("Boy"))
            {
                listViewNames.getItems().setAll(listNamesBoys);
            } else if (gender.equals("Girl"))
            {
                listViewNames.getItems().setAll(listNamesGirls);
            }
        });


        /*
         * Placements
         * */

        pane.add(box, 1, 0);
        pane.add(lblNames, 0, 1);
        pane.setValignment(lblNames, VPos.TOP);
        pane.add(listViewNames, 1, 1);
        pane.add(lblName, 0, 2);
        pane.add(txfName, 1, 2);
        pane.add(btnPerson, 2, 2);

    }
}
