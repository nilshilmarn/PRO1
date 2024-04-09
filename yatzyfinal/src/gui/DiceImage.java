package gui;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DiceImage
{

    public static Image imageDice1;
    public static Image imageDice2;
    public static Image imageDice3;
    public static Image imageDice4;
    public static Image imageDice5;
    public static Image imageDice6;
    public static Image gifImage1;
    public static Image gifImage2;
    public static Image gifImage3;
    public static Image gifImage4;
    public static Image gifImage5;
    public static Image gifImage6;
    public static Image y1Image;
    public static Image aImage;
    public static Image tImage;
    public static Image zImage;
    public static Image y2Image;

    public DiceImage() throws FileNotFoundException
    {

        FileInputStream y1 = new FileInputStream("./yatzyfinal/src/resources/y1.png");
        FileInputStream a = new FileInputStream("./yatzyfinal/src/resources/a.png");
        FileInputStream t = new FileInputStream("./yatzyfinal/src/resources/t.png");
        FileInputStream z = new FileInputStream("./yatzyfinal/src/resources/z.png");
        FileInputStream y2 = new FileInputStream("./yatzyfinal/src/resources/y2.png");
        y1Image = new Image(y1);
        aImage = new Image(a);
        tImage = new Image(t);
        zImage = new Image(z);
        y2Image = new Image(y2);

        FileInputStream dice1 = new FileInputStream("./yatzyfinal/src/resources/dice1.png");
        FileInputStream dice2 = new FileInputStream("./yatzyfinal/src/resources/dice2.png");
        FileInputStream dice3 = new FileInputStream("./yatzyfinal/src/resources/dice3.png");
        FileInputStream dice4 = new FileInputStream("./yatzyfinal/src/resources/dice4.png");
        FileInputStream dice5 = new FileInputStream("./yatzyfinal/src/resources/dice5.png");
        FileInputStream dice6 = new FileInputStream("./yatzyfinal/src/resources/dice6.png");
        imageDice1 = new Image(dice1);
        imageDice2 = new Image(dice2);
        imageDice3 = new Image(dice3);
        imageDice4 = new Image(dice4);
        imageDice5 = new Image(dice5);
        imageDice6 = new Image(dice6);

        FileInputStream gif1 = new FileInputStream("./yatzyfinal//src/resources/gif1.gif");
        FileInputStream gif2 = new FileInputStream("./yatzyfinal//src/resources/gif2.gif");
        FileInputStream gif3 = new FileInputStream("./yatzyfinal//src/resources/gif3.gif");
        FileInputStream gif4 = new FileInputStream("./yatzyfinal//src/resources/gif4.gif");
        FileInputStream gif5 = new FileInputStream("./yatzyfinal//src/resources/gif5.gif");
        FileInputStream gif6 = new FileInputStream("./yatzyfinal//src/resources/gif6.gif");
        gifImage1 = new Image(gif1);
        gifImage2 = new Image(gif2);
        gifImage3 = new Image(gif3);
        gifImage4 = new Image(gif4);
        gifImage5 = new Image(gif5);
        gifImage6 = new Image(gif6);
    }
}
