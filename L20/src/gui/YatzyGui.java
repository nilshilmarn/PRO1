package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.YatzyDice;

import java.util.ArrayList;

public class YatzyGui extends Application
{
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage)
    {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // txfValues shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // cbxHolds shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // txfResults shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final ArrayList<TextField> txfResults = new ArrayList<>(15);
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField();
    private final TextField txfBonus = new TextField();
    private final TextField txfSumOther = new TextField();
    private final TextField txfTotal = new TextField();
    private final Button btnThrow = new Button(" Throw ");

    private void initContent(GridPane pane)
    {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");

        // ---------------------------------------------------------------------

        /*
         * Top Section - Dice
         * */

        // Layout constants
        int width = 75;
        int height = 75;


        // Creating a horizontal box
        HBox container = new HBox();
        container.setSpacing(10);
        dicePane.add(container, 0, 0);


        // Creating 5 dice, checkboxes and vertical boxes
        for (int i = 0; i < txfValues.length; i++)
        {
            // Dice
            txfValues[i] = new TextField();
            setTextFieldProperties(txfValues[i], 75, 75, false, false, true, true);
            txfValues[i].setAlignment(Pos.CENTER);

            // Checkboxes
            cbxHolds[i] = new CheckBox("Hold");
            cbxHolds[i].setDisable(true);

            // Vertical boxes for containg a die and checkbox
            VBox vBox = new VBox();
            vBox.setAlignment(Pos.CENTER);
            vBox.getChildren().addAll(txfValues[i], cbxHolds[i]);
            vBox.setSpacing(10);

            // Adding the verical box to the container (horizontal box)
            container.getChildren().add(vBox);
        }

        // The button throw
        dicePane.add(btnThrow, 0, 1);
        btnThrow.setOnAction(event -> btnThrowOnAction());

        /*
         * Bottom Sections - Score
         * */

        // Layout constants and properties
        width = 50;
        height = 20;

        setTextFieldProperties(txfSumSame, height, width, false, false, true, true);
        setTextFieldProperties(txfBonus, height, width, false, false, true, true);
        setTextFieldProperties(txfTotal, height, width, false, false, true, true);

        // Array containing labels for all possible score options
        String lblnames[] = {"1-s", "2-s", "3-s", "4-s", "5-s", "6-s", "One Pair", "Two Pairs", "Three-same", "Four-same", "Full House", "Small Str.", "Large Str.", "Chance", "Yatzy"};

        for (int i = 0; i < lblnames.length; i++)
        {
            TextField textField = new TextField();
            txfResults.add(textField);

            Label label = new Label(lblnames[i]);
            int column = (i < 6) ? 0 : 2;
            int row = (i < 6) ? i : i - 6;

            scorePane.add(label, column, row);
            scorePane.add(textField, column + 1, row);

            if (i == 5)
            {
                scorePane.add(new Label("Sum"), 0, i + 1);
                scorePane.add(new Label("Bonus"), 0, i + 2);
                scorePane.add(txfSumSame, 1, i + 1);
                scorePane.add(txfBonus, 1, i + 2);
            } else if (i == 14)
            {
                scorePane.add(new Label("Total"), 2, i - 5);
                scorePane.add(txfTotal, 3, i - 5);
            }

            setTextFieldProperties(textField, height, width, false, false, false, false);
            textField.setStyle("-fx-text-box-border: transparent");
        }

    }

    private void btnThrowOnAction()
    {

        // Only throw the dice that arent hold
        dice.throwDice(holdStatus());

        // Making the checkbox available after the first throw
        if (dice.getThrowCount() == 1)
        {
            setHoldStatus(false);
        }


        // Ensures player cant throw more than 3 times
        if (dice.getThrowCount() == 3)
        {
            btnThrow.setDisable(true);
            setHoldStatus(true);
        }

        // Displaying the new dice values
        for (int i = 0; i < dice.getValues().length; i++)
        {
            txfValues[i].setText(String.valueOf(dice.getValues()[i]));
        }

        // Displaying how many times the player have thrown the dice
        btnThrow.setText("Throw " + dice.getThrowCount());

        // Helper methods
        printTextFieldValues();
        onMouseClick();

    }

    private void setHoldStatus()
    {
        for (CheckBox cbx : cbxHolds)
        {
            if (cbx.isSelected())
            {
                cbx.setDisable(true);
            }
        }
    }


    private boolean[] holdStatus()
    {
        boolean[] holdStatus = new boolean[5];

        for (int i = 0; i < cbxHolds.length; i++)
        {
            holdStatus[i] = cbxHolds[i].isSelected();
            if (cbxHolds[i].isSelected())
            {
                cbxHolds[i].setDisable(true);
            }
        }
        return holdStatus;
    }

    private void printTextFieldValues()
    {
        for (int i = 0; i < txfResults.size(); i++)
        {
            if (!txfResults.get(i).isDisabled())
            {
                txfResults.get(i).setText(String.valueOf(dice.getResults()[i + 1]));

                if (Integer.parseInt(txfResults.get(i).getText()) != 0)
                {
                    txfResults.get(i).setStyle("-fx-control-inner-background: yellow");
                } else
                {
                    txfResults.get(i).setStyle("-fx-control-inner-background: white");
                }

            }

        }
    }


    private void onMouseClick()
    {
        for (TextField txf : txfResults)
        {
            txf.setOnMouseClicked(event ->
            {
                TextField result = (TextField) event.getSource();
                if (dice.getThrowCount() > 0)
                {
                    result.setDisable(true);
                }
                resetTextFieldValues();
                saveResult();
                setHoldStatus(true);
                btnThrow.setText("Throw");
                btnThrow.setDisable(false);
                resetDice();
                dice.resetThrowCount();
                resetGame();
            });
        }

    }


    private void setHoldStatus(boolean status)
    {
        for (CheckBox cbx : cbxHolds)
        {
            cbx.setDisable(status);

            if (status)
            {
                cbx.setSelected(false);
            }

        }
    }

    private void resetDice()
    {
        for (TextField values : txfValues)
        {
            values.setText("");
        }
    }


    private void resetTextFieldValues()
    {
        for (TextField txf : txfResults)
        {
            if (!txf.isDisabled())
            {
                txf.setText("");
            }

            txf.setStyle("-fx-control-inner-background: white");
        }
    }


    private void saveResult()
    {
        int total = 0;
        int leftTotal = 0;

        for (int i = 0; i < txfResults.size(); i++)
        {
            if (txfResults.get(i).isDisabled())
            {
                if (i < 6)
                {
                    leftTotal += Integer.parseInt(txfResults.get(i).getText());

                    if (leftTotal >= 63) // Bonus
                    {
                        total += 50;
                        txfBonus.setText("50");
                    }
                }
                total += Integer.parseInt(txfResults.get(i).getText());
            }
        }
        txfSumSame.setText(Integer.toString(leftTotal));
        txfTotal.setText(Integer.toString(total));
    }

    private void resetGame()
    {
        int resetGame = 0;

        for (TextField txf : txfResults)
        {
            if (txf.isDisabled())
            {
                resetGame++;
            }
        }

        if (resetGame == 15)
        {
            for (TextField txf : txfResults)
            {
                txf.setText("");
                txf.setDisable(false);
            }
        }
    }

    private void setTextFieldProperties(TextField textField, int height, int width, boolean editable, boolean focusTraversable, boolean mouseTransparent, boolean border)
    {
        textField.setPrefSize(width, height);
        textField.setEditable(editable);
        textField.setFocusTraversable(focusTraversable);
        textField.setMouseTransparent(mouseTransparent);
        if (!border)
        {
            textField.setStyle("-fx-text-box-border: transparent");
        }
    }


}
