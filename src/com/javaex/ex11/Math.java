package com.javaex.ex11;

public class Math {
	//필드
	private static double pi = 3.14;
	//생성자
	//매소드 - 필드가 없기 때문에 겟터세터도 없음!
	//매소드-일반
	public static int plus(int a, int b) {  //정수+정수
		int sum = a + b;
		return sum;
	}

	public static double plus(double a, double b) {  //실수+실수
		double sum = a + b;
		return sum;
	}
	public static double circleArea(int radius) {
		double area = radius*radius*pi;
		return area;
	}
	
}
