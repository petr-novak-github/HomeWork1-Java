package DU1pcg;

public class Circle {
	
	private double radius;
	private String color;
	
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
		color = "red";
    }
	
		
	public Circle(double radius, String color) {
	
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		
		return radius*radius*Math.PI;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}	
	
	public void setColor(String newColor) {
		color = newColor;		
	}

	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]"; 
		
	}
	
	
}

