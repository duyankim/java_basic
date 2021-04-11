package baekjoon;

import java.util.Scanner;

public class Star2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, m, j, k;

		for (i = 0; i < n - 1; i++) {
			for (m = 0; m <= i; m++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * n - 2 * m; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			for (k = 1; k < 2 * i + 1; k++) {
				System.out.print(" ");
			}
			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
