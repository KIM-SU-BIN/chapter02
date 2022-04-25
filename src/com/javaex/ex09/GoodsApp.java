package com.javaex.ex09;

import com.javaex.Ex06.Goods;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000); 			  // 1
		Goods computer = new Goods("LG그램", 900000);		 // 2
		Goods cup = new Goods("머그컵", 2000); 					 // 3

		Goods[] goodsArray = new Goods[3]; 						// 4 그러나 5,6,7, 네모칸 안의 데이터는 비어져있는 상태
		goodsArray[0] = camera;											// 카메라를 쓴 이유는 숫자 234,777 등을 쓰는데 번호는 우리가 알 수 없고 고유 이름만 알 수 있으므로 이름을 씀
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[1].toString()); 			//toString(메소드-일반)사용해서 가격 이름 한 번에 나오게 할 수 있음(이전에 한 것)
		System.out.println(goodsArray[2].getPrice());
		
		System.out.println("================");
		goodsArray[0].showInfo();
		goodsArray[1].showInfo();
		goodsArray[2].showInfo();
		System.out.println("================");
		
		//for문 사용
		for(int i = 0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
			}
		}
}
