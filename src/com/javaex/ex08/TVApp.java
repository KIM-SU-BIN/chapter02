package com.javaex.ex08;

public class TVApp {

	public static void main(String[] args) {
	TV tv = new TV(7, 20, false); 
		tv.status();  
		// 초기값 끝
		
		tv.power(true);
		tv.volume(120); //볼륨은 status 쓰지 않으면 즉각적으로 결과 확인이 되지 않는데 맞는가?
		tv.status();
		
		tv.volume(false);	//false=>-1 현재 볼륨은 119
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.power(false);  //전원 off 
		//tv.status(); 사용하면 현재 채널, 볼륨까지 출력됨
		
		
	}

}
