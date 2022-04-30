package com.javaex.ex16;

public class ShapeApp {
	
		public static void main(String[] args) {
			//배열
			//쉐입에 사각형이 안 담김(다른 종류이기 떄문) -> 즉 메모리에 올리고 쉐입인척하고 사용할 예정(사각형 원 삼각형 모두 다 그렇게 사용!)				
			Shape s = new Shape("빨강", "노랑");
			
			Rectangle r = new Rectangle ("빨강", "검정", 5 , 5);
			System.out.println(r.getWidth()); //자식의 메소드 사용 가능
					
			//메모리에는 자식 부모 다 올라가고, 부모쪽만 보인다.(#섞어쓰기)
			Shape sr = new Rectangle("빨강","검정", 15, 15);
			//System.out.println(r01.getWidth());  자식의 메소드를 사용할 수 없다.
			
			//Shape 배열에 모든 도형을 담아서 관리하고 싶다.
			
			//Shape 배열 생성
			Shape[] sArray = new Shape[6];
			
			//사각형 2개
			Shape r01 = new Rectangle("빨강","검정", 4 , 4);
			Shape r02 = new Rectangle("주황","검정", 5 , 5);
			
			//원2개
			Shape c01 = new Circle("노랑","검정", 6);
			Shape c02 = new Circle("초록","검정", 6);
						
			//삼각형 2개			
			Shape t01 = new Triangle("파랑","검정", 8, 8);
			Shape t02 = new Triangle("분홍","검정", 9, 9);
			
			//배열에 도형담기
			sArray[0] = r01;
			sArray[1] = r02;
			sArray[2] = c01;
			sArray[3] = c02;
			sArray[4] = t01;
			sArray[5] = t02;
			
			//System.out.println(r01.getWidth());
			//System.out.println(r01.toString());
			
			//배열 하나에 (하기 for문 하나로) 모든 도형을 관리 할 수 있다 -> 오늘 수업의 목표였음...
			for(int i=0; i<sArray.length; i++) {
				sArray [i].draw();
				System.out.println(sArray[i].area());
			}	
			
			//다운캐스팅 
			System.out.println(((Rectangle)sArray[0]).getWidth());
			
			for(int i=0; i<sArray.length; i++) {
				sArray[i].setLineColor("보라");
			}
			
			for(int i=0; i<sArray.length; i++) {
				sArray[i].draw();
			}
			
			
		}
	}