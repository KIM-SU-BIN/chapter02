package com.javaex.ex18;

public class Point implements Drawable {  //인터페이스를 구현(=상속)하다 implements
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("[x=" + x + "y=" + "]");
	}
	
	// [x=3, y=5] 점을 그렸습니다.
}
