package sw06;

public class Grade {

	public static void main(String[] args) {
		/* 메소드 오버로딩-성적표 2021-04-27 kopo03 김도연 */

		Calc2 k03_cal = new Calc2();

		System.out.printf("%d월 성적표\n", 3);
		System.out.printf("==========================================\n");
		System.out.printf("%-5s%s %s %s %s %s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("==========================================\n");
		System.out.printf("%-4s%4d %4d %4d %4d %.0f\n\n", "폴리융", 100, 100, 100, k03_cal.k03_sum(100, 100, 100),
				k03_cal.k03_ave(100, 100, 100));

		System.out.printf("%d월 성적표\n", 4);
		System.out.printf("==========================================\n");
		System.out.printf("%-5s%s %s %s %s %s %s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균");
		System.out.printf("==========================================\n");
		System.out.printf("%-4s%4d %4d %4d %4d %4d %.1f\n\n", "폴리융", 100, 100, 100, 100,
				k03_cal.k03_sum(100, 100, 100, 100), k03_cal.k03_ave(100, 100, 100, 100));

		System.out.printf("%d월 성적표\n", 5);
		System.out.printf("==========================================\n");
		System.out.printf("%-5s%s %s %s %s %s %s %s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
		System.out.printf("==========================================\n");
		System.out.printf("%-4s%4d %4d %4d %4d %4d %4d %.1f\n\n", "폴리융", 100, 100, 100, 100, 100,
				k03_cal.k03_sum(100, 100, 100, 100, 100), k03_cal.k03_ave(100, 100, 100, 100, 100));

	}

}
