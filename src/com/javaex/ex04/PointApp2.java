package com.javaex.ex04;

public class PointApp2 {

	public static void main(String[] args) {
		
		Point2 x = new Point2();
		x.name = "x";
		x.num = 5;
		
		Point2 y = new Point2();
		y.name = "y";
		y.num = 5;
		
		Point2 x1 = new Point2();
		x1.name = "x";
		x1.num = 10;
		
		Point2 y1 = new Point2();
		y1.name = "y";
		y1.num = 23;
		
		System.out.println("점 [" + x.name +"=" + x.num +"," + y.name +"=" + y.num + "] 을 그렸습니다.");
		System.out.println("점 [" + x1.name +"=" + x1.num +"," + y1.name +"=" + y1.num + "] 을 그렸습니다.");
	}
}
