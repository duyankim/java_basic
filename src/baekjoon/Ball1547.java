package baekjoon;

import java.util.Scanner;

public class Ball1547 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int temp, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int j = 0, idx = 0, idx2 = 0;
		
		for (int i = 0; i < lines+1; i++) {
			String line = sc.nextLine();
			if (line != "") {
				num1 = Integer.parseInt(line.substring(0, 1));
				num2 = Integer.parseInt(line.substring(2));
				temp = num1;
				for (j = 0; j < arr.length; j++) {
					if (arr[j] == num1) idx = j;
					if (arr[j] == num2) idx2 = j;
				}
				arr[idx] = num2;
				arr[idx2] = temp;
			}
		}
		System.out.println(arr[0]);
	}
}
