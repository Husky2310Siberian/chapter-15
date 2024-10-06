package gr.aueb.cf.ch15;

/**
 * Point2D extends Point
 * inherit get(x) and set(x), so it has access to private double x
 */
public class Point2D extends Point{
    /**
     * declare a new field
     */
    private double y;

    /**
     * class Point2D has his own constructor,
     * super() is a reference for the default constructor of super class (public class),
     * initialize his field
     */
    public Point2D () {
        super();
        y = 0;
    }

    /**
     * super(x) is overloaded constructor for Point2D and invokes the overloaded contractor of class Point
     * @param x
     * @param y
     */
    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * a. we can not declare different name method
     * b. no lower access modifier, from the super class we inherit
     * @return
     */
    @Override
    public String convertToString() {
        return "(" + getX() + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }
}
