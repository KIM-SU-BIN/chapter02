package com.javaex.ex03;

public class Goods {
	//필드
		private String name;
		private int price;
		
	//생성자
	//메소드 - gs
		public void setName(String n) {          //실제 진행되어야할 항목 기재  //void 기재할 항목이 없다는 뜻 원래int, double 이런식으로 들어가야함!
			name = n;
		}
		public void setPrice(int p) {  
			price = p;
		}
		
		public String getName() {
			return name;                    //return문 : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아감
		}
		public int getPrice() {
			return price;
		}

	//메소드 - 일반﻿
		public void showInfo() {
			System.out.println ("상품이름: " + name);
			System.out.println ("가격: " + price);
			System.out.println("");
		}
}
