package software07;

import java.util.ArrayList;

public class Main01 {
	/* 클래스의 ArrayList 2021-04-28 kopo03 김도연 */
	
	static ArrayList<OneRec> ArrayOneRec = new ArrayList <OneRec>();
	
	static int sumKor = 0;
	static int sumEng = 0;
	static int sumMat = 0;
	static int sumSum = 0;
	static int sumAve = 0;
	static final int Person = 20;
	
	public static void dataSet() {
		for (int i = 0; i < Person; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			ArrayOneRec.add(new OneRec2(i, name, kor, eng, mat));
		}
	}
	
	public static void HeaderPrint() {
		System.out.printf("*********************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s  %2ss\n",
				"번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("*********************************\n");
	}
	
	public static void ItemPrint(int i) {
		OneRec rec;
		rec = ArrayOneRec.get(i);
		System.out.printf("%4d %4s %3d %3d %3d  %3d  %6.2f\n", 
				rec.student_id(), rec.name(), rec.kor(), rec.eng(), 
				rec.mat(), rec.sum(), rec.ave());
		sumKor += rec.kor();
		sumEng += rec.eng();
		sumMat += rec.mat();
		sumSum += rec.sum();
		sumAve += rec.ave();
	}
	
	public static void TailPrint() {
		System.out.printf("*********************************\n");
		System.out.printf("국어합계 %d  국어평균: %6.2f\n", sumKor / (double) ArrayOneRec.size());
		System.out.printf("영어합계 %d  영어평균: %6.2f\n", sumEng / (double) ArrayOneRec.size());
		System.out.printf("수학합계 %d  수학평균: %6.2f\n", sumMat / (double) ArrayOneRec.size());
		System.out.printf("*********************************\n");
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", sumAve / (double) ArrayOneRec.size());

	}
}