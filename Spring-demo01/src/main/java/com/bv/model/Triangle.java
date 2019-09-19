package com.bv.model;

import java.util.List;

public class Triangle {
	private Point a,b,c;

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public void draw() {
		System.out.println("A"+a+"B"+b.toString()+"c"+c.toString());
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	/*List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for(Point point :points) {
			System.out.println(point.getX()+","+point.getY());
		}
	}
	*/
	
}
