package javabasic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class P7007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str="";
		
		ArrayList<String []> list = new ArrayList<String[]>();
		Iterator<String[]> iterator = list.iterator();
		
		String[] set = new String[2];
		
		for (int i=0; i<3; i++) {
			str = sc.nextLine();
			set = str.split(":");
			list.add(set);
			//name: score string to array and put in ArrayList
		}
		
		for (String[] n : list) {
			System.out.println(Arrays.toString(n));
		}
		System.out.println(Arrays.toString(list.get(0)[0]));

	}
}
