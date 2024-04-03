package EX3;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PeronInputWindow extends Stage
{
    public PeronInputWindow(String title, Stage owner)
    {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private Person actualPerson = null;

    public Person getActualPerson()
    {
        return actualPerson;
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
         * Buttons
         * */

        Button btnCancel = new Button();
        Button btnOk = new Button();
        btnCancel.setText("Cancel");
        btnOk.setText("Ok");

        // Actions

        btnOk.setOnAction(event ->
        {
            String actor = txfName.getText().trim();
            String title = txfTitle.getText().trim();
            boolean senior = cbSenior.isSelected();

            actualPerson = new Person(title, actor, senior);
            txfName.clear();
            txfTitle.clear();
            cbSenior.setSelected(false);
            txfName.requestFocus();
            this.hide();

        });

        btnCancel.setOnAction(event ->
        {
            txfName.clear();
            txfTitle.clear();
            cbSenior.setSelected(false);
            txfName.requestFocus();
            actualPerson = null;
            this.hide();
        });


        /*
         * Placements
         * */

        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);
        pane.add(lblTitle, 0, 1);
        pane.add(txfTitle, 1, 1);
        pane.add(cbSenior, 1, 2);
        pane.add(btnCancel, 1, 3);
        pane.add(btnOk, 2, 3);
    }

}
