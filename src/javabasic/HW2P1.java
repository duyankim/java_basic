package javabasic;

import java.util.Scanner;

public class HW2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("#Menu");
			System.out.println("1. Encoder");
			System.out.println("2. Decoder");
			System.out.println("3. Exit");
			
			int menu = sc.nextInt();
			String input = sc.next();
			char result;
			
			if (menu == 1) {
				for (int i=0; i<input.length(); i++) {
					char index = input.charAt(i);
					result = (char) ((int)index + 49);
					System.out.print(result);
				}
			} else if (menu == 2) {
				for (int i=0; i<input.length(); i++) {
					char index = input.charAt(i);
					result = (char) ((int)index - 49);
					System.out.print(result);
				}
			} else if (menu == 3) {
				break;
			}
			System.out.println();
		}
	}

}
