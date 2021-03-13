package javabasic2;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class P4007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word1 = sc.next();
		String word2 = sc.next();
		
		System.out.printf("1: %d%n", getSize(word1));
		System.out.printf("2: %d%n", getSize(word2));
		System.out.printf("3: %d%n", getSameChar(word1, word2));
		
	}
	
	public static int getSize(String input) {
		String[] arr = new String[input.length()];
		//make an array
		try {
			arr = input.split("");
			//split every single word
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		return arr.length;
	}
	
	public static int getSameChar(String word1, String word2) {
		HashSet<String> set1 = new HashSet<String>();
		// use HashSet for value overlap check
		char c;
		
		for (int i=0; i<word1.length(); i++) {
			for (int j=0; j<word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					//find char which is same in each word
					c = word1.charAt(i);
					set1.add(Character.toString(c));
					//change char to string to put it in HashSet 
				}
			}
		} 
		return set1.size();
	}
}S
