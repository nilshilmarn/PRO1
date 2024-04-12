package exarch.gui;

import exarch.controller.Controller;
import exarch.model.Company;
import exarch.model.Employee;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class EmployeeWindow extends Stage
{
    private final Employee employee; // nullable

    /**
     * Note: Nullable param company.
     */
    public EmployeeWindow(String title, Employee employee)
    {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.employee = employee;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfWage = new TextField();
    private final CheckBox cbxCompany = new CheckBox();
    private final ChoiceBox cbHours = new ChoiceBox<>();
    private final Label lblError = new Label();

    private void initContent(GridPane pane)
    {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblName = new Label("Name");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 0, 1);
        txfName.setPrefWidth(200);

        Label lblWage = new Label("Hourly Wage");
        pane.add(lblWage, 0, 2);

        pane.add(txfWage, 0, 3);

        cbxCompany.setText("Company");
        pane.add(cbxCompany, 0, 4);
        cbxCompany.setOnAction(event ->
        {
            if (cbxCompany.isSelected())
            {
                cbHours.setDisable(false);
            } else
            {
                cbHours.setDisable(true);
            }

        });

        pane.add(cbHours, 0, 5);
        cbHours.getItems().addAll(Controller.getCompanies());
        cbHours.getSelectionModel().selectFirst();
        if (!cbxCompany.isSelected())
        {
            cbHours.setDisable(true);
        }

        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 0, 6);
        GridPane.setHalignment(btnCancel, HPos.LEFT);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        pane.add(btnOK, 0, 6);
        GridPane.setHalignment(btnOK, HPos.RIGHT);
        btnOK.setOnAction(event -> this.okAction());

        pane.add(lblError, 0, 7);
        lblError.setStyle("-fx-text-fill: red");

    }

    private void cancelAction()
    {
        this.hide();
    }

    private void okAction()
    {
        String name = txfName.getText().trim();
        if (name.length() == 0)
        {
            lblError.setText("Name is empty");
            return;
        }

        int wage = -1;
        try
        {
            wage = Integer.parseInt(txfWage.getText().trim());
        } catch (NumberFormatException ex)
        {
            // do nothing
        }
        if (wage < 0)
        {
            lblError.setText("Hours is not a positive number");
            return;
        }

        if (employee != null)
        {
            var company = (Company) cbHours.getSelectionModel().getSelectedItem();
            // update existing employee
            if (cbxCompany.isSelected())
            {
                Controller.addEmployeeToCompany(company, employee);
                Controller.updateEmployee(employee, name, wage, company);
            } else
            {
                Controller.removeEmployeeFromCompany(employee);
                Controller.updateEmployee(employee, name, wage, null);
            }

        } else
        {
            // create new employee
            Employee employee = Controller.createEmployee(name, wage);

            if (cbxCompany.isSelected())
            {
                Controller.addEmployeeToCompany((Company) cbHours.getSelectionModel().getSelectedItem(), employee);
            }

        }


        this.hide();
    }

}
