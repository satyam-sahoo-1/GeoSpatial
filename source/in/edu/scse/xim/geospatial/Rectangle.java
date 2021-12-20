package in.edu.scse.xim.geospatial;

// public class Rectangle extends Point implements Shape{
public class Rectangle implements Shape{

    double a1,a2 , b1, b2, c1, c2, d1, d2;
    double length, width;
	double len,wid,area;
	
    public Rectangle(){

    }

    public Rectangle(Rectangle rect){

    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double a1, double a2, double b1, double b2, double c1, double c2,double d1, double d2){
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
        this.d1 = d1;
        this.d2 = d2;
    }

    /*
	public void getLength(){
        Point p1 = new Point(a1, a2, b1, b2);
        double len = p1.getDistance();
        System.out.println(len);
		
    }
    public void getWidth(){
        Point p2 = new Point(a1, a2, d1, d2);
        double wid = p2.getDistance();
        System.out.println(wid);
		
    }
	*/

	public double getLength(){
        // Point p1 = new Point(a1, a2, b1, b2);
        // return p1.getDistance2();

        return Distance.getDistance(a1, b1, a2, b2);
		
    }
    public double getWidth(){
        // Point p2 = new Point(a1, a2, d1, d2);
        // return p2.getDistance2();
		
        return Distance.getDistance(a1, d1, a2, d2);
    }
	public double getArea(){
        area = this.getLength()*this.getWidth();
        return(area);
    }
	
    public boolean hasArea(){
		if (area > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean equals(){    
        return true;
    }
    public double point(double x, double y){
        return 9;
    }
    
	public void display()
	{
		System.out.println("displaying...");
		
	}

}