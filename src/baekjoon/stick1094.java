package baekjoon;

import java.util.Scanner;

public class stick1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int newStick = 0;
		
		while (X / 2 > 0) {
			newStick +=  X % 2;
			X /= 2;
		}
		if (X%2 == 1) newStick += 1;
		System.out.println(newStick);
	}

}
