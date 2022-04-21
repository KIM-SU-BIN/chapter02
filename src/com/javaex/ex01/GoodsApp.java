package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();                   //camera: 변수  Goods: 클래스
		camera.name = "니콘";
		camera.price = 400000;                            //int 못고침 String으로 하고싶으면 싹 갈아엎기! 즉, "400000"은 문자 String이라서 오류!
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		}

}
