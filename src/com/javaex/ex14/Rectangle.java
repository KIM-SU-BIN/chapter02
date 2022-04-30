package com.javaex.ex14;

public class Rectangle { //1 => 필드 생성자 메소드 작성이 우선! 
	
	//필드
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
		
	
	//생성자
	public Rectangle() { 		
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	//메소드

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드-일반

	@Override
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	public void draw () {  //3
		System.out.println("[면색]" + fillColor + "선색" + lineColor );
		
	}
}
