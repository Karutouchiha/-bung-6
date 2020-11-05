import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Sarah_Battery extends GaugeBase {
    private int value = 0;

    @Override
    public void redraw(){
        this.getChildren().clear();
        Rectangle battery = new Rectangle();
        battery.setX(0);
        battery.setY(0);
        battery.setWidth(204);
        battery.setHeight(64);
        battery.setFill(Color.GRAY);

        Rectangle tip = new Rectangle();
        tip.setY(17);
        tip.setX(204-10);
        tip.setWidth(20);
        tip.setHeight(30);
        tip.setArcWidth(10);
        tip.setArcHeight(10);
        tip.setFill(Color.GRAY);
        this.getChildren().addAll(tip,battery);

        if (value>100) {
            value = 100;
        }
        for (int i=0; i<value; i++) {


            Rectangle bar = new Rectangle();
            bar.setX(2+20*(i/10));
            bar.setY(2);
            bar.setWidth(20);
            bar.setHeight(60);
            bar.setArcWidth(20);
            bar.setArcHeight(20);

            if (value==0){
                bar.setFill(Color.GRAY);
            }
            else if (value!=0 && value<=33){
                bar.setFill(Color.RED);
            }
            else if (33<value && value<=66){
                bar.setFill(Color.YELLOW);
            }
            else if (value>=66) {
                bar.setFill(Color.GREEN);
            }

            this.getChildren().addAll(bar);

        }

        Text t = new Text();
        t.setText(String.valueOf(this.value)+"%");
        t.setFont(Font.font ("Verdana", 20));
        t.setFill(Color.BLACK);


        t.setX(battery.getWidth()/2-10);
        t.setY(battery.getHeight()+20);

        this.getChildren().addAll(t);
    }
    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}
