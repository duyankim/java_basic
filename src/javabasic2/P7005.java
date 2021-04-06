package javabasic2;

import java.util.Arrays;
import java.util.Scanner;

public class P7005 {

	public static void main(String[] args) {
		getRecord();


	}
	
	public static String[] getRecord() {
		Scanner sc = new Scanner(System.in);
		String[] record = new String[5];
		
		for (int i=0; i<5; i++) {
			String input = sc.nextLine();
			record[i] = input;
		}
		printRecords(record);
		
		return record;
	}
	
	public static void printRecords(String[] record) {
		int i=0;
		while (i < record.length) {
			System.out.printf(record[i]);
			System.out.print("\n");
			splitScore(record[i]);
			i++;
		}
	}
	
	public static void splitScore(String record) {
		int i=0;
		String[] score = record.split(", ");
		while (i < score.length) {
			System.out.println(score[i]);
			i++;
		}
	}

}
