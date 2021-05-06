package baekjoon;

import java.util.Scanner;

public class Sequence1731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0, answer = 0;
		int[] num = new int[n];
		
		while (i < n) {
			num[i] = sc.nextInt();
			i++;
		}
		
		if (num[1] - num[0] == num[2] - num[1]) {
			answer = num[num.length-1] + num[1] - num[0];
		} else if (num[1] / num[0] == num[2] / num[1]) {
			answer = num[num.length-1] * (num[1] / num[0]);
		}
		System.out.println(answer);
	}

}
