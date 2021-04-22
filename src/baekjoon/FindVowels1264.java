package baekjoon;

import java.util.Scanner;

public class FindVowels1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		int count = 0;
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		while (!"#".equals(str)) {
			str = sc.nextLine();
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < vowels.length; j++) {
					if (str.charAt(i) == vowels[j]) {
						count++;
					}
				}
			}
			if (!"#".equals(str)) System.out.println(count);
			count = 0;
		} 
	}
}
