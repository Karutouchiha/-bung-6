import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Lara_Battery extends GaugeBase
{
    private int width = 255;
    private int height = 80;
    private int value = 0;

    public void redraw()
    {
        this.getChildren().clear();

        Rectangle border = new Rectangle();
        border.setX(0);
        border.setY(0);
        border.setWidth(width);
        border.setHeight(height);
        border.setStrokeWidth(5);
        border.setStroke(Color.BLACK);
        border.setFill(Color.TRANSPARENT);

        Rectangle blue = new Rectangle();
        blue.setWidth(20);
        blue.setHeight(70);
        blue.setX(5);
        blue.setY(5);
        blue.setFill(Color.LIGHTSKYBLUE);

        Rectangle bluegreen = new Rectangle();
        bluegreen.setWidth(20);
        bluegreen.setHeight(70);
        bluegreen.setX(30);
        bluegreen.setY(5);
        bluegreen.setFill(Color.MEDIUMSPRINGGREEN);

        Rectangle green = new Rectangle();
        green.setWidth(20);
        green.setHeight(70);
        green.setX(55);
        green.setY(5);
        green.setFill(Color.CHARTREUSE);

        Rectangle greenyellow = new Rectangle();
        greenyellow.setWidth(20);
        greenyellow.setHeight(70);
        greenyellow.setX(80);
        greenyellow.setY(5);
        greenyellow.setFill(Color.GREENYELLOW);

        Rectangle yellow = new Rectangle();
        yellow.setWidth(20);
        yellow.setHeight(70);
        yellow.setX(105);
        yellow.setY(5);
        yellow.setFill(Color.YELLOW);

        Rectangle yelloworange = new Rectangle();
        yelloworange.setWidth(20);
        yelloworange.setHeight(70);
        yelloworange.setX(130);
        yelloworange.setY(5);
        yelloworange.setFill(Color.GOLD);

        Rectangle orange = new Rectangle();
        orange.setWidth(20);
        orange.setHeight(70);
        orange.setX(155);
        orange.setY(5);
        orange.setFill(Color.DARKORANGE);

        Rectangle orangered = new Rectangle();
        orangered.setWidth(20);
        orangered.setHeight(70);
        orangered.setX(180);
        orangered.setY(5);
        orangered.setFill(Color.ORANGERED);

        Rectangle red = new Rectangle();
        red.setWidth(20);
        red.setHeight(70);
        red.setX(205);
        red.setY(5);
        red.setFill(Color.RED);

        Rectangle redpurple = new Rectangle();
        redpurple.setWidth(20);
        redpurple.setHeight(70);
        redpurple.setX(230);
        redpurple.setY(5);
        redpurple.setFill(Color.FIREBRICK);

        Text txtE = new Text("Set a Value between 0 and 100! \n       To charge the battery!");
        txtE.setLayoutX(40);
        txtE.setLayoutY(100);
        this.getChildren().add(txtE);

        this.getChildren().add(border);

        if (value <= 100 && value >= 0)
        {
            if (value >= 0 && value <= 10)
            {
                this.getChildren().addAll(blue);
            }

            if (value >= 11 && value <= 20)
            {
                this.getChildren().addAll(blue, bluegreen);
            }

            if (value >= 21 && value <= 30)
            {
                this.getChildren().addAll(blue, bluegreen, green);
            }

            if (value >= 31 && value <= 40)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow);
            }

            if (value >= 41 && value <= 50)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow, yellow);
            }

            if (value >= 51 && value <= 60)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow, yellow, yelloworange);
            }

            if (value >= 61 && value <= 70)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow, yellow, yelloworange, orange);
            }

            if (value >= 71 && value <= 80)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow, yellow, yelloworange, orange
                        , orangered);
            }

            if (value >= 81 && value <= 90)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow, yellow, yelloworange, orange
                        , orangered, red);
            }

            if (value >= 91 && value <= 100)
            {
                this.getChildren().addAll(blue, bluegreen, green, greenyellow, yellow, yelloworange, orange
                        , orangered, red, redpurple);

            }
        }
    }
    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}
