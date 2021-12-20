package in.edu.scse.xim.geospatial;
import java.lang.Math.*;

public class Point {
    // double Y1, Y2, X1, X2, Z1, Z2, W1, W2;
    // double y1, y2, x1, x2, z1, z2, w1, w2;
    double x1, y1;
    double temp, humidity;
    

	// public Point(double x1, double x2, double y1, double y2){
    //     this.x1  =x1;
    //     this.x2 = x2;
	// 	this.y1 = y1;
    //     this.y2 = y2;
    // }
	
	Point(){

    }
	
    public Point(double x1, double y1){
        this.x1 = x1;
        this.y1 = y1;
    }

    public Point(double x1, double y1, double temp, double humidity){
        this.x1 = x1;
        this.y1 = y1;
        this.temp = temp;
        this.humidity = humidity;
    }
	

    double lon1 = Math.toRadians(x1);
    double lat1 = Math.toRadians(y1);

    public double getDistance(Point p1){    // Haversine formula
        double lon2 = Math.toRadians(p1.x1);
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

    public void showData(){
        System.out.println("Cordinates : " + x1 + " , " + y1);
        System.out.println("Humidity : " + humidity);
        System.out.println("Temperature : " + temp +"degree");
    }
}