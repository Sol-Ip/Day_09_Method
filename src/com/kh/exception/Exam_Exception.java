package com.kh.exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String []args) {
		// �ڹ��� ����ó��
		// 1. ������ ����
		// => ������ ���� �ʰ� �ۼ��� �ڵ� (;, ������ �ߺ�, ...)
		// => ������ �� �� �߰ߵ�
		// 2. ����
		// => �������̳� ����� �ǿ����� ��ĥ �� �ִ� ���� �� �߻��� ���� 
		//   ex) 0���� ���� ��
		//      �迭�� �ε������� ū ���Ҹ� �����Ϸ��� �� �� 
		//      �������� �ʴ� ������ �������� �� ��
		//      ���� �Է��� ��ٸ��� �ڵ尡 ����ǰ� �ִµ� ���ڰ� �Էµ� ��� 
		// => �ڹ� �ڵ� ���� ó�� ����

		Scanner sc = new Scanner(System.in);
		int num = 25;

		while(true) { // ����
		System.out.println("���� �ϳ� �Է����ּ��� : ");

		int input = sc.nextInt();
		try {			
			System.out.println(num + "��" + input + " ���� ������ ���� " + num / input + "�Դϴ�.");
			break;
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}		
		}
	}
}

	

