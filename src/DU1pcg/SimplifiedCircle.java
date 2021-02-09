package DU1pcg;



public class SimplifiedCircle {


    private double radius;

    public SimplifiedCircle()
    {
        radius = 1.0;
    }

    public SimplifiedCircle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    { 
        return radius; 
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * Math.sqrt(radius);
    }

    public double getCircumference() {

        return 2 * Math.PI * radius;  
    
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}