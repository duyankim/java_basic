package javabasic2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = new String[str.length()];
		//make an array put the splited value

		arr = str.split(" ");
		
		Arrays.sort(arr,Collections.reverseOrder());
		//arrays.sort is ascending order, descending is reversed ascending
		
		for(String s : arr) {
			System.out.print(s+ " ");
			//print array
		}
	}	
}