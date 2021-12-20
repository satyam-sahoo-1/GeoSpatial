package in.edu.scse.xim.geospatial;

public class Test {
    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(0,0, 5,0, 5,5, 0,5 );
        System.out.println(r2.hasArea());
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
      
	    System.out.println("Enter the coordinates of the area you want: ");
		
        Rectangle r3 = new Rectangle(0,0, 7,0, 7,5, 0,5 );
		System.out.println("area = " + r3.getArea());

		
        System.out.println(r3.hasArea());
        
		double recL = r3.getLength();
		System.out.println("The length of the rectangle is: " + recL);
		
        double recW = r3.getWidth();
		System.out.println("The width of the rectangle is: " + recW);
		
		double areaR = recL * recW;
		System.out.println("The Area within the rectangle formed: " + areaR);
		
		
		Circle cir = new Circle(0,0,5,7);
		cir.display();
		double cirD = cir.getRadius();
		System.out.println("The distance between two points: " + cirD);
		double areaC = Math.PI*cirD*cirD;
		System.out.println("The Area within the circle formed: " + areaC);
		
		
		
        // in.edu.scse.xim.geospatial.Point p1 = new in.edu.scse.xim.geospatial.Point(139.74477, 35.6544, 39.8261, 21.4225);
        // System.out.println("Then the distance is:" + p1.getDistance());

		Point p2 = new Point(139.74477, 39.8261);
		Point p3 = new Point(35.6544, 21.4225, 27, 35);
		System.out.println(Distance.getDistance(p3, p2));
		p3.showData();

		//nearest Neighbour
		Point p4 = new Point(40.32, 28.234);
		Point[] neighbour1 = {p2, p3, p4};
		double[] nearest1 = Distance.nearestNeighbour(p3, neighbour1);
		System.out.println(nearest1.length);
		for(int i = 0; i < nearest1.length; i++){
			System.out.print(nearest1[i] + "  ");
		}
		System.out.println();
    }
}