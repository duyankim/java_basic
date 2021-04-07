package javabasic2;

import java.util.Scanner;

public class Lesson2TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		String s;
		s = i % 2 == 0 ? "짝수" : "홀수";
		System.out.println(s);
	}
}
