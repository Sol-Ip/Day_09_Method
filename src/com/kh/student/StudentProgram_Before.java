package com.kh.student;

import java.util.Scanner;

public class StudentProgram_Before { // ������ ���α׷��� 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[3];
		int sum = 0;
		���� : 
		while (true) {
			System.out.println("======= �л� ���� ���� ���α׷� =======");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���");
			System.out.println("3. ���α׷� ����");
			System.out.print("���� : ");
			int choice = sc.nextInt();

			/*
			 * �Ʒ� if ������ ����ϰ� �Ǹ� 1,2,3 �� �� �Է��ؾ� ������ �ǹ���. if (choice == 1) { } else if
			 * (choice == 2) { } else if (choice == 3) { } else{ }
			 */

			switch (choice) {
			case 1:
				for (int i = 0; i < scores.length; i++) {
					do { // while(scores[i] <= 0 || scores[i] > 100) ���� �ۼ��� ��� () �� ���� false�� ��
						System.out.print((i + 1) + "��° �л��� ���� : ");
						scores[i] = sc.nextInt(); // �Է��� ���� �Ŀ� 
						if (scores[i] < 0 || scores[i] > 100) {
							System.out.println("�Է� ������ ������ϴ�.");
						}
					} while (scores[i] < 0 || scores[i] > 100); //�Է� ���� üũ �� �ݺ� ���� ����
				}
				break;

			case 2:
				System.out.println("<<�Է��� �л����� ����>>");
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "��° �л��� ���� : " + scores[i]);
					sum += scores[i];
				}
				System.out.println("�л����� ���� �� �հ� : " + sum);
				System.out.printf("�л����� ��� ���� : %.2f\n", (double) sum / scores.length);
				sum = 0; // �ٽ� �Է����� �� ������ �������� �ʵ��� ��

				break;
			case 3:
				break ����;

			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
		