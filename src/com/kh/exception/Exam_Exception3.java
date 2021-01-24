package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception3 {
	public static void main(String[] args) {
		// InputMismatchException

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0;
		int num = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + ">>");

			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ��� !");
				sc.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ����
				i--; // �ε����� �������� �ʵ��� �̸� ���ҽ�Ŵ
				continue; // ���� ��Ʈ
			}

			sum += num;
		}
		System.out.println("���� " + sum);
	}
}
