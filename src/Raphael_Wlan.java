import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Raphael_Wlan extends GaugeBase {

    private int value = 0;

    public void redraw()
    {
        this.getChildren().clear();
        Rectangle border = new Rectangle();
        border.setX(0);
        border.setY(0);
        border.setWidth(380);
        border.setHeight(250);
        border.setArcWidth(10);
        border.setArcHeight(10);
        border.setStrokeWidth(3);
        border.setStroke(Color.BLACK);
        border.setFill(Color.TRANSPARENT);

        Text t = new Text("Schreib eine Zahl zwischen 0 und 100");
        t.setFont(Font.font ("Verdana", 15));
        t.setLayoutX(50);
        t.setLayoutY(235);
        t.setFill(Color.BLACK);

        int i = 15;

        Rectangle line1 = new Rectangle(30,50);
        line1.setX(10);
        line1.setY(10);
        line1.setArcWidth(10);
        line1.setArcHeight(10);
        line1.setFill(Color.DARKRED);

        Rectangle line2 = new Rectangle(30,i+line1.getHeight());
        line2.setX(45);
        line2.setY(10);
        line2.setArcWidth(10);
        line2.setArcHeight(10);
        line2.setFill(Color.DARKRED);

        Rectangle line3 = new Rectangle(30,i+line2.getHeight());
        line3.setX(80);
        line3.setY(10);
        line3.setArcWidth(10);
        line3.setArcHeight(10);
        line3.setFill(Color.DARKRED);

        Rectangle line4 = new Rectangle(30,i+line3.getHeight());
        line4.setX(115);
        line4.setY(10);
        line4.setArcWidth(10);
        line4.setArcHeight(10);
        line4.setFill(Color.YELLOW);

        Rectangle line5 = new Rectangle(30,i+line4.getHeight());
        line5.setX(150);
        line5.setY(10);
        line5.setArcWidth(10);
        line5.setArcHeight(10);
        line5.setFill(Color.YELLOW);

        Rectangle line6 = new Rectangle(30,i+line5.getHeight());
        line6.setX(185);
        line6.setY(10);
        line6.setArcWidth(10);
        line6.setArcHeight(10);
        line6.setFill(Color.YELLOW);

        Rectangle line7 = new Rectangle(30,i+line6.getHeight());
        line7.setX(220);
        line7.setY(10);
        line7.setArcWidth(10);
        line7.setArcHeight(10);
        line7.setFill(Color.GREEN);

        Rectangle line8 = new Rectangle(30,i+line7.getHeight());
        line8.setX(255);
        line8.setY(10);
        line8.setArcWidth(10);
        line8.setArcHeight(10);
        line8.setFill(Color.GREEN);

        Rectangle line9 = new Rectangle(30,i+line8.getHeight());
        line9.setX(290);
        line9.setY(10);
        line9.setArcWidth(10);
        line9.setArcHeight(10);
        line9.setFill(Color.GREEN);

        Rectangle line10 = new Rectangle(30,i+line9.getHeight());
        line10.setX(325);
        line10.setY(10);
        line10.setArcWidth(10);
        line10.setArcHeight(10);
        line10.setFill(Color.GREEN);

        double w = t.getLayoutBounds().getWidth();
        double h = t.getLayoutBounds().getHeight();

        this.getChildren().addAll(border, t);

        if (value <= 100 && value >= 0)
        {
            if (value >= 0 && value <= 10)
            {
                this.getChildren().addAll(line1);
            }

            if (value >= 11 && value <= 20)
            {
                this.getChildren().addAll(line1, line2);
            }

            if (value >= 21 && value <= 30)
            {
                this.getChildren().addAll(line1, line2, line3);
            }

            if (value >= 31 && value <= 40)
            {
                this.getChildren().addAll(line4, line1, line3, line2);
            }

            if (value >= 41 && value <= 50)
            {
                this.getChildren().addAll(line1, line2, line3, line4, line5);
            }

            if (value >= 51 && value <= 60)
            {
                this.getChildren().addAll(line1, line2, line3, line4, line5, line6);
            }

            if (value >= 61 && value <= 70)
            {
                this.getChildren().addAll(line1, line2, line3, line4, line5, line6, line7);
            }

            if (value >= 71 && value <= 80)
            {
                this.getChildren().addAll(line1, line2, line3, line4, line5, line6, line7, line8);
            }

            if (value >= 81 && value <= 90)
            {
                this.getChildren().addAll(line1, line2, line3, line4, line5, line6, line7
                        , line8, line9);
            }

            if (value >= 91 && value <= 100)
            {
                this.getChildren().addAll(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10);

            }
        }
    }

    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}