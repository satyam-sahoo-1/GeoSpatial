package in.edu.scse.xim.geospatial;

public class Circle{
    // System.out.println("Circle");
	double x1,x2,y1,y2;
	
	public Circle(double x1, double x2, double y1, double y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
        this.y2 = y2;
	}

	Point center = new Point(x1, y1);
	Point oc = new Point(x2, y2);
	
    public void display(){
		System.out.println("Circle");
	}
	
	public double getRadius()	//applicable only for small distances
	{
		// Point p3 = new Point(x1,x2,y1,y2);
		// return p3.getDistance2();

		return(Distance.getDistance(center, oc));
	}
}
