package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class FindString1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int result = 1;

		if (str.equals("") || str.equals(" ")) {
			result = 0;
		} else {
			str = str.trim();
			
			for (int i = 0; i < str.length(); i++) {
				result = str.charAt(i) == ' ' ? result+=1 : result;
			}
		}
		
		System.out.println(result);
	}

}
