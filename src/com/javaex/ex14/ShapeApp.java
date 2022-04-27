package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		//배열생성
		Rectangle[] rArray = new Rectangle[2];
		Circle[] cArray =new Circle[2];
		Triangle[] tArray = new Triangle[2];
		
		//사각형 생성 - 2
		Rectangle r01 = new Rectangle ("빨강", "검정", 4, 4) ;		
		Rectangle r02 = new Rectangle ("빨강", "검정", 5, 5) ;
		
		//배열에 사각형 추가
		rArray[0]=r01;
		rArray[1]=r02;
		
		//for 문으로 돌릴 수 이씀!!
		//r01.draw();
		//r02.draw();
		
		//for문 만들기 전 처음 생성한 코드 ﻿↓↓↓
		//System.out.println(r01.toString());    ==>>  클래스 메소드 일반에 draw 생성하고 지우기!
		//System.out.println(r02.toString());
		
		//배열을 이용해서 전체 사각형 출력하기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
				
		//원 생성
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		
		//배열에 원 추가하기
		cArray[0] =c01;
		cArray[1] =c02;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
	
		
		//삼각형 생성
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		Triangle t02 = new Triangle("보라", "검정", 10, 10);
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw(); 
			}
		
	}
}
