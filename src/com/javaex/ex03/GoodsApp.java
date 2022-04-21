/*﻿
1. 클래스 명
-----------------------------------------------------------------
2. 필드
3. 생성자
4. 매소드 - 겟터세터
5. 매소드 - 일반
﻿*/
//필드는 캡슐화 참고만 할 것(있지만 접근x) 읽기만 해야하면 get 읽기 set 읽기 + 쓰기 
 package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");  //메모리에 올라온  public void setName 사용
		camera.setPrice(400000);
		
		Goods computer= new Goods();
		computer.setName("LG그램");  //메모리에 올라온  public void setName 사용
		computer.setPrice(900000);
		
		Goods cup= new Goods();
		cup.setName("머그컵");  //메모리에 올라온  public void setName 사용
		cup.setPrice(2000);

		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		/*System.out.println("상품이름: " + camera.getName() + ", 가격: " + camera.getPrice());
		System.out.println("상품이름: " + computer.getName() + ", 가격: " + computer.getPrice());
		System.out.println("상품이름: " + cup.getName() + ", 가격: " + cup.getPrice());
		*/
		}

}
