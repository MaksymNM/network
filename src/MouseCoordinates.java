import java.awt.*;
import java.io.Serializable;

public class MouseCoordinates implements Serializable {
    public double x, y;

    public MouseCoordinates(){
        this.x = MouseInfo.getPointerInfo().getLocation().getX();
        this.y = MouseInfo.getPointerInfo().getLocation().getX();
    }
}
