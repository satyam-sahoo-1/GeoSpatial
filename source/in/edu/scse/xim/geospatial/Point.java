package in.edu.scse.xim.geospatial;
import java.lang.Math;

import java.lang.Math.*;

public class Point {
    // double Y1, Y2, X1, X2, Z1, Z2, W1, W2;
    double Y1, Y2, X1, X2;
    public Point(){

    }

    public Point(double Y1, double X1, double Y2, double X2){
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }

    public Point(double X1, double Y1){
        this.X1 = X1;
        this.Y1 = Y1;
    }

    double lon1 = 25;// Math.toRadians(X1);
    double lon2 = Math.toRadians(X2);
    double lat1 = Math.toRadians(Y1);
    double lat2 = Math.toRadians(Y2);

    double dlon = lon2 - lon1;
    double dlat = lat2 - lat1;

    public void per1(){
        System.out.println(lat1 + "hello");
        System.out.println(X1 + "World");
        System.out.println(lat2);
        System.out.println(lon2);
        System.out.println(dlon);
        System.out.println(dlat);
    }

    public double getDistance(){    // Haversine formula
        double a = Math.pow(Math.sin(dlat / 2), 2)
        + Math.cos(lat1) * Math.cos(lat2)
        * Math.pow(Math.sin(dlon / 2),2);
    
        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956 for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }

    public void getDistance(int n){
        System.out.println (
            Math.pow(Math.sin(dlat / 2), 2)
            + Math.cos(lat1) * Math.cos(lat2)
            * Math.pow(Math.sin(dlon / 2),2)
        );
        System.out.println(lat1);
        System.out.println(lon2);
        System.out.println(lat2);
        System.out.println(lon2);
        System.out.println(dlon);
        System.out.println(dlat);
    }


    /*
    // Point(double X1, double Y1, double X2, double Y2, double Z1, double Z2,double W1, double W2){
    //     this.X1  =X1;
    //     this.Y1 = Y1;
    //     this.X1  =X1;
    //     this.Y1 = Y1;
    //     this.Z1 = Z1;
    //     this.Z2 = Z2;
    //     this.W1 = W1;
    //     this.W2 = W2;
    // }

    // double getDistance(double X1, double Y1, double X2, double Y2){
    //     return (Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1)));
    // }

    double getDistance(){
        return (Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1)));
    }
    */
}
