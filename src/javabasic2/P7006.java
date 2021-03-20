package javabasic2;

import java.util.Scanner;

public class P7006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] arr = new int[input.length()];
		
		int i, r=0;
		for (i=0; i<input.length(); i++) {
			arr[i] = (int)input.charAt(i); //array of ascii code
		}
		
		for (int w : arr) {
			if (w >= 97 && w <= 109) { //from a to m
				r = 122 - (w - 97);
			} else if (w>= 110 && w <= 122) { //from n to z
				r = 97 + (122 - w);
			} else {
				System.out.println("error");
			}
			System.out.print((char)r); //casting ascii to char
		}
	}
}
