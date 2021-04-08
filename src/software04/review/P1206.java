package hw0401;

import java.util.Arrays;
import java.util.Scanner;

public class P1206 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		double inputNum = sc.nextDouble();
		
		double temp, min;
		
		String[] arr = inputString.split(" ");
		// 입력받은 string을 array로 변환
		
		min = 100;
		
		for (int i=0; i < arr.length; i++) {
			//배열을 순회하면서 
			if (inputNum != Double.parseDouble(arr[i])) {
				//각 인덱스와 입력받은 값의 차이의 절대값을 구함 
				temp = Math.abs(inputNum - Double.parseDouble(arr[i]));
				//차이가 최소값보다 작은지 확인해서 최소값 바꿈
				min = min > temp ? Double.parseDouble(arr[i]) : min;
			}
		}
		System.out.println(min);
	}
}
