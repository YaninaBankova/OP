package edu.smg;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon rp1 = new RegularPolygon();
		rp1.getPerimeter(rp1.getN(), rp1.getSideLength());
		rp1.getArea(rp1.getN(), rp1.getSideLength());
		System.out.println();
		
		RegularPolygon rp2 = new RegularPolygon();
		rp2.setN(6);
		rp2.setSideLength(4);
		rp2.getPerimeter(rp2.getN(), rp2.getSideLength());
		rp2.getArea(rp2.getN(), rp2.getSideLength());
		System.out.println();
		
		RegularPolygon rp3 = new RegularPolygon();
		rp3.setN(10);
		rp3.setSideLength(4);
		rp3.setX(5.6);
		rp3.setY(7.8);
		rp3.getPerimeter(rp3.getN(), rp3.getSideLength());
		rp3.getArea(rp3.getN(), rp3.getSideLength());
	}

}
