package com.kh.method;

public class Exam_Method1 {
	public static void main(String [] args) { //main �޼ҵ� 
		System.out.println(calcNum(1)); // �Ű����� �ְ� ���� �� ���� ��� 
		calcNumPrint(1); // �Ű����� �ְ� ���� �� ���� ��� 
		System.out.println(calcNum()); // �Ű����� ���� ���� �� ���� ���
		calcNumPrint(); // �Ű����� ���� ���� �� ���� ���
	}
	
	static int calcNum(int x) {  // - ��ȯ�� O , �Ű����� X
		return 3*x+2;
	}
	
	static void calcNumPrint(int x) { // - ��ȯ�� O , �Ű����� O
		System.out.println((3*x+2));
	}
	static int calcNum() { // - ��ȯ�� O , �Ű����� X
		return 5;
	}
	static void calcNumPrint() { // - ��ȯ�� X , �Ű����� X
		System.out.println(5);
	}
}
