/*Problem Statement : 
  Create an abstract class Figure with followiing properties and functions:

Properties:

	double dim1;

Methods:
	abstract void findArea();

	abstract void findPerimeter();

Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both 
the methods. Write a program that will find the area and perimeter of 3 Figures and print the details
for all.*/

package session5;

import java.util.Scanner;

public class Session5_1 {

	public static void main(String[] args) {
		// Takes the dimensions of the three figures from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the radius of the Circle in cm");
		double radius = scanner.nextDouble();

		Circle circle = new Circle();
		circle.setDim1(radius);
		circle.findArea();
		circle.findPerimeter();

		Triangle triangle = new Triangle();
		System.out.println("Please enter the length of first side of the triangle");
		triangle.setDim1(scanner.nextDouble());
		System.out.println("Please enter the length of second side of the triangle");
		triangle.setDim2(scanner.nextDouble());
		System.out.println("Please enter the length of third side of the triangle");
		triangle.setDim3(scanner.nextDouble());

		triangle.findArea();
		triangle.findPerimeter();

		Rectangle rectangle = new Rectangle();
		System.out.println("Please enter the length of the rectangle");
		rectangle.setDim1(scanner.nextDouble());

		System.out.println("Please enter the breadth of the rectangle");
		rectangle.setDim2(scanner.nextDouble());
		rectangle.findArea();
		rectangle.findPerimeter();
		scanner.close(); // good practice
	}
}

abstract class Figure {
	private double dim1, dim2, dim3;

	public double getDim3() {
		return dim3;
	}

	public void setDim3(double dim3) {
		this.dim3 = dim3;
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}

	public double getDim1() {
		return dim1;
	}

	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}

	abstract void findArea();

	abstract void findPerimeter();
}

class Rectangle extends Figure {

	@Override
	void findArea() {
		// Calculation of area of rectangle
		System.out.println("The area of the Rectangle is " + getDim1() * getDim2());

	}

	// Calculation of perimeter of rectangle
	@Override
	void findPerimeter() {

		System.out.println("The perimeter of the Rectangle is " + 2 * (getDim1() + getDim2()) + "\n");

	}

}

class Circle extends Figure {

	@Override
	void findArea() {
		// Calccualtion of area of circle
		System.out.println("The area of the circle is " + 3.14 * getDim1() * getDim1());
	}

	@Override
	void findPerimeter() {
		// Calculation of perimeter of circle
		System.out.println("The perimeter of the circle is " + 2 * 3.14 * getDim1() + "\n");
	}

}

class Triangle extends Figure {
	// calculation of area of triangle
	@Override
	void findArea() {

		float s = (float) ((getDim1() + getDim2() + getDim3()) / 2);
		float area = (float) Math.sqrt((s * (s - getDim1()) * (s - getDim2()) * (s - getDim3())));
		System.out.println("The area of the triangle is " + area);
	}

	@Override
	void findPerimeter() {
		// Calculation of Perimeter of triangle
		System.out.println("The perimeter of the triangle is " + (getDim1() + getDim2() + getDim3()) + "\n");

	}

}
