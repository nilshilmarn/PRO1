package EX1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.w3c.dom.html.HTMLBaseElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class GUI extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Lecture 18");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfFirstName = new TextField();
    private final TextField txflastName = new TextField();
    private final TextField txfFullName = new TextField();
    private final TextField txfNumber = new TextField();
    private final TextField txfInvestment = new TextField();
    private final TextField txfYears = new TextField();
    private final TextField txfInterest = new TextField();
    private final TextField txfFutureValue = new TextField();
    private final TextField txfCelsius = new TextField();
    private final TextField txfFahrenheit = new TextField();
    private final TextField txfName = new TextField();
    private final TextArea txaNames = new TextArea();
    private StringBuilder sbNames = new StringBuilder();

    private void initContent(GridPane pane)
    {
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        // Titel
        Font fontBold = Font.font("Verdana", FontWeight.BOLD, 20);
        Text titel1 = new Text("Exercise 1");
        Text titel2 = new Text("Exercise 2");
        Text titel3 = new Text("Exercise 3");
        Text titel4 = new Text("Exercise 4");
        Text titel5 = new Text("Exercise 5");
        titel1.setFont(fontBold);
        titel2.setFont(fontBold);
        titel3.setFont(fontBold);
        titel4.setFont(fontBold);
        titel5.setFont(fontBold);
        pane.add(titel1, 0, 0);
        pane.add(titel2, 0, 5);
        pane.add(titel3, 0, 9);
        pane.add(titel4, 0, 15);
        pane.add(titel5, 0, 18);


        // First name
        Label lblFistName = new Label("First name:");
        pane.add(lblFistName, 0, 1);
        pane.add(txfFirstName, 0, 2);
        txfFirstName.setPromptText("Nils");

        // Last naem
        Label lblLastName = new Label("Last name:");
        pane.add(lblLastName, 1, 1);
        pane.add(txflastName, 1, 2);
        txflastName.setPromptText("Hilmar");

        // Full name
        Label lblFullName = new Label("Full name:");
        txfFullName.setEditable(false);
        txfFullName.setFocusTraversable(false);
        txfFullName.setMouseTransparent(true);
        pane.add(lblFullName, 0, 3);
        pane.add(txfFullName, 0, 4, 2, 1);


        // Number
        Label lblNumber = new Label("Number:");
        pane.add(lblNumber, 0, 6);
        pane.add(txfNumber, 0, 7, 1, 2);
        txfNumber.setText(Integer.toString(0));
        txfNumber.setEditable(false);
        txfNumber.setFocusTraversable(false);
        txfNumber.setMouseTransparent(true);

        // Investment
        Label lblInvestment = new Label("Investment:");
        Text unitInvestment = new Text("DKK");
        pane.add(lblInvestment, 0, 10);
        pane.add(txfInvestment, 1, 10);
        pane.add(unitInvestment, 2, 10);
        txfInvestment.setPromptText("1000");

        // Years
        Label lblYears = new Label("Years:");
        Text unitYears = new Text("Years");
        pane.add(lblYears, 0, 11);
        pane.add(txfYears, 1, 11);
        pane.add(unitYears, 2, 11);
        txfYears.setPromptText("5");

        // Interest
        Label lblInterest = new Label("Interest:");
        Text unitInterest = new Text("%");
        pane.add(lblInterest, 0, 12);
        pane.add(txfInterest, 1, 12);
        pane.add(unitInterest, 2, 12);
        txfInterest.setPromptText("7");

        // Future value
        Label lblFutureValue = new Label("Future Value:");
        pane.add(lblFutureValue, 0, 14);
        pane.add(txfFutureValue, 1, 14);
        txfFutureValue.setEditable(false);
        txfFutureValue.setFocusTraversable(false);
        txfFutureValue.setMouseTransparent(true);

        // Celcius
        Label lblCelcius = new Label("Celcisus:");
        Text unitCelcius = new Text("°C");
        pane.add(lblCelcius, 0, 16);
        pane.add(txfCelsius, 1, 16);
        pane.add(unitCelcius, 2, 16);


        // Fahrenheit
        Label lblFahrenheit = new Label("Fahrenheit:");
        Text unitFahreheit = new Text("°F");
        pane.add(lblFahrenheit, 0, 17);
        pane.add(txfFahrenheit, 1, 17);
        pane.add(unitFahreheit, 2, 17);

        // Name
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 19);
        pane.add(txfName, 0, 20);

        // Names Textarea
        pane.add(txaNames, 0, 22);
        txaNames.setEditable(false);
        txaNames.setFocusTraversable(false);
        txaNames.setMouseTransparent(true);


        /**
         * Buttons
         * */

        // Combine
        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 2, 4);
        btnCombine.setOnAction(event -> this.combineAction());
        btnCombine.setDefaultButton(true);

        // Increment / Decrement
        Button btnIncrement = new Button("+");
        Button btnDecrement = new Button("-");
        pane.add(btnIncrement, 1, 7);
        pane.add(btnDecrement, 1, 8);
        btnIncrement.setPrefWidth(25);
        btnDecrement.setPrefWidth(25);
        btnIncrement.setOnAction(event -> this.incrementAction());
        btnDecrement.setOnAction(event -> this.decrementAction());


        // Calculate
        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 1, 13);
        btnCalculate.setOnAction(event -> this.calculateAction());

        // ConvertToCelcius
        Button btnConvertToCelcius = new Button("Convert to C");
        pane.add(btnConvertToCelcius, 3, 17);
        btnConvertToCelcius.setOnAction(event -> this.convertToCelciusAction());

        // ConvertToFahrenheit
        Button btnConvertToFahrenheit = new Button("Convert to F");
        pane.add(btnConvertToFahrenheit, 3, 16);
        btnConvertToFahrenheit.setOnAction(event -> this.convertToFahrenheitAction());

        // AddName
        Button btnAddName = new Button("Add");
        pane.add(btnAddName, 0, 21);
        btnAddName.setOnAction(event -> this.fillAction());

    }

    private void combineAction()
    {
        String firstName = txfFirstName.getText().trim();
        String lastName = txflastName.getText().trim();

        txfFullName.setText(firstName + " " + lastName);
    }

    private void incrementAction()
    {
        int number = Integer.parseInt(txfNumber.getText().trim());
        number++;
        txfNumber.setText(Integer.toString(number));
    }

    private void decrementAction()
    {
        int number = Integer.parseInt(txfNumber.getText().trim());
        number--;
        txfNumber.setText(Integer.toString(number));
    }

    private void calculateAction()
    {
        double investment = Double.parseDouble(txfInvestment.getText().trim());
        int years = Integer.parseInt(txfYears.getText().trim());
        double interest = Double.parseDouble(txfInterest.getText().trim());

        double futureValueDouble = (double) investment * Math.pow(1 + interest / 100, years);

        String futureValueString = String.format("%.2f DKK", futureValueDouble);

        txfFutureValue.setText(futureValueString);

    }

    private void convertToCelciusAction()
    {

        double fahrenheit = Integer.parseInt(txfFahrenheit.getText().trim());

        double celcius = fahrenheit / (9 / 5) - 32;

        txfCelsius.setText(Double.toString(celcius));

    }

    private void convertToFahrenheitAction()
    {

        double celcius = Integer.parseInt(txfCelsius.getText().trim());

        double fahrenheit = celcius * (9 / 5) + 32;

        txfFahrenheit.setText(Double.toString(fahrenheit));

    }

    private void fillAction()
    {
        txaNames.setText(this.addNameAction());
    }

    private String addNameAction()
    {
        sbNames.append(txfName.getText().trim() + "\n");

        return sbNames.toString();
    }


}
