package javabasic;

import java.util.Scanner;

public class Hw1P2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subjects, unit = 0;
		float total=0;
		String eachGrade = "";
		float grade = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("과목 수를 입력해주세요");
		subjects = sc.nextInt();
		
		System.out.println("과목당 점수를 입력해주세요");
		for (int i=0; i<subjects; i++) {
			unit = sc.nextInt();
			//각각의 unit을 저장하는 방법을 잘 모르겠습니다.
		}
		
		System.out.println("학점을 입력해주세요");
		for (int i=0; i<subjects; i++) {
			eachGrade = sc.next();		
		} 
		
		switch (eachGrade) {
		case "A+":
			grade = (float) 4.5;
			break;
		case "A0":
			grade = (float) 4.0;
			break;
		case "B+":
			grade = (float) 3.5;
			break;
		case "B0":
			grade = (float) 3.0;
			break;
		case "C+":
			grade = (float) 2.5;
			break;
		case "C0":
			grade = (float) 2.0;
			break;
		case "D+":
			grade = (float) 1.5;
			break;
		case "D0":
			grade = (float) 1.0;
			break;
		default:
			grade = 0;
			break;
		}
		total += grade * unit ;
		System.out.println(total / subjects);
	}
}
