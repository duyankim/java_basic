package javabasic2;

import java.util.Scanner;

public class P9007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();

		try {
			String n = Integer.toBinaryString(m);
			//get base number
			System.out.println(n);
			
		} catch(Exception e) {
			System.out.println("please input more than 0");
		}
	}
}
S