package baekjoon;

import java.util.Scanner;

public class Palindrome1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			num = sc.nextInt();
			int length = String.valueOf(num).length();
			System.out.println(length);
			String answer = "";

			if ((length == 1 || length == 0) && num != 0) {
				answer = "yes";
			} else if (num == 0) {
				break;
			} else {
				for (int i = 0; i < length/2; i++) {
					if (String.valueOf(num).charAt(i) != String.valueOf(num).charAt(length-1-i)) {
						answer = "no";
						break;
					} else {
						answer = "yes";
					}
				}
			}
			System.out.println(answer);
		} while (num != 0);

	}

}
