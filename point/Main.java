package gr.aueb.cf.ch15.point;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(12);
        Point2D p2 = new Point2D(14,17);


        doPrint(p1);
        doPrint(p2);
    }

    /**
     * a. polymorphic method, takes an object is a Point
     * b. invokes point.toString with sout
     * @param point
     */
    public static void doPrint (Point point) {
        System.out.println(point);
    }
}
