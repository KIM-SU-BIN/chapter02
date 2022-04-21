package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point ex = new Point();
		ex.setX(5);
		ex.setY(5);

		Point ex2 = new Point();
		ex2.setX(10);
		ex2.setY(23);

		ex.draw();
		ex2.draw();
	}

}
