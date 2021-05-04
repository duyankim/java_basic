package baekjoon;

import java.util.Scanner;

public class Bird1568 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1, count = 0;
		while (N > 0) {
			if (N - i > 0) {
				N = N - i;
				i++;
				count++;
			} else if (N - i == 0) {
				N = N - i;
				count++;
			} else {
				i = 1;
			}
		}
		System.out.println(count);
	}
}
