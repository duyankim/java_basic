package baekjoon;

import java.util.Scanner;

public class Quotient1834 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		long sum = 0, i = 1;
		
		if (input == 2) sum = 1;
		while (input != 2 && i < input ) {
			sum += i * input + i;
			i++;
		}
		System.out.println(sum);
	}

}
