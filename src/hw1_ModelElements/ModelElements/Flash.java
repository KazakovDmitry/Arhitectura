package hw1_ModelElements.ModelElements;

import hw1_ModelElements.Stuff.Angle3D;
import hw1_ModelElements.Stuff.Point3D;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate (Angle3D angle){}

    public void Move (Point3D point3D){}
}
