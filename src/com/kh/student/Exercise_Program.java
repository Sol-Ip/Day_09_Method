package com.kh.student;

import java.util.Scanner;

public class Exercise_Program {
	public static void main(String[] args) { // main => 메소드
		int[] scores = new int[3];

		End: while (true) { // 반복문
			// 메뉴 출력
			int choice = showMenu();
			switch (choice) { // 입력받은 값에 따라 보여줘야하는 것이 달라짐
			case 1:
				// 성적 입력
				insertScore(scores);
				break;
			case 2:
				// 성적 출력
				printScore(scores);
				break;
			case 3:
				break End;
			default:
				System.out.println("1부터 3까지의 숫자를 입력하세요.");
			}
		}
		System.out.println("종료 되었습니다.");
	}

	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}

	static void insertScore(int[] scores) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번째 학생의 성적 입력 : ");
			scores[i] = sc.nextInt();
		}
	}

	static void printScore(int[] scores) {
		System.out.println("<< 입력한 학생들의 성적>>");
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생의 성적 : " + scores[i]);

		}

	}

}
