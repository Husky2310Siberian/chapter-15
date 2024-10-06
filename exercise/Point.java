package gr.aueb.cf.ch15.exercise;

public class Point {

    private double x;

    public Point() {
    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public String convertToString () {
        return ("x = " +x);
    }


    public double getDistanceFromOrigin () {
        return (getX() - 0);
    }

}
