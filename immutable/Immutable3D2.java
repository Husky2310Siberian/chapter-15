package gr.aueb.cf.ch15.immutable;

public final class Immutable3D2 {

    private final ImmutablePoint point;
    private final int z;

    public Immutable3D2() {
        this.point = new ImmutablePoint();
        this.z = 0;
    }

    //
    public Immutable3D2(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }

    //returns point which is immutable
    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }
}
