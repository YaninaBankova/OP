package edu.smg;

public class RegularPolygon {
	private int n;
	private double sideLength;
	private double x;
	private double y;
	RegularPolygon(){
		setN(3);
		setSideLength(1);
		setX(0);
		setY(0);
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	RegularPolygon(double sideLength){
		this.sideLength = sideLength;
		setX(0);
		setY(0);
	}
	RegularPolygon(double sideLength, double x, double y){
		this.sideLength = sideLength;
		setX(x);
		setY(y);
	}
	public void getPerimeter(int n, double sideLength) {
		System.out.println("The perimeter is " + (n * sideLength));
	}
	public void getArea(int n, double sideLength) {
		System.out.println("The area is " + ((n * sideLength * sideLength) / (4 * Math.tan(Math.PI / n))));
	}
}
