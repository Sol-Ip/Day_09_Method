package com.kh.student;

import java.util.Scanner;

public class Exercise_Program_Origin {

	public static void main(String[] args) {
		int [] scores = new int[3];
		endGame :
		while(true) {
			// �޴����
			int choice = showMenu();
			switch(choice) {
			case 1 :
				// �����Է�
				insertScore(scores);
				break;
			case 2 : 
				// �������
				printScore(scores);
				break;
			case 3 :
				break endGame;
			default : System.out.println("1~3������ ���ڸ� �Է����ּ���.");
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}
	
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== �л� ���� ���� ���α׷� =======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");
		System.out.print("���� : ");
		int num = sc.nextInt();
		return num;
	}
	
	static void insertScore(int [] scores) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "��° �л��� ���� �Է� : ");
			scores[i] = sc.nextInt();
		}
	}
	
	static void printScore(int [] scores) {
		System.out.println("<<<< �Է��� �л����� ���� >>>>");
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "��° �л��� ���� : " + scores[i]);
		}
	}
	
}
