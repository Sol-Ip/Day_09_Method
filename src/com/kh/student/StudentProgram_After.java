package com.kh.student;

import java.util.Scanner;

public class StudentProgram_After { //구조적 프로그래밍
	
		// static int []scores = new int[3]; // 전역변수 <- 어느 메소드에서도 접근 가능 
		
		public static void main(String[] args) {
		
			int[] scores = new int[3];
		
			종료 : 
				while (true) {
				// F3 or ctrl + click
				// atl + ←
				int choice = showMenu();
	
				switch (choice) {
				
				case 1:
					insertScore(scores); //scores 를 선언 해줌 
					break;
	
				case 2:
					printScore(scores);
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
		
					static int showMenu() {						
						Scanner sc = new Scanner(System.in);
						System.out.println("======= 학생 성적 관리 프로그램 =======");
						System.out.println("1. 학생 성적 입력");
						System.out.println("2. 학생 성적 출력");
						System.out.println("3. 프로그램 종료");
						System.out.print("선택 : ");
						int choice = sc.nextInt();
						return choice;
	}
					
					static void insertScore(int[] scores) {		//배열인 scores를 선언 해줌 				
						Scanner sc = new Scanner(System.in);
						for (int i = 0; i < scores.length; i++) {
							do { // while(scores[i] < 0 || scores[i]>100) 으로 작성할 경우 () 의 값이 false가 됨
								System.out.print((i + 1) + "번째 학생의 성적 : ");
								scores[i] = sc.nextInt();
								if (scores[i] < 0 || scores[i] > 100) {
									System.out.println("입력 범위를 벗어났습니다.");
								}
							} while (scores[i] < 0 || scores[i] > 100);
						}
					}
					
					static void printScore(int[] scores) { 
	
						//int[] scores = new int[3]; === 지역 변수 
						int sum = 0; // 지역 변수 
						System.out.println("<<입력한 학생들의 성적>>");
						for (int i = 0; i < scores.length; i++) {
							System.out.println((i + 1) + "번째 학생의 성적 : " + scores[i]);
							sum += scores[i];
						}
						System.out.println("학생들의 성적 총 합계 : " + sum);
						System.out.printf("학생들의 평균 점수 : %.2f\n", (double) sum / scores.length);
						 sum = 0; // 다시 입력했을 때 성적이 누적되지 않도록 함
	
					}	
					
				}
				
				
	

				
				
			// ***** 메소드 *****
			// 메뉴출력 () {
			//System.out.println("======= 학생 성적 관리 프로그램 =======");
			//System.out.println("1. 학생 성적 입력");
			//System.out.println("2. 학생 성적 출력");
			//System.out.println("3. 프로그램 종료");
			//System.out.print("선택 : ");
			//int choice = sc.nextInt();
			//
			// }
			// 성적 입력 () {
			//	 System.out.println("======= 학생 성적 관리 프로그램 =======");
			//	 System.out.println("1. 학생 성적 입력");
			//	 System.out.println("2. 학생 성적 출력");
			//	 System.out.println("3. 프로그램 종료");
			//	 System.out.print("선택 : ");
			//	 int choice = sc.nextInt();
			// }
			// 성적 출력 () {
			//System.out.println("<<입력한 학생들의 성적>>");
			//for (int i = 0; i < scores.length; i++) {
			//	System.out.println((i + 1) + "번째 학생의 성적 : " + scores[i]);
			//	sum += scores[i];
			//}
			//System.out.println("학생들의 성적 총 합계 : " + sum);
			//System.out.printf("학생들의 평균 점수 : %.2f\n", (double) sum / scores.length);
			//sum = 0; // 다시 입력했을 때 성적이 누적되지 않도록 함
			//			// }