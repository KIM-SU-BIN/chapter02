package com.javaex.ex18;

public abstract class Shape {
	

	// 필드
	protected String fillColor;
	protected String lineColor;

	// 생성자
	public Shape() {
		//System.out.println("Shape()");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		//System.out.println("Shape(2)");
	}

	// 메소드 gs
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


	// 메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	//
	//public abstract void draw();
	//추상클래서 예시 ;  부모 클래스이기 때문에 빈칸임.
	public abstract double area();
	
}

		// ShapeApp : sArray [0].draw();  사용시 필요함!
		//추상클래서 예시 ;  부모 클래스이기 때문에 빈칸임. 주석으로 막아둔 부분! ex16코드랑 비교
		//public abstract void draw();
		
		
		
		
