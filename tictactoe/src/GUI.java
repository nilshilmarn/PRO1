import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Random;

public class GUI extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }

    private Button[] buttons = new Button[10];
    private char player = 'X';
    private int turnCount = 0;
    private int[] winningConditions = {123, 456, 789, 147, 258, 369, 159, 357};
    private int[] playerMoves = new int[9]; // Tracks player moves

    private void initContent(GridPane pane)
    {
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        int j = 1;
        for (int i = 0; i < 9; i++)
        {
            Button button = new Button();
            button.setMinSize(100, 100);
            button.setStyle("-fx-font-size: 40px");

            int index = j;
            button.setOnAction(event -> controllerAction(button, index));
            buttons[j] = button;
            pane.add(button, i % 3, i / 3);
            j++;
        }

    }


    private void controllerAction(Button button, int index)
    {
        if (button.getText().isEmpty())
        {
            button.setText(String.valueOf(player));
            playerMoves[index - 1] = 1;

            if (won()) // check if won
            {
                System.out.println(player + " wins!");
            } else if (false) // check if draw
            {

            } else
            {
                player = (player == 'X') ? 'O' : 'X';
                if (player == 'O')
                {
                    // Computer move
                    computerMove();
                }
            }
        }
        turnCount++;
        System.out.println(Arrays.toString(playerMoves));
    }


    private boolean won()
    {
        for (int condition : winningConditions)
        {
            int count = 0;
            for (int i = 0; i < 3; i++)
            {
                int position = condition % 10;
                if (playerMoves[position - 1] == 1)
                {
                    count++;
                }
                condition /= 10;
            }
            if (count == 3)
            {
                return true;
            }
        }
        return false;
    }

    private void computerMove()
    {

        if (turnCount == 0 && buttons[5].getText().isEmpty())
        {
            buttons[5].fire();
        } else if (turnCount == 0 && buttons[1].getText().isEmpty())
        {
            buttons[1].fire();
        } else
        {

            for (int condition : winningConditions)
            {
                int count = 0;
                for (int i = 0; i < 3; i++)
                {
                    int position = condition % 10;
                    if (playerMoves[position - 1] == 1)
                    {
                        count++;
                    }
                    condition /= 10;
                }

            }


        }


    }


}