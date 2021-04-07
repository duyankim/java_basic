package javabasic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P7007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> score = new ArrayList<>();
		int i = 0;

		try {
			while (i < 10) {
				String str = sc.nextLine();
				String[] arr = str.split(":");
				name.add(arr[0]);
				score.add(Integer.parseInt(arr[1]));
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			sortName(name);
			reverseSortName(name);
			sortScore(score);
			reverseSortScore(score);
		}
	}

	public static void sortName(List<String> arr) {
		Collections.sort(arr);
		System.out.println(arr);
	}

	public static void sortScore(List<Integer> arr) {
		Collections.sort(arr);
		System.out.println(arr);
	}

	public static void reverseSortName(List<String> arr) {
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
	}

	public static void reverseSortScore(List<Integer> arr) {
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
	}
}
