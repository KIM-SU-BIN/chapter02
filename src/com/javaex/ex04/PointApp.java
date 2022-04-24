package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);

		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		//다른 생성자 작성 후 기본(=디폴트)생성자 안쓰면 위에 두 개는 안돌아감.
		
		Point p3 = new Point(10, 20);
		
		//p4는 x값 생성자를 작성
		Point p4 = new Point(100);
		p4.setY(200);
		
		//y값을 먼저 넣고 setter x값을 넣는다.
		
		p1.draw();
		p2.draw();
		p3.draw();
		
	}

}
