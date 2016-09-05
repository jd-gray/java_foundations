/**
 * Assignment 3 Question 1: Sphere class that calculates the area and volume
 * 							then displays the created parameters. 
 *   
 * Completion time: 30 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week3;

public class GRAY_A03Q01 {
	public static class Sphere {
		private double radius;
		private String color;
		
		// Sphere constructor to initialize radius and color		
		public Sphere(double radius, String color) {
			this.radius = radius;
			this.color = color;
		}
		
		// Getter methods
		public double getArea() {
			double area = 4 * Math.PI * Math.pow(radius, 2);
			return area;
		}
		public double getVolume() {
			double volume = (4/3) * Math.PI * Math.pow(radius, 3);
			return volume;
		}
		public double getRadius() {
			return radius;
		}
		public String getColor() {
			return color;
		}
		
		// Setter methods
		public void setColor(String c) {
			this.color = c; 
		}
		public void setRadius(double h) {
			this.radius = h;
		}
		
		public String toString() {
			return "Sphere: Radius " + this.radius + " and the color is: " + this.color; 
		}
	}
	
	public static void main(String[] args) {
		// Creation of 4 Sphere objects
		Sphere s1 = new Sphere(1, "Black");
		Sphere s2 = new Sphere(2, "Blue");
		Sphere s3 = new Sphere(3, "Red");
		Sphere s4 = new Sphere(4, "Yellow");
		
		// Print objects which returns toString()
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
