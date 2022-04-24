package com.javaex.ex07;

public class Math {
	//필드
	
	//생성자
	//public Math() {}
	
	//매소드 - 필드가 없기 때문에 겟터세터도 없음!
	
	//매소드-일반
	public int plus(int a, int b) {  //정수+정수
		return a+b;
	}
	public double plus(double a, int b) {  //실수+정수
		return a+b;
	}
	public double plus(int a, double b) {  //정수+실수
		return a+b;
	}
	public double plus(Double a, Double b) {  //실수+실수
		return a+b;
	}


}
