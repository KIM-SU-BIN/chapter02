package com.javaex.ex04;

public class Point {

	// 필드
	private int x;
	private int y;

	
	// 생성자
	
	
	// 매소드-gs
	// 실제 진행되어야할 항목 기재 //void 기재할 항목이 없다는 뜻 원래int, double 이런식으로 들어가야함!
	public void setX(int num) { 	
		x = num;
	}
	public void setY(int nu) {
		y = nu;
	}
	public int getX() { // get 읽기
		return x; // return문 : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아감
	}
	public int getY() {
		return y;
	}

	
	// 매소드-일반
	public void draw() {
		System.out.println("점 [ x= " + x + "," + "y=" + y + "] 을 그렸습니다."); // x=__ y=__
	}
}
