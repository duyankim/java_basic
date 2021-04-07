package javabasic2;

import java.util.Scanner;

public class P9L1 {

	public static void main(String[] args) {
		int i;
		i = 2;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (i < 10) {
			switch (i) {
			case 2 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 3 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 4 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 5 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 6 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 7 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 8 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			case 9 :
				System.out.printf("%dX%d=%d\n", n, i, i*n);
				break;
			}
			i++;
		} while (n < 1) {
			//입력받은 수가 1보다 작을 때는 switch문을 수행하지 않음
			System.out.println("error");
		}
	}
}
