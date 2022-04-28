package com.javaex.ex10;
//static 사전조사
public class GoodsApp {
	//필드
	//생성자
	//메소드
	//메소드-일반
	
	public static void main(String[] args) {
		// static 사전조사
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		
		Goods computer = new Goods("LG그램", 900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());

		
		/*
		Goods computer = new Goods();
		Goods cup = new Goods("머그컵", 2000);
		
		System.out.println(camera.toString());
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		*/

		
	}

}