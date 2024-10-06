package gr.aueb.cf.ch15.immutable;

public final class immutablePoint3D {

    private final Point point;
    private final int z;


    public immutablePoint3D() {
        point = new Point();
        z = 0;
    }

    public immutablePoint3D(Point point, int z) {
        this.point = new Point(point.getX() , point.getY());
        this.z = z;
    }

    //returns a copy from this.point.getX(), so it is immutable
    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "immutablePoint3D{" +
                "point=" + point +
                ", z=" + z +
                '}';
    }
}








