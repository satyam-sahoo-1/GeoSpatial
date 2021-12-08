import in.edu.scse.xim.geospatial.*;

import java.lang.Math;

class Test2 {
    public static void main(String[] args) {
        in.edu.scse.xim.geospatial.Rectangle r1 = new in.edu.scse.xim.geospatial.Rectangle(0,0, 5,0, 5,5, 0,5 );
        System.out.println(r1.hasArea());
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        // System.out.println(r1.getVolume());

        Point p1 = new Point(31, 25, 75, 60);
        // System.out.println(p1.getDistance());
        p1.per1();
        System.out.println(Math.toRadians(31));
    }
}
