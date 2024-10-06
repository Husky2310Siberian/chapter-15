package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point p2 = new Point2D(3,5);
        Point p3 = new Point3D(5,8,9);

        //declare as (πραγματικέσ)parameters , any object from any derived class
        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        //invokes method movePlusOne of Point3D
       p3.movePlusOne();
       //sayHi () is not in hierarchy Point class and it is not overridable , (downcast)
        ((Point3D)p3).sayHi();

    }

    // declare as parameter the super class
    public static void  doMovePlus10 (Point point) {
        point.movePlus10();
    }
}
