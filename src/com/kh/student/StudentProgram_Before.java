package com.kh.student;

import java.util.Scanner;

public class StudentProgram_Before { // 절차적 프로그래밍 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[3];
		int sum = 0;
		종료 : 
		while (true) {
			System.out.println("======= 학생 성적 관리 프로그램 =======");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();

			/*
			 * 아래 if 문으로 사용하게 되면 1,2,3 을 다 입력해야 동작이 되버림. if (choice == 1) { } else if
			 * (choice == 2) { } else if (choice == 3) { } else{ }
			 */

			switch (choice) {
			case 1:
				for (int i = 0; i < scores.length; i++) {
					do { // while(scores[i] <= 0 || scores[i] > 100) 으로 작성할 경우 () 의 값이 false가 됨
						System.out.print((i + 1) + "번째 학생의 성적 : ");
						scores[i] = sc.nextInt(); // 입력을 받은 후에 
						if (scores[i] < 0 || scores[i] > 100) {
							System.out.println("입력 범위를 벗어났습니다.");
						}
					} while (scores[i] < 0 || scores[i] > 100); //입력 범위 체크 후 반복 여부 결정
				}
				break;

			case 2:
				System.out.println("<<입력한 학생들의 성적>>");
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 성적 : " + scores[i]);
					sum += scores[i];
				}
				System.out.println("학생들의 성적 총 합계 : " + sum);
				System.out.printf("학생들의 평균 점수 : %.2f\n", (double) sum / scores.length);
				sum = 0; // 다시 입력했을 때 성적이 누적되지 않도록 함

				break;
			case 3:
				break 종료;

			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
		