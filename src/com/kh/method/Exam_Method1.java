package com.kh.method;

public class Exam_Method1 {
	public static void main(String [] args) { //main 메소드 
		System.out.println(calcNum(1)); // 매개변수 있고 리턴 값 있을 경우 
		calcNumPrint(1); // 매개변수 있고 리턴 값 없을 경우 
		System.out.println(calcNum()); // 매개변수 없고 리턴 값 있을 경우
		calcNumPrint(); // 매개변수 없고 리턴 값 없을 경우
	}
	
	static int calcNum(int x) {  // - 반환형 O , 매개변수 X
		return 3*x+2;
	}
	
	static void calcNumPrint(int x) { // - 반환형 O , 매개변수 O
		System.out.println((3*x+2));
	}
	static int calcNum() { // - 반환형 O , 매개변수 X
		return 5;
	}
	static void calcNumPrint() { // - 반환형 X , 매개변수 X
		System.out.println(5);
	}
}
