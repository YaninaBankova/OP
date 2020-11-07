package edu.smg;

public class Fan {
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed;
	private boolean switchedOn;
	private double radius;
	private String color;
	
	public Fan() {
		setSpeed(SLOW);
		switchedOn = false;
		setRadius(5);
		setColor("blue");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean getSwitchedOn() {
		return switchedOn;
	}
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void toString(int getSpeed, double getRadius, boolean getSwitchedOn, String getColor) {
		if(getSwitchedOn) {
			System.out.println("  Speed: " + getSpeed + "\n  Color: " + getColor + "\n  Radius: " + getRadius);
		} else {
			System.out.println("  Color: " + getColor + "\n  Radius: " + getRadius + "\n  The fan is off.");
		}
	}
}
