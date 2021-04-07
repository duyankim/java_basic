package javabasic2;

import java.util.Scanner;

public class P9Lesson1 {

	public static void main(String[] args) {
		int i, j;
		i = 0;
		j = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (i < n) {
			while (j < i + 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
