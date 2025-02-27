package gr.aueb.cf.ch15.exercise;

public class Point3D extends Point2D{

    private double z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String convertToString () {
        return "(" + getX() + getY() + z + ")";
    }

    @Override
    public double getDistanceFromOrigin () {
        return (Math.sqrt((Math.pow(getX(),2) - (Math.pow(getY(),2)  -(Math.pow(z,2))))));
    }
}
