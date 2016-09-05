/**
 * Assignment 4 Question 1: Design and implement three different classes: Polygon,
 * 							Cylinder, and Cone. Calculation of area and volume for Cylinder
 * 							and Cone using inheritance. 
 *   
 * Completion time: 40 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week4;

public class GRAY_A04Q01 {
  public static class Polygon {
  	protected double radius, height;
  	
  	public Polygon(double radius, double height) {
  		this.radius = radius;
  		this.height = height;
  	}
  	
  	// Getters
  	public double getRadius() {
  		return radius;
  	}
  	public double getHeight() {
  		return height;
  	}
  	
  	// Setters
  	public void setRadius(double r) {
  		this.radius = r;
  	}
  	public void setHeight(double h) {
  		this.height = h;
  	}
  }
  
  public static class Cylinder extends Polygon {  
    public Cylinder(double radius, double height) {
			super(radius, height);
		}

		public double getArea() {
    	double area =  (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
			return area;
    }
    
    public double getVolume() {
    	double volume = Math.PI * Math.pow(radius, 2) * height;
    	return volume;
    }
    
    public String toString() {
    	return "A cylinder of radius " + this.radius + ", " + "area " + getArea() + ", and volume " + getVolume();
    }
  }
  
  public static class Cone extends Polygon {
    public Cone(double radius, double height) {
    	super(radius, height);
    }
    
    public double getArea() {
    	double area = Math.PI * radius * (radius + Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2))));
    	return area;
    }
    
    public double getVolume() {
    	double volume = Math.PI * Math.pow(radius, 2) * (height / 3);
    	return volume;
    }
    
    public String toString() {
    	return "A cone of radius " + this.radius + ", " + "area " + getArea() + ", and volume " + getVolume();
    }
  }    
  
  public static void main(String[] args) {        
      Cylinder c1 = new Cylinder(5, 7);
      Cylinder c2 = new Cylinder(10, 28);
      Cone c3 = new Cone(5, 15);
      Cone c4 = new Cone(10, 15);
      
      display(c1, c2, c3, c4);
      
      c1.setRadius(6);
      c2.setRadius(11);
      c3.setRadius(6);
      c4.setRadius(11);
      
      display(c1, c2, c3, c4);
  }
  
  private static void display(Cylinder c1, Cylinder c2, Cone c3, Cone c4) {
  	Object[] array = new Object[]{c1, c2, c3, c4};
  	for (int i = 0; i < array.length; i++) {
  		System.out.println(array[i]);
  	}
	}
}
