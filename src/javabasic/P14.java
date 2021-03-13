package javabasic;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String indexOfA="", vowel="";
		
		for (int i=1; i<input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'i'&& input.charAt(i-1) == ' ') {
				if (input.charAt(i-2) == 'a') {
					indexOfA = input.substring(0, i-2);
					vowel = input.substring(i-1);
				} 
			}
		}
		System.out.println(indexOfA + "an" + vowel);
	}

}
