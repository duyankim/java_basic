package sw06;

public class k03_MethodTest {
	/* 변수와 메소드2 2021-04-27 kopo03 김도연 */
	static int k03_Static;

	public static void add(int k03_i) {
		k03_Static++;
		k03_i++;
		System.out.printf("add메소드에서->k03_Static=[%d]\n", k03_Static);
		System.out.printf("add메소드에서->i[%d]\n", k03_i);
	}
	
	public static int add2(int k03_i) {
		k03_Static++;
		k03_i++;
		System.out.printf("add2메소드에서->k03_Static=[%d]\n", k03_Static);
		System.out.printf("add2메소드에서->i[%d]\n", k03_i);
		return k03_i;
	}
	
	public static void main(String[] args) {
		int k03_Main;
		k03_Main = 1;
		k03_Static = 1;
		
		System.out.printf("******************************************\n");
		System.out.printf("메소드호출전 메인에서->k03_Satic=[%d]\n", k03_Static);
		System.out.printf("메소드호출전 메인에서->k03_Main=[%d]\n", k03_Main);
		System.out.printf("******************************************\n");
		add(k03_Main);
		
		System.out.printf("******************************************\n");
		System.out.printf("메소드호출후 메인에서->k03_Satic=[%d]\n", k03_Static);
		System.out.printf("메소드호출후 메인에서->k03_Main=[%d]\n", k03_Main);
		System.out.printf("******************************************\n");
		k03_Main = add2(k03_Main);
		
		System.out.printf("******************************************\n");
		System.out.printf("메소드 add2호출후 메인에서->k03_Satic=[%d]\n", k03_Static);
		System.out.printf("메소드 add2호출후 메인에서->k03_Main=[%d]\n", k03_Main);
		System.out.printf("******************************************\n");
	}
}
