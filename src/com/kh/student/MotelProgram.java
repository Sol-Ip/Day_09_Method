package com.kh.student;

import java.util.Scanner;

public class MotelProgram {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] rooms = new int[10];
	
		End : while(true) {
			System.out.println("MOTEL ���� ���α׷�_v1.0");
			System.out.println("1.�Խ�   2.���   3.�� ����   4.����");
			System.out.print("�޴� �Է� : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("�� ���濡 �Խ��Ͻðڽ��ϱ�?");
				int select = sc.nextInt();
				if (rooms[select-1] == 0) {
					System.out.println((select) +"�� �濡 �Խ��ϼ̽��ϴ�.");
					rooms[select-1] = 1;
				} else {
					System.out.println((select) + "�� �濡�� ���� �մ��� �ֽ��ϴ�.");
				}
				break;
			case 2:
				System.out.println("�� ���濡 ����Ͻðڽ��ϱ�?");
				int selNum = sc.nextInt();
				if (rooms[selNum-1] == 1 ) { // ����Ϸ��� ���� �ִ��� ������ Ȯ��
					System.out.println(selNum +"�� �濡�� ����ϼ̽��ϴ�.");
					rooms[selNum-1]=0;
				} else {
					System.out.println(selNum + "�� ���� ���� �� ���Դϴ�.");
				}
				break; 
			case 3:
				for (int i=0; i<rooms.length; i++) {
					if (rooms[i] == 0) {
						System.out.println((i+1) + "�� ���� ���� ����ֽ��ϴ�.");
					} else {
						System.out.println((i+1) + "�� �濡�� ���� �մ��� �ֽ��ϴ�.");
					}
				}
				break;
			case 4:
				System.out.println("���� �Ǿ����ϴ�.");
				break End ;
				default : System.out.println("1 ~ 4 ������ ���ڸ� �Է����ּ���.");
			}
		}
		
	}
}
