package com.kh.student;

import java.util.Scanner;

public class Exercise_Program_Origin {

	public static void main(String[] args) {
		int [] scores = new int[3];
		endGame :
		while(true) {
			// 메뉴출력
			int choice = showMenu();
			switch(choice) {
			case 1 :
				// 성적입력
				insertScore(scores);
				break;
			case 2 : 
				// 성적출력
				printScore(scores);
				break;
			case 3 :
				break endGame;
			default : System.out.println("1~3사이의 숫자를 입력해주세요.");
			}
		}
		System.out.println("종료되었습니다.");
	}
	
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	static void insertScore(int [] scores) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번째 학생의 성적 입력 : ");
			scores[i] = sc.nextInt();
		}
	}
	
	static void printScore(int [] scores) {
		System.out.println("<<<< 입력한 학생들의 성적 >>>>");
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번째 학생의 성적 : " + scores[i]);
		}
	}
	
}
