package javabasic;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String word = sc.next();
		int count = 0;

		char[] wordArr = word.toCharArray();
		
		for (int i=0; i<text.length(); i++) {
			for (int j=0; j<word.length(); j++) {
				char w = word.charAt(i);
				
				if(wordArr[i] == word.charAt(i)) {
					count++;
					System.out.println(wordArr[i]);
				}
			}
		}
		System.out.println(count);
	}

}
