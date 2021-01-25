package com.kh.exception;

public class Exam_Exception4 {
	public static void main(String[] args) {
		// NumberFormatException
		// ������ �ƴ� ���ڿ��� ������ ��ȯ�� �� ���� �߻�
		// "1234" -> Integer.parseInt("1234") => 1234
		// "3.14" -> Integer.parseInt("3.14") => NumberFormatException

		String[] strNumer = { "23", "12", "998" ,"3.14"};

		int i = 0; // try �ȿ��� ���� ������ try �� ������ �������. try �ۿ��� ����� �� ����.
		try {
			for (i = 0; i < strNumer.length; i++) {
				int parseNum = Integer.parseInt(strNumer[i]);
				System.out.println("���ڷ� ��ȯ�� �� : " + parseNum);
			}
		} catch (NumberFormatException ex) {
			System.out.println(strNumer[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}

	}
}
