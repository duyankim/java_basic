package javabasic2;

import java.util.Scanner;

public class P8007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		n = sc.nextInt();
		
		try {
			String[] arr = new String[str.length()];
			arr = str.split(" ");
			
			for(String i : arr) {
				if(Double.parseDouble(i) % n == 0) {
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			System.out.println("please input single number");
		}
	}
}
