package com.javaex.ex19;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray= new int[] {3, 6, 9};
		intArray[0] =3;
		intArray[1] =6;
		intArray[2] =9;
		
		try {
			System.out.println(intArray[3]);			//try문 없이 그냥 3으로 결과 추출하면 3번에 해당하는 방이 없기 때문에 오류
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어남");
			
		}finally {
			System.out.println("finally영역");
		}
		 
		for(int i=0; i<intArray.length; i++) {			//3, 6, 9 결과 추출
			System.out.println(intArray[i]);
		}
		
	
	}

}
