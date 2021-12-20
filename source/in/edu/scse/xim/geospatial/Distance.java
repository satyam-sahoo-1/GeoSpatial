package in.edu.scse.xim.geospatial;
import java.lang.Math.*;

public class Distance{
    double x1, y1, x2, y2;

    public Distance(double x1, double x2, double y1, double y2){
        this.x1  =x1;
        this.x2 = x2;
		this.y1 = y1;
        this.y2 = y2;
    }


    //find distance taking 2 Point objects as parameter
    public static double getDistance(Point p1, Point p2){    // Haversine formula
        double lon1 = Math.toRadians(p2.x1);
        double lon2 = Math.toRadians(p1.x1);
        double lat1 = Math.toRadians(p2.y1);
        double lat2 = Math.toRadians(p1.y1);

        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;

        double a = Math.pow(Math.sin(dlat / 2), 2)
        + Math.cos(lat1) * Math.cos(lat2)
        * Math.pow(Math.sin(dlon / 2),2);
    
        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956 for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }

    //find distance taking cordinates as parameter
    public static double getDistance(double x1, double y1, double x2, double y2){
        double lon1 = Math.toRadians(x1);
        double lon2 = Math.toRadians(x2);
        double lat1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(y2);

        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;

        double a = Math.pow(Math.sin(dlat / 2), 2)
        + Math.cos(lat1) * Math.cos(lat2)
        * Math.pow(Math.sin(dlon / 2),2);
    
        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956 for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }

    // Point p1 is the point to be checked
    boolean inRange(Point reference,Point p1, double range){
        if(Distance.getDistance(reference, p1) < range){
            return true;
        }
        else return false;
    }

    // returns the nearest neignbour out of the elements in given array
    public static double[] nearestNeighbour(Point r, double[][] loc){
        double [] arr = new double[loc.length];
        double max = Distance.getDistance(r.x1, loc[0][1], r.y1, loc[0][2]);
        double[] nearest = new double[3];   //[index, latitude, longitude]
        for(int i = 0; i<loc.length; i = i+2){
            arr[i] = Distance.getDistance(r.x1, loc[i][1], r.y1, loc[i][2]);
            if(max > arr[i]){
                max = arr[i];
                nearest[0] = i;
                nearest[1] = loc[i][0];
                nearest[2] = loc[i][1];
            }
        }
        return nearest;
    }

    public static double[] nearestNeighbour(Point r, Point[] loc){
        double [] arr = new double[loc.length];
        double max = Distance.getDistance(r.x1, r.y1, loc[0].x1, loc[0].y1);
        double[] nearest = new double[3];   //[index, latitude, longitude]
        for(int i = 0; i<loc.length; i = i+2){
            arr[i] = Distance.getDistance(r.x1, r.y1, loc[i].x1, loc[i].y1);
            if(max > arr[i]){
                max = arr[i];
                nearest[0] = i;
                nearest[1] = loc[i].x1;
                nearest[2] = loc[i].y1;
            }
        }
        return nearest;
    }
}