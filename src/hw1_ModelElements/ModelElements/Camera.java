package hw1_ModelElements.ModelElements;

import hw1_ModelElements.Stuff.Angle3D;
import hw1_ModelElements.Stuff.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate (Angle3D angle){}

    public void Move (Point3D point3D){}
}
