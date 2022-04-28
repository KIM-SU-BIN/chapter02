package com.javaex.ex10;

public class Goods {
	
	//필드
	private String  name;
	private int price;
	private static int count;
	private int no;
	//static인 애들만 카운팅 되게 짤 예정임!!

	
	//생성자
	public Goods() {
		//로직
		this.no = count;
		this.count = count+1;
	}
		
	public Goods(String name, int price) {
		//추가로직
		this.name = name;
		this.price = price;
		this.no = count;
		this.count = count+1;  
		/*후자의 카운트는 필드의 int count의미함. +1은 앞집의 +1인데 어느 앞집인지 알 수 없으므로 잘못된 코드임.
		그러므로 count + 1은 스태틱에서 관리해야함. */
			}
	
	
	//메소드/GS
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


//메소드-일반

public void showInfo() {
	System.out.println("상품이름: " + name);
	System.out.println("가격: " + price);
	System.out.println("");
}

@Override
public String toString() {
	return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
}
}
