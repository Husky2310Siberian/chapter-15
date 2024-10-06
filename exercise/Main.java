package gr.aueb.cf.ch15.exercise;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(5.5);
        Point2D p2 = new Point2D(5,3);
        Point3D p3 = new Point3D(5,4,-12);


        System.out.println("the distance of x " + " from origin " + " is " +p1.getDistanceFromOrigin());

        System.out.println();

        System.out.println("the distance of p2 : " + "(" +p2.getX() +" , "+ p2.getY() + ")"
                + " from origin is " +p2.getDistanceFromOrigin());


        System.out.println();

        System.out.println("the distance of p3 : " + "(" +p3.getX() +" , " +p3.getY() + " ," +p3.getZ() + ")"
                + " from origin is " +p3.getDistanceFromOrigin());







    }

}
