package javabasic2;

import java.util.Scanner;

public class P2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, k;
		while (true) {
			try {
				int n = Integer.parseInt(sc.nextLine());
				int[] arr = new int[n];

				// to use split method, input type String required
				String str = sc.nextLine();
				String[] strArr = str.split(" ");

				for (i = 0; i < strArr.length; i++) {
					k = Integer.parseInt(strArr[i]);
					arr[i] = k;
				}
				bubbleSort(arr, arr.length - 1);
				printArray(arr);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array index out of bounds");
			}
		}
	}

	private static void bubbleSort(int[] arr, int last) {
		if (last > 0) {
			// 배열의 갯수가 0보다 클 때
			for (int i = 1; i <= last; i++) {
				// 배열을 순회하면서
				if (arr[i - 1] > arr[i]) {
					// 바로 앞 인덱스가 해당 인덱스보다 클 경우
					swap(arr, i - 1, i);
					// 두 인덱스의 순서를 바꾼다
				}
			}
			bubbleSort(arr, last - 1);
			// 이미 정렬이 된 마지막 인덱스를 제외하고 다시 정렬한다
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
