package javabasic;

import java.util.Scanner;

public class HW1P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int count=0;

		for (int i=0; i<input.length(); i++) {
			
			if (input.charAt(i) == '0') {
				count++;
				//input의 인덱스 캐릭터 값이 '0'일때 갯수를 셈 
			}
		}
		System.out.println(count);
	}

}
