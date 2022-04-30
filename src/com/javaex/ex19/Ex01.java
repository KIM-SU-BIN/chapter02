package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in); 
		
		double result; //어떠한 결과값
		int num;
		
		num = sc.nextInt();
		
		try {  											//지켜보다가 예외(상활) 발견되면 캐치! 
			result =100/num;
			
			System.out.println(result);
			
		}catch(ArithmeticException e) {		//예외 발생하면 작동되고 예외가 없으면 finally 로 감 (이걸 위해 작성하므로 생략 불가)
			System.out.println("0으로 나눌 수 없습니다.");
			
		} finally {			//생략가능
			System.out.println("finally영역");
		}	

		
		sc.close();
				
	
	
	}

}
