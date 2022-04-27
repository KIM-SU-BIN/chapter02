package com.javaex.ex13;

public class ColorPoint extends Point {

	// 필드
	protected String color;

	// 생성자
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}

	// 메소드 -GS
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.print("color= "+this.color+", ");
		super.showInfo();
	}

}
