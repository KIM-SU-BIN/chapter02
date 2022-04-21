/*﻿
1. 클래스 명
-----------------------------------------------------------------
2. 필드
3. 생성자
4. 매소드 - 겟터세터
5. 매소드 - 일반
﻿*/
package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new  Goods();
		camera.name = "니콘";
		camera.price =  400000;
		
		Goods book = new  Goods();
		book.name = "﻿ LG그램";
		book.price =  900000;

		Goods cup = new  Goods();
		cup.name = "﻿ 머그컵";
		cup.price =  2000;	
		
		System.out.println("상품이름: " + camera.name + ", 가격: " + camera.price);
		System.out.println("상품이름: " + book.name + ", 가격: " + book.price);
		System.out.println("상품이름: " + cup.name + ", 가격: " + cup.price);

		}

}
