import java.awt.*;

public class Shape {
   private Color color;
   private ShapeType shapeType;

    public int getFallTick() {
        return fallTick;
        //
    }

    public void setFallTick(int fallTick) {
        this.fallTick = fallTick;
    }

    //Used to determine current shape position
   private int fallTick = 1;
   private boolean isFalling;

    public Shape(Color color, ShapeType shapeType) {
        this.color = color;
        this.shapeType = shapeType;
    }

    public Color getColor() {
        return color;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public boolean isFalling() {
        return isFalling;
    }



}
