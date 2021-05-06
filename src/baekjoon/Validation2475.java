package baekjoon;

import java.util.Scanner;

public class Validation2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		
		for (int j = 0; j < 5; j++) {
			arr[j] = sc.nextInt();
			if (arr[j] != 0) {
				sum += (int)Math.pow(arr[j], 2);
			}
		}
		System.out.println(sum % 10);
	}

}
