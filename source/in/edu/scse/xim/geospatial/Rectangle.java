package in.edu.scse.xim.geospatial;

public class Rectangle extends Point implements Shape{

    static double x1, x2, x3, x4, y1, y2, y3, y4;
    static double length, width;

    public Rectangle(){

    }

    public Rectangle(Rectangle rect){
        length = rect.getLength();
        width = rect.getWidth();
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3,double x4, double y4){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;

        setLength();
        setWidth();
    }

    static void setLength(){
        Point p1 = new Point(x1, y1, x2, y2);
        length =  p1.getDistance();
    }

    static void setWidth(){
        Point p2 = new Point(x3, y3, x4, y4);
        width =  p2.getDistance();
    }

    void setLength(double l){
        length = l;
    }

    void setWidth(double w){
        width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    // public double getLength(){
    //     Point p1 = new Point(x1, y1, x2, y2);
    //     return p1.getDistance();
    // }
    // public double getWidth(){
    //     Point p2 = new Point(x3, y3, x4, y4);
    //     return p2.getDistance();
    // }

    public boolean hasArea(){
        if (length != 0  &&  width != 0){
            return true;
        }
        else return false;
    }

    public double getArea(){
        return(length * width);
    }

    public boolean equals(){
        return true;
    }

    public double point(double x, double y){
        return 0;
    }
    

}