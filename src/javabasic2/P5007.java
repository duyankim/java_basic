package javabasic2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P5007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String findVal = sc.next();
		int queue;
		
		try {
			String[] arr = new String[input.length()];
			arr = input.split(" ");
			//string to array
			Collections.reverse(Arrays.asList(arr));
			//to count index from the last index, make arr reversed
			
			queue = Arrays.asList(arr).indexOf(findVal)+1;
			//find the findVal index number and add 1
			System.out.println(queue);
		} catch (Exception e) {
			System.out.println("put wrong number");
		}
	}
}
