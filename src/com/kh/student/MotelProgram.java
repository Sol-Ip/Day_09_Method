package com.kh.student;

import java.util.Scanner;

public class MotelProgram {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] rooms = new int[10];
	
		End : while(true) {
			System.out.println("MOTEL 관리 프로그램_v1.0");
			System.out.println("1.입실   2.퇴실   3.방 보기   4.종료");
			System.out.print("메뉴 입력 : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("몇 번방에 입실하시겠습니까?");
				int select = sc.nextInt();
				if (rooms[select-1] == 0) {
					System.out.println((select) +"번 방에 입실하셨습니다.");
					rooms[select-1] = 1;
				} else {
					System.out.println((select) + "번 방에는 현재 손님이 있습니다.");
				}
				break;
			case 2:
				System.out.println("몇 번방에 퇴실하시겠습니까?");
				int selNum = sc.nextInt();
				if (rooms[selNum-1] == 1 ) { // 퇴실하려는 방이 있는지 없는지 확인
					System.out.println(selNum +"번 방에서 퇴실하셨습니다.");
					rooms[selNum-1]=0;
				} else {
					System.out.println(selNum + "번 방은 현재 빈 방입니다.");
				}
				break; 
			case 3:
				for (int i=0; i<rooms.length; i++) {
					if (rooms[i] == 0) {
						System.out.println((i+1) + "번 방이 현재 비어있습니다.");
					} else {
						System.out.println((i+1) + "번 방에는 현재 손님이 있습니다.");
					}
				}
				break;
			case 4:
				System.out.println("종료 되었습니다.");
				break End ;
				default : System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
			}
		}
		
	}
}
