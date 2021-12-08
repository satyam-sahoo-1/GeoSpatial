// package geospatial;

import in.edu.scse.xim.geospatial.*;

public class Test {
    public static void main(String[] args) {
        in.edu.scse.xim.geospatial.Rectangle r1 = new in.edu.scse.xim.geospatial.Rectangle(0,0, 5,0, 5,5, 0,5 );
        System.out.println(r1.hasArea());
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        // System.out.println(r1.getVolume());

        in.edu.scse.xim.geospatial.Point p1 = new in.edu.scse.xim.geospatial.Point(139.74477, 35.6544, 39.8261, 21.4225);
        System.out.println(p1.getDistance());
    }
}