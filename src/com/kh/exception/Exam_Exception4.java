package com.kh.exception;

public class Exam_Exception4 {
	public static void main(String[] args) {
		// NumberFormatException
		// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		// "1234" -> Integer.parseInt("1234") => 1234
		// "3.14" -> Integer.parseInt("3.14") => NumberFormatException

		String[] strNumer = { "23", "12", "998" ,"3.14"};

		int i = 0; // try 안에서 사용된 변수는 try 가 끝나면 사라진다. try 밖에서 사용할 수 없다.
		try {
			for (i = 0; i < strNumer.length; i++) {
				int parseNum = Integer.parseInt(strNumer[i]);
				System.out.println("숫자로 변환된 값 : " + parseNum);
			}
		} catch (NumberFormatException ex) {
			System.out.println(strNumer[i] + "는 정수로 변환할 수 없습니다.");
		}

	}
}
