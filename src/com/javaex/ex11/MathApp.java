package com.javaex.ex11;

public class MathApp {

	public static void main(String[] args) {
		
		/* 이렇게 쓰면 안됨!!
		  Math math =new Math(); 
		  System.out.println(math.plus(3, 2));
		 */
		
		System.out.println(Math.plus(3, 2));
		System.out.println(Math.plus(3.5, 2.2));
		//Math.circleaArea(5); // 스태틱에 올라가 있지 않기 때문에 오류
		System.out.println(Math.circleArea(5));
		
		
		
	}
}
